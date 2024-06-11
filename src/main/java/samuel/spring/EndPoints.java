package samuel.spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EndPoints {
	
	@GetMapping("/")
	public String hello() {
		
		return "<h1>Oi mundo</h1>";
		
		
	}
	
	@GetMapping("/author")
	public String autor() {
		
		return "<p>Author:<a href='https://www.github.com/samuelvrcoder'>samuelVRcoder</a></p>";
		
		
	}
	
	@PostMapping("/form")
	public void submit() {
		
		System.out.println("Enviou");
		
	}
	
	@GetMapping("/form")
	public String form() {
		
		return "<form method='post'>"
				+ "<input type='text'>"
				+ "<input type='password'>"
				+ "<input type='submit'>"
				+ "</form>";
		
		
	}

}
