package com.example.madamkinza.assignment1_contactlist;
public class Contact {
    private int id;
    private int image;
    private String name;
    private String phone;
    private String gender;


    public Contact(int id, int image, String name, String phone, String gender) {
        this.id = id;
        this.image = image;
        this.name = name;
        this.phone = phone;
        this.gender = gender;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
