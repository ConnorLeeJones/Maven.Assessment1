package com.zipcodewilmington.assessment1.part3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by leon on 2/16/18.
 */
public class PetOwner {
    String name;
    Pet[] pets;


    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */
    public PetOwner(String name, Pet... pets) {
        this.name = name;
        this.pets = pets;


        if (!(pets == null)) {
            for (Pet pet : pets) {
                pet.setOwner(this);
            }
        }

    }

    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) {

        List<Pet> petList = new ArrayList<>(0);

        if (!(pets == null)){
            petList = Arrays.asList(getPets());
        }

        petList.add(pet);
        pets = petList.toArray(new Pet[petList.size()]);

    }

    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {
        ArrayList<Pet> petList = new ArrayList<>(Arrays.asList(pets));

        int index = petList.indexOf(pet);
        petList.set(index, null);

        pets = petList.toArray(new Pet[petList.size()]);
    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {
        Boolean result = false;
        for (Pet element : pets){
            if (element.equals(pet)){
                result = true;
            }
        }
        return result;
    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungetPetAge() {
        Integer youngest = pets[0].age;

        for (Pet pet : pets){
            if (pet.age < youngest){
                youngest = pet.age;
            }
        }
        return youngest;
    }




    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {
        Integer oldest = pets[0].age;

        for (Pet pet : pets){
            if (pet.age > oldest){
                oldest = pet.age;
            }
        }
        return oldest;
    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {
        int ageTotal = 0;
        for (Pet pet : pets){
            ageTotal += pet.age;
        }
        float result = (float) ageTotal / pets.length;
        return result;
    }

    /**
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets() {
        return pets.length;
    }

    /**
     * @return the name property of the Pet
     */
    public String getName() {
        return name;
    }

    /**
     * @return array representation of animals owned by this PetOwner
     */
    public Pet[] getPets() {
        return pets;
    }
}
