package com.example.spring_blog_app_endterm.services.Impl;

import com.example.spring_blog_app_endterm.entities.Catigories;
import com.example.spring_blog_app_endterm.entities.Countries;
import com.example.spring_blog_app_endterm.entities.ShopItems;
import com.example.spring_blog_app_endterm.repositories.CategoryRepository;
import com.example.spring_blog_app_endterm.repositories.CountryRepository;
import com.example.spring_blog_app_endterm.repositories.ShopItemRepository;
import com.example.spring_blog_app_endterm.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ShopItemRepository shopItemRepository;

    @Autowired
    private CountryRepository countryRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public ShopItems addItem(ShopItems item) {
        return shopItemRepository.save(item);
    }

    @Override
    public List<ShopItems> getAllItems() {
        return shopItemRepository.findAllByAmountGreaterThanOrderByPriceDesc(0);
    }

    @Override
    public ShopItems getItem(Long id) {
        return shopItemRepository.findByIdAndAmountGreaterThan(id, 0);
    }

    @Override
    public void deleteItem(ShopItems item) {
        shopItemRepository.delete(item);
    }

    @Override
    public ShopItems saveItem(ShopItems item) {
        return shopItemRepository.save(item);
    }

    @Override
    public List<Countries> getAllCountries() {
        return countryRepository.findAll();
    }

    @Override
    public Countries addCountry(Countries country) {
        return countryRepository.save(country);
    }

    @Override
    public Countries saveCountry(Countries country) {
        return countryRepository.save(country);
    }

    @Override
    public Countries getCountry(Long id) {
        return countryRepository.getOne(id);
    }

    @Override
    public List<Catigories> getAllCategories() {
        return categoryRepository.findAll();
    }

    @Override
    public Catigories getCategory(Long id) {
        return categoryRepository.getOne(id);
    }

    @Override
    public Catigories saveCategory(Catigories catigories) {
        return categoryRepository.save(catigories);
    }

    @Override
    public Catigories addVategory(Catigories catigories) {
        return categoryRepository.save(catigories);
    }
}
