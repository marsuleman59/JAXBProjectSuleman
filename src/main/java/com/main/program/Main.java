/**
 * 
 */
package com.main.program;


import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.jaxb.pojos.Customer;

/**
 * @author Suleman
 */
public class Main {

	public static void main(String[] args) throws JAXBException {
		Customer customer = unMarshall();
		marshall(customer);
	}

	
	/**
	 * @param customer 
	 * @throws JAXBException 
	 * 
	 */
	private static void marshall(Customer customer) throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(Customer.class);
		Marshaller marshaller = context.createMarshaller();
		marshaller.marshal(customer, System.out);
	}


	private static Customer unMarshall() throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(Customer.class);
		Unmarshaller unmarshaller = context.createUnmarshaller();
		Customer customer = (Customer) unmarshaller.unmarshal(new File("C:\\Users\\marsu\\OneDrive\\Workspace\\Eclipse-Photon\\JAXBProjectSuleman\\resources\\Customer.xml"));
		System.out.println("Un marshalled successfully");
		System.out.println(customer);
		return customer;
	}
}
