package com.ltts.Team;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public class Teamdao 
{
	public List<Team> getTeam()
	{
		List<Team> listofTeams=new ArrayList<>();
		
		listofTeams.add(new Team(11,"CSK","Ashu")) ;
		listofTeams.add(new Team(22,"RCB","Malya")) ;
		listofTeams.add(new Team(33,"SRH","Aaa")) ;
		
		return listofTeams;
	}

}
