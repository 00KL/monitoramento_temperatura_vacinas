package com.ufes.sistema_baseados_em_regras.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ufes.sistema_baseados_em_regras.entidades.eventos.RegistroTemperatura;

@Path("/temperaturas")
public class TemperaturasServices {
 
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public RegistroTemperatura getTemp(){
         
        RegistroTemperatura reg = new RegistroTemperatura(18);
        return reg;
    }
}