package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MyGdxGame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img1;
	Texture img2;
	Texture	img3;
	Texture	img4;
	Texture img5;
	Texture	img6;
	Texture img7;
	Texture img8;
	int nx=10,ny=380;
	int n2x=500, n2y = 380,mover=500;
	boolean t=false;

	
	@Override
	public void create () {
		batch = new SpriteBatch();
		img1 = new Texture("Mario.jpg");
		img2 = new Texture ("Moneda.png");
		img3 = new Texture("Moneda.png");
		img4 = new Texture("Moneda.png");
		img5 = new Texture ("FB.png");
		img6 = new Texture ("GO.png");
		img7 = new Texture("Nub.png");
		img8 = new Texture("Nub.png");

	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(img1, -490, -120);
		batch.draw(img2, 550, 330);
		batch.draw(img3, 500, 330);
		batch.draw(img4, 450, 330);
		batch.draw(img5, 100, 70);
		batch.draw(img6, mover, 30);
	//Nube1
		
		nx--;
		if(nx<-300){
			nx=700;
		}
		batch.draw(img7, nx, ny);
		batch.draw(img8, n2x, n2y);

	//Nube2

		n2x--;
		if (n2x<-300){
			n2x=700;
		}
	//Enemigo

		if(t==false){
			mover--;
		}
		if(mover==505){
			t=false;
		}
		if(mover==400){
			t=true;
		}
		if(t==true){
			mover++;
		}


		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img1.dispose();
		img2.dispose();
		img3.dispose();
		img4.dispose();
		img5.dispose();
		img6.dispose();
		img7.dispose();
		img8.dispose();

	}
}
