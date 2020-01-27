package org.said.example.messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.said.example.messenger.database.DatabaseClass;
import org.said.example.messenger.model.Message;

public class MessageService {
	
private static Map<Long,Message> messages = DatabaseClass.getMessages();

public MessageService() {
	
	messages.put(1L,new Message(1L,"Hello","Said"));
	messages.put(2L,new Message(2L,"Bonjour","Hicham"));
}

public List<Message> getAllMessages(){
	return new ArrayList<Message>(messages.values());
	
/* for Message
	Message m1 = new Message(1L,"Hello","Said");
	Message m2 = new Message(2L,"Bonjour","Hicham");
	
	List<Message> list =new ArrayList<Message>();
		list.add(m1);
		list.add(m2);
		return list;
	*/

		}

public Message getMessage(Long id){
	return messages.get(id);
}

public Message addMessage(Message message){
	message.setId(messages.size()+1);
	messages.put(message.getId(), message);
	return message;
}

public Message updateMessage(Message message){
	if(message.getId()<=0) {
		return null;
	}else {
		messages.put(message.getId(), message);
		return message;
	}
	
}

private Message removeMessage(Long id) {
	return messages.remove(id);
}

}
