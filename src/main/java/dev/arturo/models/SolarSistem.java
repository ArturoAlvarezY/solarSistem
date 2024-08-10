package dev.arturo.models;

import java.math.BigDecimal;
import java.math.RoundingMode;

import dev.arturo.models.enums.TypeOfPlanet;

public class SolarSistem {

    private String name = null;
    private Integer satellite = 0;
    private Double mass = 0.0;
    private Double volume = 0.0;
    private Integer diameter = 0;
    private Integer sunDistance = 0;
    private TypeOfPlanet typeOfPlanet;
    private Boolean observableNakedEye = false;

    
    public SolarSistem(String name, Integer satellite, Double mass, Double volume, Integer diameter,
            Integer sunDistance, TypeOfPlanet typeOfPlanet, Boolean observableNakedEye) {
        this.name = name;
        this.satellite = satellite;
        this.mass = mass;
        this.volume = volume;
        this.diameter = diameter;
        this.sunDistance = sunDistance;
        this.typeOfPlanet = typeOfPlanet;
        this.observableNakedEye = observableNakedEye;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public Integer getSatellite() {
        return satellite;
    }


    public void setSatellite(Integer satellite) {
        this.satellite = satellite;
    }


    public Double getMass() {
        return mass;
    }


    public void setMass(Double mass) {
        this.mass = mass;
    }


    public Double getVolume() {
        return volume;
    }


    public void setVolume(Double volume) {
        this.volume = volume;
    }


    public Integer getDiameter() {
        return diameter;
    }


    public void setDiameter(Integer diameter) {
        this.diameter = diameter;
    }


    public Integer getSunDistance() {
        return sunDistance;
    }


    public void setSunDistance(Integer sunDistance) {
        this.sunDistance = sunDistance;
    }


    public TypeOfPlanet getTypeOfPlanet() {
        return typeOfPlanet;
    }


    public void setTypeOfPlanet(TypeOfPlanet typeOfPlanet) {
        this.typeOfPlanet = typeOfPlanet;
    }


    public Boolean getObservableNakedEye() {
        return observableNakedEye;
    }


    public void setObservableNakedEye(Boolean observableNakedEye) {
        this.observableNakedEye = observableNakedEye;
    }


    public double calcPlanetDensity(SolarSistem planet){
       Double PLANET_MASS = planet.getMass();
       Double PLANET_VOL = planet.getVolume();

       Double  DENSITY = PLANET_MASS/PLANET_VOL;

      BigDecimal bigDecimal = new BigDecimal(DENSITY);

      BigDecimal roundUpDensity = bigDecimal.setScale(2, RoundingMode.HALF_UP);
      
      return roundUpDensity.doubleValue();
    }


}
