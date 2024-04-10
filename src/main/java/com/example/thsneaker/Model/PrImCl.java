package com.example.thsneaker.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.CascadeType;
import javax.persistence.OneToMany;
import java.util.List;

public class PrImCl {
    @JsonProperty("id")
    private Long id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("description")
    private String description;
    @JsonProperty("brand")
    private String brand;
    @JsonProperty("status")
    private int status;
    @JsonProperty("created_at")
    private String created_at;
    @JsonProperty("updated_at")
    private String updated_at;
    @JsonProperty("list")
    private List<ProductColor> colors;
    public PrImCl(Long id, String name, String description, String brand, int status, String created_at, String updated_at, List<ProductColor> colors) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.brand = brand;
        this.status = status;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.colors = colors;
    }

    @Override
    public String toString() {
        return "PrImCl{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", brand='" + brand + '\'' +
                ", status=" + status +
                ", created_at='" + created_at + '\'' +
                ", updated_at='" + updated_at + '\'' +
                ", colors=" + colors +
                '}';
    }
}
