
public class clicableObject {
		int xTop;
		int yTop;
		int height;
		int width;
		String name;
	
	
		public clicableObject(int xTop, int yTop, int height, int width, String name) {
			this.xTop = xTop;
			this.yTop = yTop;
			this.height = height;
			this.width = width;
			this.name = name;
		}
		
		public boolean checkClick(int xClick, int yClick) {
			
			
			for(int xCord = xTop; xCord < width; xCord ++) {
				for(int yCord = yTop; yCord < height; yCord ++) {
					if(xClick == xCord && yClick == yCord) {
						return true;
					}
				}
			}
			
			return false;
		}
		
		
		public String getName() {
			return this.name;
		}
}