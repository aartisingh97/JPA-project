package com.jpa.test;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.User;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(BootjpaexampleApplication.class, args);
		
		UserRepository userRepository=context.getBean(UserRepository.class);
//		User user=new User();
//		user.setName("Aarti");
//		user.setCity("Indore");
//		
//		User user1=userRepository.save(user);
//		
//		System.out.println(user1);

//		User user1=new User();
//		user1.setName("Uttam");
//		user1.setCity("City1");
//		
//		User user2=new User();
//		user2.setName("Ankit Tiwari");
//		user2.setCity("City2");
//	//saving single user
//	//	User resultUser=userRepository.save(user2);
//		 List<User> users=List.of(user1,user2);
//////		 //saving multiple user
//		Iterable<User>result=userRepository.saveAll(users);
//		result.forEach(user->{
//			System.out.println(user);
//	}
//	);
//	
		//Update the user of 
//		Optional<User> optional=userRepository.findById(2);
//		User user=optional.get();
//		System.out.println(user);
//		user.setName("Pooja SIngh");
//		User result =userRepository.save(user);
//		System.out.println(result);
		
		//how to get data
//		findById(id)-return optional containing your data
		
//		Iterable<User> itr=userRepository.findAll();
//		Iterator<User> iterator=itr.iterator();
//		while(iterator.hasNext()) {
//			User user=iterator.next();
//			System.out.println(user);
//		}
		
//		itr.forEach(new Consumer<User>() {
//
//			@Override
//			public void accept(User t) {
//				// TODO Auto-generated method stub
//				System.out.println(t);
//				
//			}
//			
//		});
		
		//deleting the user
//		userRepository.deleteById(5);
//		System.out.println("deleted");
		
		//deleting all user
//		Iterable<User> allusers=userRepository.findAll();
//		allusers.forEach(user->System.out.println(user));
//		userRepository.deleteAll(allusers);
		
//		List<User> users=userRepository.findByName("Uttam");
//		users.forEach(e->System.out.println(e));
//		
//		List<User> users=userRepository.findByNameAndCity("Ankit Tiwari","city2");
//		users.forEach(e->System.out.println(e));
		
		List<User> allUser=userRepository.getAllUser();
		allUser.forEach(e->System.out.println(e));
		
		List<User> userByName=userRepository.getUserByName("Uttam");
		userByName.forEach(e->System.out.println(e));
		System.out.println("************************");
		userRepository.getUsers().forEach(e->System.out.println(e));

}
}
