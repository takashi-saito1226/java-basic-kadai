package kadai_011;

public class Prime_Chapter11 {

	public static void main(String[] args) { 
				for(int i=2; i<=100; i++){
					for(int j=2; (i%j!=0 && j<i)||j==i; j++){
						if(j==i){
							System.out.println(i);
						}
					}
				}
			}

	}

