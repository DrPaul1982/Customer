package src.app;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Customer {
    private final String name;
    private final String phone;


    public Customer (String name, String phone){
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String currentTime = LocalDateTime.now().format(formatter);
        return "Customer: " + name + ", phone: " + phone + ", time: " + currentTime;
    }
}