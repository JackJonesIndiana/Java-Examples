
public class MultidimensionalArrays {

	/**
	 * @param args
	 */
	public static void main(String [] args){
		
		int a [][][] = {{{1,2,3},{1,2}},{{5,6,7,8}},{{1,2,3,4,5},{1,2}}};
	
		int x = 0;
		
		if(args.length != 0){
			x = Integer.parseInt(args[0]);
		}
		
		System.out.println(a[x][0][2]);
	}
	

}
