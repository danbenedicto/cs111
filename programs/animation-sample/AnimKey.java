class AnimKey{

	public static void main(String[] args){
		System.out.println("starting demo");
		Animation anim = new Animation(500,500);
		anim.setBackgroundImage("pancakes.jpg");
		anim.addSprite(new Sprite("tanuki.gif"));
		anim.frameFinished();
	}

}
