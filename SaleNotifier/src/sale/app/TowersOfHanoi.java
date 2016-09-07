package sale.app;

public class TowersOfHanoi {
	public static void moveDisk(char origin, char destination){
		System.out.println(" move top disk from " + origin + " to peg " + destination);
	}
	public static void towerOfHanoi(int n, char origin, char destination, char extra){
		if(n>0){
		n=n-1;
		towerOfHanoi(n, origin, extra, destination);
		moveDisk(origin, destination);
		System.out.println(n);
		towerOfHanoi(n, extra, destination, origin);
		}
	}
	public static void main(String[] args){
		towerOfHanoi(5, 'a', 'b', 'c');
	}
}
