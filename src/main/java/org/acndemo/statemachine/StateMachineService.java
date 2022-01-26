package org.acndemo.statemachine;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.acndemo.statemachine.models.StateMachineRecord;
import org.acndemo.statemachine.models.StateMachineRepository;

@Path("/StateMachine")
@Produces(MediaType.APPLICATION_JSON)
public class StateMachineService {
    private StateMachineRepository repo;

    @Inject
    public StateMachineService(StateMachineRepository smrep) {
        this.repo = smrep;
    }

    @GET
    @Path("/{claimNumber}")
    public StateMachineRecord getStatus(@PathParam("claimNumber") String cno) {
        return repo.getClaim(cno);
    }
}
