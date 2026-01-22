package com.kian.socialhub.model;

public class Society{
    private long id;
    private String name;
    private String description;
    private Double membershipFee;
    private int memberCount;
    private String category;
    private String imageUrl;

    public Society (Long id, String name, String description, Double membershipFee, int memberCount, String category, String imageUrl) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.membershipFee = membershipFee;
        this.memberCount = memberCount;
        this.category = category;
        this.imageUrl = imageUrl;
    }

    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public Double getMembershipFee() {
        return membershipFee;
    }
    public int getMemberCount() {
        return memberCount;
    }
    public String getCategory() {
        return category;
    }
    public String getImageUrl() {
        return imageUrl;
    }

}
