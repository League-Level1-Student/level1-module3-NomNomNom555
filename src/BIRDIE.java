
public class BIRDIE {
	 PImage back;
     PImage pipeBottom;
     PImage pipeTop;
     PImage bird;
      int birdX;
      int birdY;
        void setup() {
          size(700,700);
          back = loadImage("flappyBackground.jpg");
          back.resize(700,700);
            pipeBottom = loadImage("bottomPipe.png");
            pipeTop = loadImage("topPipe.png");
            bird = loadImage("bird.png");
            bird.resize(50,50);
            
        }
         void draw() {
            background(back);
            image (pipeBottom,250,375);
            image (pipeTop,250,-130);
            image (bird, birdX, birdY);
            birdY ++;
            if(mousePressed){
            birdY-=30;
            }
            rect(1,700,700,1);
          }
     
}
