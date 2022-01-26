package org.acndemo.statemachine.models;

import java.util.List;

import io.quarkus.mongodb.panache.PanacheMongoRepository;

public class StateMachineRepository implements PanacheMongoRepository<StateMachineRecord> {
    public List<StateMachineRecord> findAllStateMachineRecords() {
        return listAll();
    }

    public StateMachineRecord getClaim(String claimNumber) {
        return find("claimNumber", claimNumber).firstResult();
    }
}
