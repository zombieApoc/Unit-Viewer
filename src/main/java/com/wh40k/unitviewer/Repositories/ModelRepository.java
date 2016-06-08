package com.wh40k.unitviewer.Repositories;

import com.wh40k.unitviewer.Entities.Model;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Ultramar on 6/7/16.
 */
public interface ModelRepository extends CrudRepository<Model, Integer> {
    List<Model> findByArmy(String army);
}
