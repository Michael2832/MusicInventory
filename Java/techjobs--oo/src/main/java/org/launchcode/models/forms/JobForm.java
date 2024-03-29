package org.launchcode.models.forms;

import org.launchcode.models.CoreCompetency;
import org.launchcode.models.Employer;
import org.launchcode.models.Location;
import org.launchcode.models.PositionType;
import org.launchcode.models.data.JobData;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.validation.constraints.Min;

import java.util.ArrayList;

/**
 * Created by LaunchCode
 */
public class JobForm {

    @NotNull
    @Size(min=1, message = "Name may not be empty")
    private String name;

    @NotNull
    @Min(1)
    private int employerId;

    @NotNull
    @Min(1)
    private int locationId;

    @NotNull
   // @Min(1)
    private int positionId;

    @NotNull
    @Min(1)
    private int coreCompetencyId;



    /*
        TODO #3 - Included other fields needed to create a job,
        with correct validation attributes and display names.
        Don't forget to add getters and setters
     */




    private ArrayList<Employer> employers;
    private ArrayList<Location> locations;
    private ArrayList<CoreCompetency> coreCompetencies;
    private ArrayList<PositionType> positionTypes;

    public JobForm() {

        JobData jobData = JobData.getInstance();
        employers = jobData.getEmployers().findAll();
        locations = jobData.getLocations().findAll();
        coreCompetencies = jobData.getCoreCompetencies().findAll();
        positionTypes = jobData.getPositionTypes().findAll();
        /*
            TODO #4 - populate the other ArrayList collections needed in the view
        */

    }


    //ArrayList getters and setters
    //Employers
    public ArrayList<Employer> getEmployers() {
        return employers;
    }
    public void setEmployers(ArrayList<Employer> employers) {
        this.employers = employers;
    }

    //Locations
    public ArrayList<Location> getLocations() {
        return locations;
    }
    public void setLocations(ArrayList<Location> locations) {
        this.locations = locations;
    }

    //Core Competencies
    public ArrayList<CoreCompetency> getCoreCompetencies() {
        return coreCompetencies;
    }
    public void setCoreCompetencies(ArrayList<CoreCompetency> coreCompetencies) {
        this.coreCompetencies = coreCompetencies;
    }

    //Position Types
    public ArrayList<PositionType> getPositionTypes() {
        return positionTypes;
    }
    public void setPositionTypes(ArrayList<PositionType> positionTypes) {
        this.positionTypes = positionTypes;
    }



    //Individual attribute getters and setters
    //Name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    //Employer ID
    public int getEmployerId() {
        return employerId;
    }
    public void setEmployerId(int employerId) {
        this.employerId = employerId;
    }

    //Location ID
    public int getLocationId() {
        return locationId;
    }
    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    //Core Competency ID
    public int getCoreCompetencyId() {
        return coreCompetencyId;
    }
    public void setCoreCompetencyId(int coreCompetencyId) {
        this.coreCompetencyId = coreCompetencyId;
    }

    //Position Type ID

    public int getPositionId() {
        return positionId;
    }

    public void setPositionId(int positionId) {
        this.positionId = positionId;
    }
}
