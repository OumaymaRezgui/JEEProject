package com.cifop.school.classroom.ressource;

import java.util.List;

import com.cifop.entity.ClassRoom;
import com.citop.service.ClassRoomService;

import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/classrooms")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)

public class ClassRoomRessource {
	
	@Inject
    ClassRoomService classroomservice;
	
	@GET
    public List<ClassRoom> listClassRooms() {
        return classroomservice.findAllClassRoom();
    }
    
    @GET
    @Path("/{id}")
    public ClassRoom findClassRoomById(@PathParam("id") long id) {
        return classroomservice.findClassRoomById(id);
    }
    
    @POST
    public ClassRoom saveClassRoom(ClassRoom classroom)
    {
    	classroomservice.addClassRoom(classroom);
        return classroom;
    }
}