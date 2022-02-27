package laura.telecomacademy.java1.exextra.mirabelatabacu.cap3oo;

public class OperatiiCuVectori {
	
		public static void afisareInvers(int[] x) {
			for(int i = x.length - 1; i>= 0; i--) {
				System.out.print(x[i] + " ");
			}
			System.out.println();
		}
		
		public static int[] transformaInVector(int[][][] x) {
			int nrElem = 0;
			for (int i = 0; i< x.length; i++) {
				for(int j = 0; j< x[i].length; j++) {
					for (int z = 0; z<x[i][j].length; z++) {
						nrElem++;
					}
				}
			}
			int[] rez = new int[nrElem];
			int contor = 0;
			for (int i = 0; i< x.length; i++) {
				for(int j = 0; j< x[i].length; j++) {
					for (int k = 0; k<x[i][j].length; k++) {
						rez[contor++] = x[i][j][k];
					}
				}
			}
			return rez;
		}
		
		public static int[][] rotesteMatricea(int [][]x){
			int[][] rez = new int[x.length][x.length];
			for(int i = 0; i<x.length; i++) {
				for (int j = 0; j<x[i].length; j++) {
					rez[j][i]=x[i][j];
				}
			}
			return rez;
		}
		
		public static void afiseazaMatrice(int [][]x) {
			for(int i = 0; i<x.length; i++) {
				for (int j = 0; j<x[i].length; j++) {
					System.out.print(x[i][j]+ " ");
				}
				System.out.println();
			}
		}
		
		public static void afisareVector(int[] x) {
			for(int i = 0; i<x.length; i++) {
				System.out.print(x[i] + " ");
			}
			System.out.println();
		}
		
		
		
		public static void main(String[] args) {
			int[][] matrice = new int[4][4];
			matrice[0]= new int[]{1,2,3,4};
			matrice[1] = new int[] {4,5,6,7};
			matrice[2] = new int[] {7,8,9,0};
			matrice[3] = new int[] {11,12,13,14};
			int[][] matriceRotita = rotesteMatricea(matrice);
			afiseazaMatrice(matriceRotita);
			
			afisareInvers(matrice[0]);
			
			int[][][] tridim = new int[2][2][3];
			tridim[0] = new int[][]{{1,2,3}, {4,5,6}};
			tridim[1] = new int[][]{{11,12,13}, {14,15,16}};
			afisareVector(transformaInVector(tridim));
			
		}

}
