package listExamples;

public class ExtraTask {
	
			
			public static void main(String[] args) {
				
				String s="qwermaptyuiopasdmapfghjklzxcvmapbnm";
				
				String[] splitted = s.split("");
				
				for (int i = 0; i < splitted.length-2; i++) {
					
					if(splitted[i].equals("m")) {
						if (splitted[i+1].equals("a")) {
							if (splitted[i+2].equals("p")) {
								
								System.out.println(splitted[i]+splitted[(i+1)]+splitted[(i+2)]);
								
							}
						}
					}
					
				}
				
				
				
				
				
			}

}
