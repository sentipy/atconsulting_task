package com.sentilabs.atconsulting.task.common.task;

import com.sentilabs.atconsulting.task.controller.Atct1;
import com.sentilabs.atconsulting.task.entity.Atct1Entity;

import javax.ejb.EJB;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonArrayBuilder;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by sentipy on 06/07/14.
 */
@Path("/get")
public class GetAtct {

    @EJB
    Atct1 atct1;

    @GET
    @Path("/all")
    public JsonArray getAll(){
        JsonArrayBuilder jsonArrayBuilder = Json.createArrayBuilder();
        for (Atct1Entity atct1Entity : atct1.getAll()) {
            jsonArrayBuilder.add(Json.createObjectBuilder()
                    .add("c1", atct1Entity.getColumn1())
                    .add("c2", atct1Entity.getColumn2()));
        }
        return jsonArrayBuilder.build();
    }

    @GET
    @Path("/all1")
    public String getAll1(){
        return "all1";
    }

    @GET
    @Path("/one")
    @Produces(MediaType.TEXT_PLAIN)
    public String getOne(){
        return "one";
    }

    @GET
    @Path("/all_json")
    @Produces(MediaType.TEXT_PLAIN)
    public String getAllJson(){
        return "all_json";
    }
}
