package com.example.airbnb.Repositories;

import com.example.airbnb.Dto.GuestDTO;
import com.example.airbnb.Entities.GuestEntity;
import com.example.airbnb.Entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GuestRepository extends JpaRepository<GuestEntity, Long> {
    List<GuestDTO> findByUser(UserEntity user);
}