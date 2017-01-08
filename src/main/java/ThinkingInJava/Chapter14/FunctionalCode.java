package ThinkingInJava.Chapter14;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

/**
 * Created by taotao on 2017/1/7.
 */
public class FunctionalCode {
	final List prices = Arrays.asList(
		new BigDecimal("10"), new BigDecimal("30"), new BigDecimal("17"),
		new BigDecimal("20"), new BigDecimal("15"), new BigDecimal("18"),
		new BigDecimal("45"), new BigDecimal("12"));

	public void functionalCode(){
		new Thread(new Runnable() {
			public void run() {
				System.out.println("Before java 8");
			}
		}).start();

		//new Thread( () -> System.out.println("After java 8") ).start();
	}

	public static void main(String[] args){
		FunctionalCode functionalCode = new FunctionalCode();
		functionalCode.functionalCode();
	}
}
