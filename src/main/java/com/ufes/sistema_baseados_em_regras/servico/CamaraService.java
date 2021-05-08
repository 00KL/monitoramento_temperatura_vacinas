package com.ufes.sistema_baseados_em_regras.servico;

import java.util.ArrayList;
import java.util.List;

import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.QueryResults;
import org.kie.api.runtime.rule.QueryResultsRow;

import com.ufes.sistema_baseados_em_regras.entidades.Camara;
import com.ufes.sistema_baseados_em_regras.entidades.eventos.RegistroTemperatura;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/camara")
public class CamaraService {
	
	public static KieSession kSession;

    @GET
    @Path("/{numCamara}/temperatura")
    @Produces(MediaType.APPLICATION_JSON)
    public List<RegistroTemperatura> getTemp(@PathParam("numCamara") String num){
	         
    	List<RegistroTemperatura> regs = new ArrayList<>();
	    	
    	QueryResults results = kSession.getQueryResults("retornaRegistrosTemperatura", num);
     	
     	//para cada objeto retornado pela query, adiciona no array
    	for ( QueryResultsRow row : results ) {

    		RegistroTemperatura reg = (RegistroTemperatura)row.get("reg");	
    		regs.add(reg);
       	
    	}
 	
        return regs;
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Camara> getCamaras(){
	         
    	List<Camara> regs = new ArrayList<>();
	    	
    	QueryResults results = kSession.getQueryResults("camaras");

     	//para cada objeto retornado pela query, adiciona no array
    	for ( QueryResultsRow row : results ) {

    		Camara reg = (Camara)row.get("cam");
    		regs.add(reg);
       	
    	}
    	
        return regs;
    }
}