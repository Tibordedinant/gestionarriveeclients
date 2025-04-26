package com.moteur;

import java.util.ArrayList;
import java.util.List;

import com.interfaces.ClientService;
import com.model.AllocatedNumber;
import com.model.Client;

public class ClientServiceImpl implements ClientService {
    private List<Client> clients = new ArrayList<>();

    @Override
    public void addClient(Client client) {
        clients.add(client);
    }

    @Override
    public void removeClient(Client client) {
        clients.remove(client);
    }

    @Override
    public List<Client> getAllClients() {
        return new ArrayList<>(clients);
    }

    @Override
    public Client findClientByPlateNumber(String plateNumber) {
        for (Client client : clients) {
            if (client.getPlateNumber().equals(plateNumber)) {
                return client;
            }
        }
        return null;
    }

    @Override
    public boolean isAllocatedNumberDuplicate(AllocatedNumber allocatedNumber) {
        for (Client client : clients) {
            if (client.getAllocatedNumber() != null && client.getAllocatedNumber().equals(allocatedNumber)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void registerClientArrival(String plateNumber, AllocatedNumber allocatedNumber) {
        Client client = findClientByPlateNumber(plateNumber);
        if (client != null) {
            if (!isAllocatedNumberDuplicate(allocatedNumber)) {
                client.registerArrival(allocatedNumber);
                System.out.println("Client arrival registered: " + client);
            } else {
                System.out.println("Error: Duplicate allocated number");
            }
        } else {
            System.out.println("Client not found");
        }
    }
}
