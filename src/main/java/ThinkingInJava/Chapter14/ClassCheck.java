package ThinkingInJava.Chapter14;

import java.math.BigDecimal;

/**
 * Created by taotao on 2017/1/4.
 */
public class ClassCheck {

	public void printClass(){
		System.out.println(this.hashCode());
	}

	public void printLoadClass(){
		try {
			//URL[] extURLs = (URLClassLoader)ClassLoader.getSystemClassLoader().getParent().
		}catch (Exception e){
			System.out.println(e.getMessage());
		}
	}

	
	public static void main(String[] args) throws Exception{
		System.out.println(ClassLoader.getSystemClassLoader() + ","
			+ ClassLoader.getSystemClassLoader().getParent() + ","
			+ ClassLoader.getSystemClassLoader().getParent().getParent());

		ClassCheck classCheck = new ClassCheck();
		Class classCheckClass = classCheck.getClass();
		System.out.println(classCheckClass.getName() + "," + classCheckClass.getSimpleName() + "," + classCheckClass.getCanonicalName());
		System.out.println(classCheckClass.getDeclaredMethods()[1]);
		System.out.println(ClassCheck.class.getClassLoader());
		System.out.println(Boolean.TYPE.getName());

		Class<Integer> integerClass = Integer.TYPE;
		Class<?> classs = Integer.class;
		BigDecimal bigDecimal;

		//任何继承Number的类型
		Class<? extends Number> classNumber = Integer.TYPE;
	}
}
