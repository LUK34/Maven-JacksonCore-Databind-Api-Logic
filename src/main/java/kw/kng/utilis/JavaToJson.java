package kw.kng.utilis;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

import kw.kng.binders.Address;
import kw.kng.binders.Person;

public class JavaToJson 
{
	public static void main(String[] args) throws Exception {

		Address addr = new Address();
		addr.setCity("Hyd");
		addr.setState("TG");
		addr.setCountry("India");

		Person p = new Person();
		p.setName("Raju");
		p.setFrom("Hyd");
		p.setTo("Delhi");
		p.setGender("Male");
		p.setAddr(addr);

		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(new File("person.json"), p);

		System.out.println("Done....");
	}

}
