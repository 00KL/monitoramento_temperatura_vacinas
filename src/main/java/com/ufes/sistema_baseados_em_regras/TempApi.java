package com.ufes.sistema_baseados_em_regras;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.fasterxml.jackson.databind.ObjectMapper;


public class TempApi {
	static String webService = "https://api-temp-umid.herokuapp.com/";
    static int codigoSucesso = 200;

    public static CamaraInfo buscarInfo() {
        try {
            URL url = new URL(webService);
            HttpURLConnection conexao = (HttpURLConnection) url.openConnection();
            conexao.setRequestMethod("GET");

            if (conexao.getResponseCode() != codigoSucesso)
                throw new RuntimeException("HTTP error code : " + conexao.getResponseCode());

            BufferedReader resposta = new BufferedReader(new InputStreamReader((conexao.getInputStream())));
            
            String output,json="";
			while ((output = resposta.readLine()) != null) {
				json+= output;
			}

            ObjectMapper mapper = new ObjectMapper();
            CamaraInfo retorno = mapper.readValue(json, CamaraInfo.class); 

            return retorno;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public static class CamaraInfo{
    	public CamaraInfo() {
		}

		String info;

		public String getInfo() {
			return info;
		}

		public void setInfo(String info) {
			this.info = info;
		}
		
		public float getTemp() {
			return Float.parseFloat(info.split(",")[0]);
		}
    }
}
