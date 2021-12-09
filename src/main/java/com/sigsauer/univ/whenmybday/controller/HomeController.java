package com.sigsauer.univ.whenmybday.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/home")
public class HomeController {

    @GET
    public Response home() {
        return Response.ok("Hello Bro!").build();
    }
}
