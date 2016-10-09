package demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Without Spring Bus Cloud
@RestController
public class LuckyWordController {
	
	@Value("${wordConfig.preamble}") String preamble;
	@Value("${wordConfig.luckyWord}") String luckyWord;
		  
	@RequestMapping("/lucky-word")
	public String showLuckyWord() {
	  return preamble + ": " + luckyWord;
	}
}

 // With Spring Bus Cloud
   
//  @RestController
//  @ConfigurationProperties(prefix="wordConfig")
//  public class LuckyWordController {
//	
//	String preamble;
//	String luckyWord;
//		  
//	@RequestMapping("/lucky-word")
//	public String showLuckyWord() {
//	  return preamble + ": " + luckyWord;
//	}
//
//	public String getPreamble() {
//		return preamble;
//	}
//
//	public void setPreamble(String preamble) {
//		this.preamble = preamble;
//	}
//
//	public String getLuckyWord() {
//		return luckyWord;
//	}
//
//	public void setLuckyWord(String luckyWord) {
//		this.luckyWord = luckyWord;
//	}
//	
//	
//  }  
 	
	

