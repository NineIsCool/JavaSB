package org.example.skillbox_mod4.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.example.skillbox_mod4.adapter.repository.NewsCategoryRepository;
import org.example.skillbox_mod4.domain.NewsCategoryEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class NewsCategoryService {
    private final NewsCategoryRepository categoryRepository;

    public List<String> getAll() {
        List<NewsCategoryEntity> categoryList = categoryRepository.findAll();
        List<String> categoryNames = new ArrayList<>();
        for (NewsCategoryEntity category : categoryList) {
            categoryNames.add(category.getCategoryName());
        }
        return categoryNames;
    }

    public void add(String name) {
        NewsCategoryEntity category = new NewsCategoryEntity(name);
        categoryRepository.save(category);
    }

    public void delete(Long id) {
        categoryRepository.deleteById(id);
    }
}
