package com.boot.kube.demo.kube.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.boot.kube.demo.kube.model.User;

@Repository
public interface UserDao extends CrudRepository<User, Integer>
{
	
/*List<Alien> findByTech(String tech);

List<Alien> findByAidGreaterThan(int aid);

@Query("from Alien where tech=?1 order by aname")
List<Alien>findByTechSorted(String tech);*/
	
}
