package org.acme;

import jakarta.inject.Inject;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Query;

import java.util.List;

@GraphQLApi
public class SitcomResource {

    @Inject
    SitcomService service;

    @Query("allSitcoms")
    @Description("Get all Sitcoms")
    public List<Sitcom> getAllSitcoms() {
        return service.getAllSitcoms();
    }
}
