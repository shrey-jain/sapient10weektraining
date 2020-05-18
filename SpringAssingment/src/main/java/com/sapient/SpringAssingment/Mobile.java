package com.sapient.SpringAssingment;

public class Mobile {
	private Screen screen;
	private Camera camera;
	private Speaker speaker;

	public Camera getCamera() {
		return camera;
	}

	public void setCamera(Camera camera) {
		this.camera = camera;
	}

	public Speaker getSpeaker() {
		return speaker;
	}

	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}

	public Screen getScreen() {
		return screen;
	}

	public void setScreen(Screen screen) {
		this.screen = screen;
	}

	public void code() {
		System.out.println("hello mobile");
		screen.compile();
		camera.compile();
		speaker.compile();
	}
}
