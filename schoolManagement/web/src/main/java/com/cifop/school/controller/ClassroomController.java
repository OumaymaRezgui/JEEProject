package com.cifop.school.controller;

import com.cifop.entity.ClassRoom;
import com.citop.service.ClassRoomService;

import jakarta.enterprise.context.RequestScoped;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named
@RequestScoped
public class ClassroomController {
	@Inject
	ClassRoomService classroomservice;
    
	@Inject
	FacesContext FacesContext;
	ClassRoom classroom = new ClassRoom();
 
	public void doCreateClassRoom() {
		classroomservice.saveClassRoom(classroom);
		FacesContext.addMessage(null,new FacesMessage(FacesMessage.SEVERITY_INFO, "Info",
                "Class is saved successfully with id " + classroom.getId()) );
	}

	public ClassRoom getClassroom() {
		return classroom;
	}

	public void setClassroom(ClassRoom classroom) {
		this.classroom = classroom;
	}
}