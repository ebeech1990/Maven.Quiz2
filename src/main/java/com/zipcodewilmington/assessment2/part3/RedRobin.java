package com.zipcodewilmington.assessment2.part3;

public class RedRobin extends Bird {
    private String migrationMonth;



    public void setMigrationMonth(String month){
        this.migrationMonth = month;
    }

    public String getMigrationMonth(){
        return migrationMonth;
    }

    @Override
    public int getSpeed() {
        return 10;
    }

    @Override
    public String color() {
        return "red";
    }
}
