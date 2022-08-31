package model.reservation;

import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;


import java.util.Random;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Reservation {
    @JsonProperty("name")
    private String firstName;

    @JsonProperty("surname")
    private String lastName;

    private String discount;
    private String flightDate;

    @JsonProperty("afrom")
    private String departureAirport;

    @JsonProperty("ato")
    private String arrivalAirport;

    @JsonProperty("seat")
    private int seatNumber;

    @JsonProperty("adults")
    private int adultsCount;

    @JsonProperty("children")
    private int childCount;

    @JsonProperty("bugs")
    private int bagCount;


    public Reservation() {
    }

    public Reservation(String firstName, String lastName, String discount, String flightDate,
                       String departureAirport, String arrivalAirport, int seatNumber,
                       int adultsCount, int childCount, int bagCount) {
        if (firstName.equals("random")) {


            //randomaizer mvn lang3 - pozvoljajet uprostit rabotu s generacijei dannoj, i luce rabotajet s trokami cem Java random.
            this.firstName = RandomStringUtils.randomAlphabetic(2, 10);
        } else {
            this.firstName = firstName;
        }

        this.firstName = firstName.equals("random") ? RandomStringUtils.randomAlphabetic(2, 10) : firstName;
        this.lastName = lastName.equals("random") ? RandomStringUtils.randomAlphabetic(2, 10) : lastName;
        this.discount = discount;

        this.flightDate = flightDate;
        this.departureAirport = departureAirport.equals("random") ? RandomStringUtils.randomAlphabetic(2, 10) : departureAirport;
        this.arrivalAirport = arrivalAirport.equals("random") ? RandomStringUtils.randomAlphabetic(2, 10) : arrivalAirport;
        this.seatNumber = seatNumber == 0 ? new Random().nextInt(10) : seatNumber;
        this.adultsCount = adultsCount == 0 ? RandomUtils.nextInt(1, 10) : adultsCount;
        this.childCount = childCount == 0 ? RandomUtils.nextInt(1, 10) : childCount;
        this.bagCount = bagCount == 0 ? RandomUtils.nextInt(1, 10) : bagCount;


    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public String getFlightDate() {
        return flightDate;
    }

    public void setFlightDate(String flightDate) {
        this.flightDate = flightDate;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public void setArrivalAirport(String arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public int getAdultsCount() {
        return adultsCount;
    }

    public void setAdultsCount(int adultsCount) {
        this.adultsCount = adultsCount;
    }

    public int getChildCount() {
        return childCount;
    }

    public void setChildCount(int childCount) {
        this.childCount = childCount;
    }

    public int getBagCount() {
        return bagCount;
    }

    public void setBagCount(int bagCount) {
        this.bagCount = bagCount;
    }
}
