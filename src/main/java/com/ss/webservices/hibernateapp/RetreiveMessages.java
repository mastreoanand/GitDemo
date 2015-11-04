package com.ss.webservices.hibernateapp;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ss.webservices.hibernateapp.model.Messages;
import com.ss.webservices.hibernateapp.service.MessageService;

@Path("/viewData")
public class RetreiveMessages {

	MessageService messageService=new MessageService();
	
@GET
@Produces(MediaType.APPLICATION_XML)
public List<Messages> getData()
	{
		return messageService.getAllMessages();
	}
}
