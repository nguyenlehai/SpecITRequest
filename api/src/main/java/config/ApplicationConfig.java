package config;

import java.util.Set;
import javax.ws.rs.core.Application;

@javax.ws.rs.ApplicationPath("api")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(config.CORSFilter.class);
        resources.add(restadmin.EmployeesFacadeREST.class);
        resources.add(restadmin.TeamsFacadeREST.class);
        resources.add(restadmin.TicketAttributesFacadeREST.class);
        resources.add(restadmin.TicketThreadFacadeREST.class);
        resources.add(restadmin.TicketsFacadeREST.class);
        resources.add(restapi.CommentRest.class);
        resources.add(restapi.EmployeeRest.class);
        resources.add(restapi.LoginRest.class);
        resources.add(restapi.MeRest.class);
        resources.add(restapi.TicketRest.class);
    }
}
