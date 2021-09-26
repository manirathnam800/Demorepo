package com.qa.pages;

public class ProfilePage {
	
	
	private String profileName;
	
	private int profileId;
	
	public ProfilePage() {
		// TODO Auto-generated constructor stub
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



	@Override
	public String toString() {
		return "ProfilePage [profileName=" + profileName + ", profileId=" + profileId + "]";
	}

}
