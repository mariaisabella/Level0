int yDrop = 0;
int x = (int)random(800);
int score = 0;
void setup()
{
  size(1000, 600);
  background(255, 255, 0);
}
void draw()
{
  background(255, 255, 0);
  fill(0, 0, 0);
  textSize(16);
  text("Score: "+score, 20, 20);
  ellipse(x, yDrop++, 12, 30);
  yDrop+=6;
  if (yDrop>=600) {
    yDrop=0;
    x=(int)random(1000);
  }
  fill(0, 0, 255);
  if (yDrop>550) {
    if (mouseX<x&&x<mouseX+50) {
      fill(0, 255, 0);
      score++;
    } else {
      fill(255, 0, 0);
      score--;
    }
  }
  rect(mouseX, 550, 50, 70);
  if (score >= 175)
  background(random(255),random(255),random(255));
}

