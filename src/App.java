

import com.controller.ClientController;
import com.controller.EventController;
import com.model.AllocatedNumber;
import com.model.Client;
import com.model.Event;
import com.moteur.ClientServiceImpl;
import com.moteur.EventServiceImpl;

public class App {
    public static void main(String[] args) {
        ClientServiceImpl clientService = new ClientServiceImpl();
        EventServiceImpl eventService = new EventServiceImpl();

        ClientController clientController = new ClientController(clientService);
        EventController eventController = new EventController(eventService);

        // Ajouter des clients et des événements pour tester
        AllocatedNumber allocatedNumber1 = new AllocatedNumber("Red", 1);
        Client client1 = new Client("John", "Doe", "Car", "ABC123", "1234567890", "VIP", true, false, null);
        clientController.addClient(client1);

        // Enregistrer l'arrivée du client
        clientController.registerClientArrival("ABC123", allocatedNumber1);

        // Tester les doublons de dossard
        AllocatedNumber allocatedNumber2 = new AllocatedNumber("Red", 1);
        clientController.registerClientArrival("ABC123", allocatedNumber2); // Devrait afficher une erreur de doublon

        // Lister tous les clients
        clientController.listAllClients();

        // Ajouter un événement
        Event event = new Event("Car Rally", "2025-04-06", "Dinant");
        eventController.addEvent(event);

        // Lister tous les événements
        eventController.listAllEvents();

        // Trouver un événement par nom
        eventController.findEventByName("Car Rally");
    }
}
