package ie.atu.Passenger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@SpringBootApplication
@RequestMapping(path="api/passenger")
public class PassengerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PassengerApplication.class, args);
	}

	@GetMapping
	public List<Passenger> getPassengers()
	{
		List<Passenger> myPassengers = List.of(
				new Passenger("Mr", "Johnson", "ABC123", "234", 12),
				new Passenger("Ms", "Jo", "1234gjhd", "089222333", 26),
				new Passenger("Mrs", "John", "ABC", "234", 18));
				return myPassengers;
	}

	@GetMapping("/{passengerName}")
	public Passenger getPassengers(@PathVariable String passengerName){
		Passenger myPassenger = new Passenger("Mr", "Johnson", "ABC123", "234", 12);
		return myPassenger;
	}
}*/
