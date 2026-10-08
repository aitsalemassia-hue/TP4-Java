package Exercice5;

public class Complexe {
		private int reel;
		private int img;
		
		public Complexe(int reel, int img) {
			this.reel = reel;
			this.img = img;
		}

		@Override
		public String toString() {
			return reel+" +"+img+"i";
		}
		public Complexe plus(Complexe c) {
		    int r1;
		    int r2 ;
			r1=this.reel+c.reel;
			r2=this.img+c.img;
			return new Complexe(r1,r2);
			
		}
		public Complexe moins(Complexe c) {
		    int r1;
		    int r2 ;
			r1=this.reel-c.reel;
			r2=this.img-c.img;
			return new Complexe(r1,r2);
			
		}
		
}
