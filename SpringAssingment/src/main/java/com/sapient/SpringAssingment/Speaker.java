package com.sapient.SpringAssingment;

public class Speaker {
	private int vol_levels;
	private String speaker_type;

	public int getVol_levels() {
		return vol_levels;
	}

	public void setVol_levels(int vol_levels) {
		this.vol_levels = vol_levels;
	}

	public String getSpeaker_type() {
		return speaker_type;
	}

	public void setSpeaker_type(String speaker_type) {
		this.speaker_type = speaker_type;
	}

	public void compile() {
		System.out.println("Speaker is working fine!");
	}

}
