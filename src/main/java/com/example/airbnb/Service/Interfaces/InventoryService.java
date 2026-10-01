package com.example.airbnb.Service.Interfaces;

import com.aman.AirBnb.AirBnb.Dto.*;
import com.example.airbnb.Dto.HotelPriceDTO;
import com.example.airbnb.Dto.HotelSearchRequest;
import com.example.airbnb.Dto.InventoryDTO;
import com.example.airbnb.Dto.UpdateInventoryRequestDTO;
import com.example.airbnb.Entities.RoomEntity;
import org.springframework.data.domain.Page;

import java.util.List;

public interface InventoryService {
    void initializeRoomForAYear(RoomEntity room);

    void deleteAllInventories(RoomEntity room);

    Page<HotelPriceDTO> searchHotels(HotelSearchRequest hotelSearchRequest);

    List<InventoryDTO> getAllInventoryByRoom(Long roomId);

    void updateInventory(Long roomId, UpdateInventoryRequestDTO updateInventoryRequestDto);
}
