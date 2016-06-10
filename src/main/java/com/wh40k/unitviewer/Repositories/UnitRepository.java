package com.wh40k.unitviewer.Repositories;

import com.wh40k.unitviewer.Entities.Unit;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface UnitRepository extends CrudRepository<Unit, Integer> {
    List<Unit> findByArmy(String army);
    Unit findByName(String name);
    Unit findById(Integer id);
}
