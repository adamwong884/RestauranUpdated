package com.example.restaurant;

import java.util.ArrayList;

public class Restaurant {
    private String name;
    private String number;
    private String cuisine;
    private String rank;
    private String star;
    private String address;
    private String review;
    private String dish;
    private int imageDrawableId;

    public Restaurant(String name, String number, String cuisine, String rank, String address, String review, String star, String dish, int imageDrawableId){
        this.name = name;
        this.number = number;
        this.cuisine = cuisine;
        this.address = address;
        this.rank = rank;
        this.star = star;
        this.review = review;
        this.imageDrawableId = imageDrawableId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getStar(){
        return star;
    }

    public void setStar(String star) {
        this.star = star;
    }

    public String getCuisine() {
        return cuisine;
    }

    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public String getDish() {
        return dish;
    }

    public void setDish(String dish) {
        this.dish = dish;
    }

    public Integer getImageDrawableid(){
        return imageDrawableId;
    }
    public void setImageDrawableId(){
        this.imageDrawableId = imageDrawableId;
    }


    public static Restaurant getRestaurant(String id){
        for(Restaurant restaurant : getRest()){
            if(restaurant.getRank().equals(id)){
                return restaurant;
            }
        }
        return null;
    }

    @Override
    public String toString(){
        return rank;
    }

    public static ArrayList<Restaurant> getRest() {
        ArrayList<Restaurant> restaurants = new ArrayList<>();
        restaurants.add(new Restaurant("Jenny's Asian Kitchen", "02 9743 8823", "Asian", "#1", "11-13 Chester Hill Road, Chester Hill, Sydney", "Jenny's Asian Kitchen offers a " +
                "great variety of Asian dishes at very reasonable price points. The location is convenient to get to, situated right next to Chester Hill Station. The overall ambiance of the restaurant is very comfortable" +
                " and offers a home-like vibe. Extremely friendly staff who offer genuine recommendations, not just the most expensive dish on the menu! Very authentic Asian dishes :) My favourite would be the Sweet and Sour" +
                " Pork with a bowl of white rice.", "10/10", "Sweet and Sour Pork", R.drawable.jenny));
        restaurants.add(new Restaurant("Cho Cho San", "02 9331 6601", "Asian Fusion", "#2", "73 Macleay Street, Potts Point, Sydney", "Situated at Potts Point, Cho Cho San is an Asian Fusion restaurant that offers" +
                " a range of innovative dishes positioned in the nexus between a Chinese and Japanese cuisine. The minimalistic and aesthetic interiors featuring pink, white and natural beige undertones facilitates a very comfortable" +
                " and relaxing vibe, unlike other mid-tier dining restaurants that tend to have dark interiors and minimal lighting. My favourite dish would be the King Fish Sashimi and Miso Eggplant, as they were rich in flavour despite" +
                " being very basic foods. I would also recommend the Pumpkin Terriyaki Pancake as it delivers" +
                " the rich flavours of a traditional Chinese scallion pancake and a Japanese Okonomiyaki. Staff were also super friendly and prompt. Despite being a bit more on the pricey side for a standard meal, I would" +
                " definitely come again on a special occasion.", "9.5/10", "King Fish Sashimi", R.drawable.chochosan));

        return restaurants;

    }
}
