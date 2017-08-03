package de.thb.rest;

import de.thb.repository.api.FachRepository;

import javax.inject.Inject;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObjectBuilder;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("fachs")
public class FachResource {
    @Inject
    FachRepository repo;

    @GET
    public JsonArray getFachs(){
        return repo.getAll().stream()
                .map(c ->
                        Json.createObjectBuilder()
                        .add("name", c.getName())
                        .add("kommentar", c.getKommentar())
                        .build())
                .collect(Json::createArrayBuilder
                        , JsonArrayBuilder::add
                        , JsonArrayBuilder::add)
                .build();
    }


}
