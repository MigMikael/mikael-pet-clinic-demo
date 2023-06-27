package com.example.mikaelpetclinicdemo.services;

import com.example.mikaelpetclinicdemo.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
