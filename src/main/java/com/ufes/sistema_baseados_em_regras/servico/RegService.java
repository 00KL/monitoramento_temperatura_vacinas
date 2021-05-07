package com.ufes.sistema_baseados_em_regras.servico;

import java.util.ArrayList;
import java.util.List;

import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.QueryResults;
import org.kie.api.runtime.rule.QueryResultsRow;

import com.ufes.sistema_baseados_em_regras.entidades.eventos.RegDefeito;
import com.ufes.sistema_baseados_em_regras.entidades.eventos.RegTempPerigo;
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
    public List<RegUrgencia> getUrgencia(){
	         
    	List<RegUrgencia> regs = new ArrayList<>();
	    	
    	QueryResults results = kSession.getQueryResults("alertaUrgente");
     	
     	//para cada objeto retornado pela query, adiciona no array
    	for ( QueryResultsRow row : results ) {
    
    		RegUrgencia reg = (RegUrgencia)row.get("reg");	
    		regs.add(reg);
       	
    	}
 	
        return regs;
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/urgencia/finalizado")
    public List<RegUrgencia> getUrgenciaFinalizado(){
	         
    	List<RegUrgencia> regs = new ArrayList<>();
	    	
    	QueryResults results = kSession.getQueryResults("alertaUrgenteFinalizado");
     	
     	//para cada objeto retornado pela query, adiciona no array
    	for ( QueryResultsRow row : results ) {
    
    		RegUrgencia reg = (RegUrgencia)row.get("reg");	
    		regs.add(reg);
       	
    	}
 	
        return regs;
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/urgencia/descartado")
    public List<RegUrgencia> getDescartado(){
	         
    	List<RegUrgencia> regs = new ArrayList<>();
	    	
    	QueryResults results = kSession.getQueryResults("alertaDescarte");
     	
     	//para cada objeto retornado pela query, adiciona no array
    	for ( QueryResultsRow row : results ) {
    
    		RegUrgencia reg = (RegUrgencia)row.get("reg");	
    		regs.add(reg);
       	
    	}
 	
        return regs;
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/perigo")
    public List<RegTempPerigo> getPerigo(){
	         
    	List<RegTempPerigo> regs = new ArrayList<>();
	    	
    	QueryResults results = kSession.getQueryResults("pergiosTemperatura");
     	
     	//para cada objeto retornado pela query, adiciona no array
    	for ( QueryResultsRow row : results ) {
    
    		RegTempPerigo reg = (RegTempPerigo)row.get("reg");	
    		regs.add(reg);
       	
    	}
 	
        return regs;
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/defeito")
    public List<RegDefeito> getDefeito(){
	         
    	List<RegDefeito> regs = new ArrayList<>();
	    	
    	QueryResults results = kSession.getQueryResults("alertaDefeito");
     	
     	//para cada objeto retornado pela query, adiciona no array
    	for ( QueryResultsRow row : results ) {
    
    		RegDefeito reg = (RegDefeito)row.get("reg");	
    		regs.add(reg);
       	
    	}
 	
        return regs;
    }
}
