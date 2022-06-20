
package com.kuroda.mx.springdata.service;

import com.kuroda.mx.springdata.domain.Persona;
import java.util.List;


public interface PersonaService {
    
    public List<Persona> listPersonas();
    
    public Persona searchPersonaById(int id);
    
    public void save(Persona persona);
    
    public void delete(Persona persona);
    
    public void deletePersonaById(int id);
   
}
