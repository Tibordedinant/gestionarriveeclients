package test.com.model;
import java.util.Objects;

public class Client {

    private final String firstName;
    private final String lastName;
    private final String vehicleType;
    private final String plateNumber;
    private final String phoneNumber;
    private final String ticketType;
    private boolean paid;
    private boolean isPresent;
    private AllocatedNumber allocatedNumber;

    public Client(String firstName, String lastName, String vehicleType, String plateNumber, String phoneNumber, String ticketType, boolean paid, boolean isPresent, AllocatedNumber allocatedNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.vehicleType = vehicleType;
        this.plateNumber = plateNumber;
        this.phoneNumber = phoneNumber;
        this.ticketType = ticketType;
        this.paid = paid;
        this.isPresent = isPresent;
        this.allocatedNumber = allocatedNumber;
    }


    public String getFirstName() {
        return this.firstName;
    }


    public String getLastName() {
        return this.lastName;
    }


    public String getVehicleType() {
        return this.vehicleType;
    }


    public String getPlateNumber() {
        return this.plateNumber;
    }


    public String getPhoneNumber() {
        return this.phoneNumber;
    }


    public String getTicketType() {
        return this.ticketType;
    }


    public boolean isPaid() {
        return this.paid;
    }

    public boolean getPaid() {
        return this.paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    public boolean isIsPresent() {
        return this.isPresent;
    }

    public boolean getIsPresent() {
        return this.isPresent;
    }

    public void setIsPresent(boolean isPresent) {
        this.isPresent = isPresent;
    }

    public AllocatedNumber getAllocatedNumber() {
        return this.allocatedNumber;
    }

    public void setAllocatedNumber(AllocatedNumber allocatedNumber) {
        this.allocatedNumber = allocatedNumber;
    }

    public Client paid(boolean paid) {
        setPaid(paid);
        return this;
    }

    public Client isPresent(boolean isPresent) {
        setIsPresent(isPresent);
        return this;
    }

    public Client allocatedNumber(AllocatedNumber allocatedNumber) {
        setAllocatedNumber(allocatedNumber);
        return this;
    }

    public void registerArrival(AllocatedNumber allocatedNumber) {
        this.isPresent = true;
        this.allocatedNumber = allocatedNumber;
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Client)) {
            return false;
        }
        Client client = (Client) o;
        return Objects.equals(firstName, client.firstName) && Objects.equals(lastName, client.lastName) && Objects.equals(vehicleType, client.vehicleType) && Objects.equals(plateNumber, client.plateNumber) && Objects.equals(phoneNumber, client.phoneNumber) && Objects.equals(ticketType, client.ticketType) && paid == client.paid && isPresent == client.isPresent && Objects.equals(allocatedNumber, client.allocatedNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, vehicleType, plateNumber, phoneNumber, ticketType, paid, isPresent, allocatedNumber);
    }

    @Override
    public String toString() {
        return "{" +
            " firstName='" + getFirstName() + "'" +
            ", lastName='" + getLastName() + "'" +
            ", vehicleType='" + getVehicleType() + "'" +
            ", plateNumber='" + getPlateNumber() + "'" +
            ", phoneNumber='" + getPhoneNumber() + "'" +
            ", ticketType='" + getTicketType() + "'" +
            ", paid='" + isPaid() + "'" +
            ", isPresent='" + isIsPresent() + "'" +
            ", allocatedNumber='" + getAllocatedNumber() + "'" +
            "}";
    }
    
}
