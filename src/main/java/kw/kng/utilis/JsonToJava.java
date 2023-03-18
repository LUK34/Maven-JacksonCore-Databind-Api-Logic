package kw.kng.utilis;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

import kw.kng.binders.Person;

public class JsonToJava
{

	public static void main(String[] args) throws Exception
	{
		ObjectMapper mapper = new ObjectMapper();
		Person p = mapper.readValue(new File("person.json"), Person.class);
		System.out.println(p);
	}

}
