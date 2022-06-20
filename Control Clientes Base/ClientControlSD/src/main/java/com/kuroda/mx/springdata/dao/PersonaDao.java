
package com.kuroda.mx.springdata.dao;

import com.kuroda.mx.springdata.domain.Persona;
import org.springframework.data.repository.CrudRepository;


public interface PersonaDao extends CrudRepository<Persona,Integer>{
    
}
