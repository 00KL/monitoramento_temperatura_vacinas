package com.ufes.sistema_baseados_em_regras.servico;

import java.util.ArrayList;
import java.util.List;

import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.QueryResults;
import org.kie.api.runtime.rule.QueryResultsRow;

import com.ufes.sistema_baseados_em_regras.entidades.eventos.RegUrgencia;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/registro")
public class RegService {
	public static KieSession kSession;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/urgencia")
    public List<RegUrgencia> getTemp(){
	         
    	List<RegUrgencia> regs = new ArrayList<>();
	    	
    	QueryResults results = kSession.getQueryResults("alertaUrgente");
     	
     	//para cada objeto retornado pela query, adiciona no array
    	for ( QueryResultsRow row : results ) {
    
    		System.out.println("m a m a q");
    		RegUrgencia reg = (RegUrgencia)row.get("reg");	
    		regs.add(reg);
       	
    	}
 	
        return regs;
    }
}
