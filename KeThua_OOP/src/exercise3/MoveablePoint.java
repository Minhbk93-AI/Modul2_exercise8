package exercise3;

public class MoveablePoint extends Point {
    private float xSpeed;
    private float ySpeed;

    public MoveablePoint() {
    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed= ySpeed;
    }
    public float[] getSpeed(){
        float[] speed= {xSpeed,ySpeed};
        return speed;
    }
    public MoveablePoint move(){
        setX(getX() + xSpeed);
        setY(getY() + ySpeed);
        return this;
    }

    @Override
    public String toString() {
        return super.toString()+")"+",speed=("+xSpeed+","+ySpeed+")";
    }
}
