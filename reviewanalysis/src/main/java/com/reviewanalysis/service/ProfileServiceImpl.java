package com.reviewanalysis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reviewanalysis.entity.Profile;
import com.reviewanalysis.repository.ProfileRepository;

@Service
public class ProfileServiceImpl implements ProfileService{

	
	
	@Autowired
	ProfileRepository profileRepository;
	
	
	@Override
	public Profile addProfile(Profile profile) throws Exception {
		// TODO Auto-generated method stub
		Profile savedProfile =profileRepository.save(profile);
		if(savedProfile!=null) {
			return savedProfile;
		}else
			return null;
	}


	@Override
	public Profile updateProfile(Profile profile) throws Exception 
	{
		Profile savedProfile=profileRepository.save(profile);
		return savedProfile;
	}


	@Override
	public String deleteProfileById(Integer profileId) throws Exception 
	{
		profileRepository.deleteById(profileId);
		return "deleted successfully";
		
	}


	@Override
	public List<Profile> getAllProfile() throws Exception {
	        List<Profile> allProfile = profileRepository.findAll();
	        return allProfile;
	}

	
}
