package com.zipcodewilmington.assessment1.part3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * Created by leon on 2/16/18.
 */
public class PetOwner {
    public String name;
    public List<Pet> pets;
    public Pet[] petss ;

    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */
    public PetOwner(String name, Pet... pets) {
        this.name = name;
        if(pets == null){ // catch the null parameter? probably a better way to handle this
           pets = new Pet[0];
        }
        this.pets = new ArrayList<>(Arrays.asList(pets));
        for (Pet pet:pets
             ) {
            pet.owner = this;
        }
    }

    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) {
        this.pets.add(pet);
        pet.owner = this ;
    }

    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {
        this.pets.remove(pet);
        this.pets.add(null); // add null in place of the  removed pet

    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {
        if(pets.contains(pet)){
            return true;
        }
        return false;
    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungetPetAge() {
        int lowestAge = pets.get(0).getAge();
        Pet lowestPet = pets.get(0);
        for(int i = 1; i <pets.size(); i++){
            if(pets.get(i).getAge() < lowestAge){
                lowestPet = pets.get(i);
                lowestAge = pets.get(i).getAge();
            }
        }
        return lowestAge;
    }

    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {
        int highestAge = pets.get(0).getAge();
        Pet highestPet = pets.get(0);
        for(int i = 1; i <pets.size(); i++){
            if(pets.get(i).getAge() > highestAge){
                highestPet = pets.get(i);
                highestAge = pets.get(i).getAge();
            }
        }
        return highestAge;
    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {
        float sum = 0;
        for (Pet pet: pets
             ) {
            sum+=pet.getAge();
        }
        return sum / pets.size();
    }

    /**
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets() {
        return pets.size();
    }

    /**
     * @return the name property of the Pet
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return array representation of animals owned by this PetOwner
     */
    public Pet[] getPets() {
        Pet[] p = pets.toArray( new Pet[0]);
        return p;
    }
}
