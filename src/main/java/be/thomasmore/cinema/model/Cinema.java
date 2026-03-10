package be.thomasmore.cinema.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Collection;
import java.util.Locale;

@Entity
public class Cinema {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String cinemaName;
    private String address;
    private String city;
    private Integer openingHour;
    private Integer closingHour;
    private String closingDay;

    public boolean cinemaOpen() {
        LocalDateTime now = LocalDateTime.now();
        int currentHour = now.getHour();
        String currentDay = now.getDayOfWeek().getDisplayName(TextStyle.FULL, new Locale("nl", "BE")); // takes the currentday in the dutch locale variant
        if (currentHour >= openingHour && currentHour < closingHour && !currentDay.equals(closingDay)) {
            return true;
        }
        return false;
    }

    @OneToMany(mappedBy = "cinema", fetch = FetchType.LAZY)
    private Collection<Room> rooms;

    //    Getters and Setters

    public void setOpeningHour(Integer openingHour) {
        this.openingHour = openingHour;
    }

    public void setClosingHour(Integer closingHour) {
        this.closingHour = closingHour;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCinemaName() {
        return cinemaName;
    }

    public void setCinemaName(String cinemaName) {
        this.cinemaName = cinemaName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getOpeningHour() {
        return openingHour;
    }

    public void setOpeningHour(int openingHour) {
        this.openingHour = openingHour;
    }

    public int getClosingHour() {
        return closingHour;
    }

    public void setClosingHour(int closingHour) {
        this.closingHour = closingHour;
    }

    public String getClosingDay() {
        return closingDay;
    }

    public void setClosingDay(String closingDay) {
        this.closingDay = closingDay;
    }

    public Collection<Room> getRooms() {
        return rooms;
    }

    public void setRooms(Collection<Room> rooms) {
        this.rooms = rooms;
    }
}
