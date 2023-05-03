package com.example.spring_blog_app_endterm.services;

import com.example.spring_blog_app_endterm.entities.Catigories;
import com.example.spring_blog_app_endterm.entities.Countries;
import com.example.spring_blog_app_endterm.entities.ShopItems;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ItemService {

    ShopItems addItem(ShopItems items);
    List<ShopItems> getAllItems();
    ShopItems getItem(Long id);
    void deleteItem(ShopItems item);
    ShopItems saveItem(ShopItems item);

    List<Countries> getAllCountries();
    Countries addCountry(Countries country);
    Countries saveCountry(Countries country);
    Countries getCountry(Long id);

    List<Catigories> getAllCategories();
    Catigories getCategory(Long id);
    Catigories saveCategory(Catigories catigories);
    Catigories addVategory(Catigories catigories);
}
