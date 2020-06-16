package com.masai.preclassvideos;

public class PreClassModel {
    private String lectureName;
    private String trainerName;
    private String sessionTime;

    public PreClassModel(String lectureName, String trainerName, String sessionTime) {
        this.lectureName = lectureName;
        this.trainerName = trainerName;
        this.sessionTime = sessionTime;
    }

    public String getLectureName() {
        return lectureName;
    }

    public void setLectureName(String lectureName) {
        this.lectureName = lectureName;
    }

    public String getTrainerName() {
        return trainerName;
    }

    public void setTrainerName(String trainerName) {
        this.trainerName = trainerName;
    }

    public String getSessionTime() {
        return sessionTime;
    }

    public void setSessionTime(String sessionTime) {
        this.sessionTime = sessionTime;
    }
}
