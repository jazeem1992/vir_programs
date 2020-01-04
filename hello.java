class A{
public static void main(String[] args){
	int x = 12345678;
	int y = 0;
	while(x != 0){
		y = y * 10;
		y = y + (x%10);
		x = x / 10;
	}
	System.out.println(y);
}
}