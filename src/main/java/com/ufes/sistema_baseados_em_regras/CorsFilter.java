package com.ufes.sistema_baseados_em_regras;

import java.io.IOException;

import jakarta.ws.rs.container.ContainerRequestContext;
import jakarta.ws.rs.container.ContainerResponseContext;
import jakarta.ws.rs.container.ContainerResponseFilter;
import jakarta.ws.rs.ext.Provider;

@Provider
public class CorsFilter implements ContainerResponseFilter {

	@Override
	public void filter(ContainerRequestContext requestContext, ContainerResponseContext response)
			throws IOException {
		// TODO Auto-generated method stub
		response.getHeaders().add("Access-Control-Allow-Origin", "*");
		
	}

}
