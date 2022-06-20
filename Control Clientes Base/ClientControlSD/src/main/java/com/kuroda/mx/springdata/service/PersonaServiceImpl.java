
package com.kuroda.mx.springdata.service;

import com.kuroda.mx.springdata.dao.PersonaDao;
import com.kuroda.mx.springdata.domain.Persona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PersonaServiceImpl implements PersonaService{
    
    @Autowired
    private PersonaDao personaDao;

    @Override
    @Transactional(readOnly=true)
    public List<Persona> listPersonas() {
        return (List<Persona>) personaDao.findAll();
    }

    @Override
    @Transactional(readOnly=true)
    public Persona searchPersonaById(int id) {
        return personaDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void save(Persona persona) {
        personaDao.save(persona);
    }

    @Override
    @Transactional
    public void delete(Persona persona) {
        personaDao.delete(persona);
    }
    
    @Override
    @Transactional
    public void deletePersonaById(int id) {
    	personaDao.deleteById(id);
    }
    
}
