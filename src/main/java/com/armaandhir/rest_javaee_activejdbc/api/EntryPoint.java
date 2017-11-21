package com.armaandhir.rest_javaee_activejdbc.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/")
public class EntryPoint
{
    @GET
    @Path("/")
    @Produces("text/html")
    public String index()
    {
        return "rest-javaee-activejdbc example";
    }

}
