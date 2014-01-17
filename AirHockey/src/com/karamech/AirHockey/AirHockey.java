 package com.karamech.AirHockey;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Game;
import com.karamech.AirHockey.screens.SplashScreen;

public class AirHockey extends Game{
	
	public static final String TITLE = "AirHockey", VERSION = "0.0.0";

	@Override
	public void create() {
		setScreen(new SplashScreen());
		
	}

	@Override
	public void resize(int width, int height) {
		super.resize(width, height);
		
	}

	@Override
	public void render() {
		super.render();
		
	}

	@Override
	public void pause() {
		super.pause();
		
	}

	@Override
	public void resume() {
		super.resume();
		
	}

	@Override
	public void dispose() {
		super.dispose();
		
	}
	

}
