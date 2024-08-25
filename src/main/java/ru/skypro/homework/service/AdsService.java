package ru.skypro.homework.service;

import org.springframework.data.domain.Sort;
import ru.skypro.homework.dto.AdsDTO;
import ru.skypro.homework.dto.CreateOrUpdateAdDTO;
import ru.skypro.homework.dto.FullAdsDto;
import ru.skypro.homework.model.AdModel;
import ru.skypro.homework.model.ImagesModel;

import java.util.List;

public interface AdsService {

    List<AdsDTO> getALLAds();

    AdsDTO addAds(CreateOrUpdateAdDTO ads, ImagesModel image);

    List<AdsDTO> getAdsMe(Boolean authenticated, String authority, Object credentials, Object details, Object principal);

    void removeAds(Integer id);

    FullAdsDto getFullAds(Integer id);

    AdsDTO updateAds(Integer id, CreateOrUpdateAdDTO ads);

    AdModel getAds(Integer id);

    List<AdsDTO> findAds(String title);

    List<AdsDTO> getSortedAds(Sort.Direction order);
}
