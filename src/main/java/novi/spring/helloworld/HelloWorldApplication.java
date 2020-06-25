package novi.spring.helloworld;

//import com.what3words.javawrapper.What3WordsV3;
//import com.what3words.javawrapper.request.Coordinates;
//import com.what3words.javawrapper.response.ConvertTo3WA;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorldApplication {

	public static void main(String[] args) {

//		//dit stukje is alleen voor what3words
//		What3WordsV3 api = new What3WordsV3("V8UG7ICS");
//
//		ConvertTo3WA words = api.convertTo3wa(new Coordinates(51.508344, -0.12549900))
//				.language("en")
//				.execute();
//		System.out.println("Words: " + words);
//		//einde stukje voor what3words


		SpringApplication.run(HelloWorldApplication.class, args);
	}

}
