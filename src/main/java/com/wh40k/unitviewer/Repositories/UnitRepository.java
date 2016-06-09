package com.wh40k.unitviewer.Repositories;

import com.wh40k.unitviewer.Entities.Units;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Ultramar on 6/7/16.
 */
public interface UnitRepository extends CrudRepository<Units, Integer> {
    List<Units> findByArmy(String army);
}
