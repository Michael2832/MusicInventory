package org.launchcode.models;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

public class FileType {


    @Id
    @GeneratedValue
    private int id;

    @NotNull
    @Size(min=3, max=15)
    private String fileType;

    @OneToMany
    @JoinColumn(name = "fileType_id")
    private List<Cheese> cheeses = new ArrayList<>();


    public FileType(String name) {
        this.fileType = name;
    }

    public FileType() {}

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public int getId() {
        return id;
    }
}

