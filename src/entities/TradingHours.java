package entities;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class TradingHours {
    private String day;
    private LocalDate date;
    private static LocalDateTime openTime;
    private static LocalDateTime closeTime;

    public TradingHours(String day, LocalDate date, LocalDateTime openTime, LocalDateTime closeTime) {
        this.day = day;
        this.date = date;
        this.openTime = openTime;
        this.closeTime = closeTime;
    }
    // configs
    // change trading time

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public static LocalDateTime getOpenTime() {
        return openTime;
    }

    public void setOpenTime(LocalDateTime openTime) {
        this.openTime = openTime;
    }

    public static LocalDateTime getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(LocalDateTime closeTime) {
        this.closeTime = closeTime;
    }
}
