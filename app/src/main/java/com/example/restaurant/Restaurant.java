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
        this.dish = dish;
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
        restaurants.add(new Restaurant("Memory Tongue", "02 9261 3341", "Asian", "#3", "G2/88 Liverpool Street, CBD, Sydney", "Memory Tongue is in a prime position above Chatswood Station which makes it easy to get to and easy to meet at! The Memory Tongue menu can seem quite overwhelming and some menu items can get lost in translation but nonetheless there are enough that are translated correctly to get by. Overall there is a great selection on the menu and not forgetting the sauce bar – although missing a few of my favourite condiments, it’s good enough to make a delicious sauce!.", "9/10", "Adult Set Menu $55pp", R.drawable.memorytongue));
        restaurants.add(new Restaurant("Kid Kyoto", "02 9241 1991", "Japanese", "#4", "17-19 Bridge Street, CBD, Sydney", "The food came out at such a good pace despite how busy the restaurant was. The waiters were very attentive and the food was delicious. Unfortunately they ran out of the main wagyu dish so will be back to try that!", "9/10", "Salmon Sashimi, Corn Ribs, Takoyaki Croquette", R.drawable.kidkyoto));
        restaurants.add(new Restaurant("Quay", "02 9251 5600", "Australian", "#5", "Upper Level, Overseas Passenger Terminal 5 Hickson Road, Circular Quay, Sydney", "Over the years, Peter Gilmore has transformed Quay into an iconic institution that prides itself on exceptional dining experience based supported by local delicacies. His deep passion in seafood and fresh produce have led to countless legendary dishes that have formed part of Quay's iconic journey. Service at Quay is five star, matched by the quality of dishes and the quality of pairing - be it, wine pairing or temperance (non-alcoholic) pairing. Choose between your traditional 3 course meal, 6 tasting course or 10 degustation course. If you've never been to Quay, give it a go for it will leave you with many fond memories.", "8.5/10", "Adult Set Menu $265", R.drawable.quay));
        restaurants.add(new Restaurant("Taste of Shanghai", "02 9261 8832", "Shanghai", "#6", "Shop 9.07, World Square Shopping Centre, 644 George Street, CBD, Sydney", "A taste of shanghai. This restaurant offers nice Shanghai style cuisine. If you're crazy about Xiaolongbao or Pork bun, it is the right place to go.", "8.5/10", "Sliced Pork Skank in Garlic Sauce", R.drawable.tasteofsh));
        restaurants.add(new Restaurant("Holy Basil", "02 9299 3080", "Thai", "#7", "The Canteen, Tower Two International Towers Sydney, 200 Barangaroo Avenue, Barangaroo, Sydney", "One of the best Thai restaurants in Sydney. I love the Thai Fried Rice here. It usually has a nice smoky flavour and tastes amazing with the chilli saté sauce provided. I would advise against picking the dishes on display in the window as I have found that the quality and taste of the food is much worse than if you were to order a dish off the menu. This works out to be a bit more costly but is definitely worth the few extra bucks if you are after quality.", "8/10", "Thai Fried Rice with Tom Yum Sauce", R.drawable.holybasil));
        restaurants.add(new Restaurant("Time 4 Thai", "02 9984 8232", "Thai", "#8", "2/309 Anzac Parade, Kingsford NSW 2032", "Time 4 Thai at Randwick is one of my favourite spots to grab a quick dinner or lunch when I'm on campus at UNSW. Their staff are super friendly and offer split bills which is great when eating out with friends. My favourite would be the Tom Yum Fried Rice because they give really large proportions for the $15 you pay.", "8/10", "Thai Fried Rice with Tom Yum Sauce", R.drawable.t4t));
        restaurants.add(new Restaurant("YX Noodle Taste", "02 8317 4361", "Chinese", "#9", "Shop 5, 614-624 George Street, CBD, Sydney", "Aesthically a delight, and it's great to see the cooks making food in the large window. The \"steamed bun\" aka Siu Loong Bow were delicious although I would have appreciated the ginger that goes with the vinegar. The pan-fried pork and cabbage dumplings came out tiny, almost deep-fried, and doughy. The menu doesn't have a large range to choose from. On the expensive side.", "7/10", "Pork and Cabbage Dumplings, Wagyu Beef Slices", R.drawable.yxhotpot));
        restaurants.add(new Restaurant("Devon Cafe", "02 9262 4660", "Cafe", "#10", "Wulugul Walk, Barangaroo, Sydney", " I tried their Truffle French Toast, Korean fried chicken sandwich and chia seeds pudding. Everything was a pleasure to eat but the highlight for me was the truffle French toast. This place is more on the pricey side, despite everything tasting pretty nice.", "7/10", "Truffle French Toast", R.drawable.devon));
        return restaurants;

    }
}
