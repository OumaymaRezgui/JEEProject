package com.citop.service;

import java.util.List;

import com.cifop.entity.ClassRoom;
import com.cifop.entity.Student;

import jakarta.ejb.Stateful;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Stateful
public class ClassRoomService {

	@PersistenceContext
	private EntityManager entityManager;
	
	 public ClassRoom findClassRoomByName(String name){
	    	return (ClassRoom) entityManager.createNamedQuery("classRoomByName")
	    			.setParameter("classRoomName", name)
	    			.getSingleResult();
	    }
	 
	 public void saveClassRoom(ClassRoom classroom) {
	    	entityManager.persist(classroom);
	        ;
	    }
	 
	 public void addClassRoom(ClassRoom classRoom) {
	        entityManager.persist(classRoom);
	    }

	    /**
	     * 
	     * @param classRoom
	     */
	    public void updateClassRoom(ClassRoom classRoom) {
	        entityManager.merge(classRoom);
	    }

	    /**
	     * 
	     * @param classRoom
	     */
	    public void removeClassRoom(ClassRoom classRoom) {
	        entityManager.remove(classRoom);
	    }

	    /**
	     * 
	     * @param id
	     * @return
	     */
	    public ClassRoom findClassRoomById(long id) {
	        return entityManager.find(ClassRoom.class, id);
	    }

	    public List<ClassRoom> findAllClassRoom() {
	        return  entityManager
	                .createQuery("select c from ClassRoom c")
	                .getResultList();
	    }
}
