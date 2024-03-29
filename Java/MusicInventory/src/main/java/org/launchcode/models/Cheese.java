package org.launchcode.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

/**
 * Created by LaunchCode
 */
@Entity
public class Cheese {

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    @Size(min=1, max=30)
    private String name;

    @NotNull
    @Size(min=1, message = "Description must not be empty")
    private String description;


//Replace CheeseType with Category
    @ManyToOne
    private Category category;

    @ManyToOne
    private FileType fileType;

//Set Up Cheese many to many
    @ManyToMany(mappedBy = "cheeses")
    private List<Menu> menus;

    public Cheese(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Cheese() { }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public FileType getFileType() { return fileType; }

    public void setFileType(FileType fileType) { this.fileType = fileType; }
}
