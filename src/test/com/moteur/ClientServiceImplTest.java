package test.com.moteur;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.model.AllocatedNumber;
import com.model.Client;
import com.moteur.ClientServiceImpl;

public class ClientServiceImplTest {
    private ClientServiceImpl clientService;

    @Before
    public void setUp() {
        clientService = new ClientServiceImpl();
    }

    @Test
    public void testAddClient() {
        Client client = new Client("John", "Doe", "Quad", "ABC123", "1234567890", "VIP", true, false, null);
        clientService.addClient(client);
        assertEquals(1, clientService.getAllClients().size());
    }

    @Test
    public void testFindClientByPlateNumber() {
        Client client = new Client("John", "Doe", "SSV", "ABC123", "1234567890", "VIP", true, false, null);
        clientService.addClient(client);
        Client foundClient = clientService.findClientByPlateNumber("ABC123");
        assertNotNull(foundClient);
        assertEquals("John", foundClient.getFirstName());
    }

    @Test
    public void testRegisterClientArrival() {
    Client client = new Client("John", "Doe", "Car", "ABC123", "1234567890", "VIP", true, false, null);
    clientService.addClient(client);
    AllocatedNumber allocatedNumber = new AllocatedNumber("Red", 1);
    clientService.registerClientArrival("ABC123", allocatedNumber);
    Client foundClient = clientService.findClientByPlateNumber("ABC123");
    assertNotNull(foundClient); // Vérifiez que foundClient n'est pas null
    assertEquals(allocatedNumber, foundClient.getAllocatedNumber());
}


    @Test
    public void testDuplicateAllocatedNumber() {
        Client client1 = new Client("John", "Doe", "Car", "ABC123", "1234567890", "VIP", true, false, null);
        Client client2 = new Client("Jane", "Smith", "Car", "XYZ789", "0987654321", "VIP", true, false, null);
        clientService.addClient(client1);
        clientService.addClient(client2);
        AllocatedNumber allocatedNumber = new AllocatedNumber("Red", 1);
        clientService.registerClientArrival("ABC123", allocatedNumber);
        assertTrue(clientService.isAllocatedNumberDuplicate(allocatedNumber));
    }
}
