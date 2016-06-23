void setup(){
 size(500,662);
 PImage face = loadImage("images.jpg");
 image(face,0,0);

}

void draw(){
  if(mouseX>180){
    mouseX=180;
  }
  if(mouseX<130){
    mouseX=130;
  }
  if(mouseY>325){
    mouseY=325;
  }
  if(mouseY<310){
    mouseY=310;
  }
  
  //whites
  fill(255,255,255);
ellipse(150,317,100,50);
ellipse(350,317,100,50);
  //pupils
  fill(0,0,0);
ellipse(mouseX,mouseY,25,25);
ellipse(mouseX+200,mouseY,25,25);



}
