package com.qa.pages;

public class ProfilePage {

	
	
	private String profileName;
	
	private int profileId;
	
	private String location;
	
	
	public ProfilePage() {
		// TODO Auto-generated constructor stub
	}


	public ProfilePage(String profileName, int profileId, String location) {
		super();
		this.profileName = profileName;
		this.profileId = profileId;
		this.location = location;
	}

	
	

	public String getProfileName() {
		return profileName;
	}


	public void setProfileName(String profileName) {
		this.profileName = profileName;
	}


	public int getProfileId() {
		return profileId;
	}


	public void setProfileId(int profileId) {
		this.profileId = profileId;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	@Override
	public String toString() {
		return "ProfilePage [profileName=" + profileName + ", profileId=" + profileId + ", location=" + location + "]";
	}
	
	
	
}
