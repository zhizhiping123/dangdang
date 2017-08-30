package util;

import java.util.Random;
public class RandomUtil {
	public static String getRandomString(int num){
		String string=null;
		Long randomLong=0L;;
		Random random=new Random(System.currentTimeMillis());
		switch (num) {
		case 4:
		randomLong=(long) (random.nextInt(8999)+1000);
		string=String.valueOf(randomLong);
			break;
		case 6:
		
			randomLong=(long) (random.nextInt(899999)+100000);
			string=String.valueOf(randomLong);
			break;
		default:
			throw new RuntimeException("随机数只能4位或者6位");
		}

	return string;
}



public static void main(String[] args) {
	
	System.out.println(RandomUtil.getRandomString(6));
}	
	
}
