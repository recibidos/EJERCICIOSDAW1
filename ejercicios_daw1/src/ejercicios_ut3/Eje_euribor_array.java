package ejercicios_ut3;
	import graphics.Color;
		import graphics.Line;
		import graphics.Canvas;
		import graphics.Rectangle;
		import graphics.Text;
		
public class Eje_euribor_array {

		        public static void main(String[] args) throws InterruptedException {
		                // TODO Auto-generated method stub
String meses[];
double valseuribor[];

meses= new String[12];
valseuribor=new double[12];
valseuribor[0]=1.837;	
valseuribor[1]=1.678;
valseuribor[2]=1.499;	
valseuribor[3]=1.368;	
valseuribor[4]=1.266;	
valseuribor[5]=1.22;
valseuribor[6]=1.061;	
valseuribor[7]=0.877;
valseuribor[8]=0.74;
valseuribor[9]=0.65;
valseuribor[10]=0.588;
valseuribor[11]=0.549;
meses[0]="ENE";
meses[1]="FEB";
meses[2]="MAR";
meses[3]="ABR";
meses[4]="MAY";
meses[5]="JUN";
meses[6]="JUL";
meses[7]="AGO";
meses[8]="SEP";
meses[9]="OCT";
meses[10]="NOV";
meses[11]="DIC";


		                Canvas pantalla;
		                Rectangle barrames;
		                Line ejex;                         //lineas eje x y eje y        
		                Line ejey;
		                Text textomes;

		                Text Euribor;
		                Text textoe;
		                double maxv=2 ;//valor maximo para euribor
		                int maxposv=350 ; //valor maxiomo en puntos verticales para euribor
		                int margenv=20; // 		                
		                Canvas.getInstance();                //para que aparezca la pantalla
		                
		                Euribor = new Text(500,25,"EURIBOR 2012");
		                Euribor.draw();
		                Euribor.setColor(Color.BLUE);
		                
		                ejex = new Line(80,400,1050,400);
		                ejex.draw();
		                ejey = new Line(80,400,80,0);
		                ejey.draw();
		                
		                textoe = new Text(40,20,"2.0");
		                textoe.draw();
		                
		                textoe= new Text(40,120,"1.5");
		                textoe.draw();
		                
		                textoe = new Text(40,220,"1.0");
		                textoe.draw();
		           
		                textoe = new Text(40,320,"0.5");
		                textoe.draw();
		                for (int i=0 ; i<12;i++){
		                	textomes= new Text(105+(i*81),400,meses[i]);
		                	textomes.draw();
		                	
		                	// barras x, y, ancho , alto
		                		Thread.sleep(100);
		                		barrames= new Rectangle (100+(80*i),400-((int)(valseuribor[i]*maxposv/maxv)),50,(int)(valseuribor[i]*maxposv/maxv));
				                barrames.draw();
				                barrames.setColor(Color.BLUE);
				                barrames.fill();
		                }

		        }
		
	

}
