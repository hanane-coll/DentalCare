package com.app.dentalcare.repository;

import com.app.dentalcare.model.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ImageRepository extends JpaRepository<Image,Long> {
    @Query(value = "select id from Image where consultationId=?1")
     List<Long> getImagesId(Long consultationId);
}
