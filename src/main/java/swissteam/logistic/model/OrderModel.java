package swissteam.logistic.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity(name = "orders")
public class OrderModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String text;
    private Date deliveryDate;
    private String origin;
    private String state;
    private String delivery;
    private String destination;
    private String recibes;
    private int phoneRecibes;
    private String bundle;
    private String missing;
    private String observations;
    private String deliveryObservations;
    private String logistic;
    private int usersId;

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDelivery() {
        return delivery;
    }

    public void setDelivery(String delivery) {
        this.delivery = delivery;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getRecibes() {
        return recibes;
    }

    public void setRecibes(String recibes) {
        this.recibes = recibes;
    }

    public int getPhoneRecibes() {
        return phoneRecibes;
    }

    public void setPhoneRecibes(int phoneRecibes) {
        this.phoneRecibes = phoneRecibes;
    }

    public String getBundle() {
        return bundle;
    }

    public void setBundle(String bundle) {
        this.bundle = bundle;
    }

    public String getMissing() {
        return missing;
    }

    public void setMissing(String missing) {
        this.missing = missing;
    }

    public String getObservations() {
        return observations;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }

    public String getDeliveryObservations() {
        return deliveryObservations;
    }

    public void setDeliveryObservations(String deliveryObservations) {
        this.deliveryObservations = deliveryObservations;
    }

    public String getLogistic() {
        return logistic;
    }

    public void setLogistic(String logistic) {
        this.logistic = logistic;
    }

    public int getUsersId() {
        return usersId;
    }

    public void setUsersId(int usersId) {
        this.usersId = usersId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
