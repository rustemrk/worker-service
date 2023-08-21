package kz.rebel.workerservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WorkerServiceApplication {


	public static void main(String[] args) {
		SpringApplication.run(WorkerServiceApplication.class, args);
//		Calculator calculator = new Calculator();
//		CalculatorSoap calculatorSoap = calculator.getCalculatorSoap();
//		System.out.println(calculatorSoap.add(12, 2));
//		System.out.println(calculatorSoap.multiply(12, 2));

//		CountryInfoService service = new CountryInfoService();
//		CountryInfoServiceSoapType soap = service.getCountryInfoServiceSoap();
//		ArrayOftContinent arrayOftContinent = soap.listOfContinentsByName();
//		List<TContinent> continentList =  arrayOftContinent.getTContinent();
//		continentList.forEach(System.out::println);

	}
}
