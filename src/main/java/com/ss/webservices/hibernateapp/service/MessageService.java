package com.ss.webservices.hibernateapp.service;

import java.util.ArrayList;
import java.util.List;

import com.ss.webservices.hibernateapp.model.Messages;

public class MessageService {
public List<Messages> getAllMessages()
{
	Messages m1=new Messages(1L,"Hello","Sushil");
	Messages m2=new Messages(2L,"Hello","Sushil Anand");
	List<Messages> list=new ArrayList<>();
	list.add(m1);
	list.add(m2);
	return list;
	
	
}
}
