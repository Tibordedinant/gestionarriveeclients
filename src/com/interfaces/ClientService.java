
package com.interfaces;

import java.util.List;

import com.model.AllocatedNumber;
import com.model.Client;

public interface ClientService {
    void addClient(Client client);
    void removeClient(Client client);
    List<Client> getAllClients();
    Client findClientByPlateNumber(String plateNumber);
    boolean isAllocatedNumberDuplicate(AllocatedNumber allocatedNumber);
    void registerClientArrival(String plateNumber, AllocatedNumber allocatedNumber);
}

