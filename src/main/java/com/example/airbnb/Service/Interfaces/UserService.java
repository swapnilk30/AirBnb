package com.example.airbnb.Service.Interfaces;

import com.example.airbnb.Dto.ProfileUpdateRequestDTO;
import com.example.airbnb.Dto.UserDTO;
import com.example.airbnb.Entities.UserEntity;

public interface UserService {
    UserEntity getUserById(Long id);

    void updateProfile(ProfileUpdateRequestDTO profileUpdateRequestDto);

    UserDTO getMyProfile();
}
