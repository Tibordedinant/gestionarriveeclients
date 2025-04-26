package com.controller;

import com.interfaces.ClientService;
import com.model.AllocatedNumber;
import com.model.Client;

public class ClientController {
    private ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    public void addClient(Client client) {
        clientService.addClient(client);
    }

    public void removeClient(Client client) {
        clientService.removeClient(client);
    }

    public void listAllClients() {
        for (Client client : clientService.getAllClients()) {
            System.out.println(client);
        }
    }

    public void findClientByPlateNumber(String plateNumber) {
        Client client = clientService.findClientByPlateNumber(plateNumber);
        if (client != null) {
            System.out.println(client);
        } else {
            System.out.println("Client not found");
        }
    }

    public void registerClientArrival(String plateNumber, AllocatedNumber allocatedNumber) {
        clientService.registerClientArrival(plateNumber, allocatedNumber);
    }
}
