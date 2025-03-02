package com.saad.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.batch.BatchProperties.Job;
import org.springframework.stereotype.Service;

import com.saad.model.Register;
import com.saad.repository.RegisterRepository;
@Service
public class RegisterService {
@Autowired
RegisterRepository rrepo;
public void addData(Register j)
{
    rrepo.save(j);
}
public Register updateData(String uname)
{
	Register r = rrepo.findById(uname).orElse(null);
	if(r!=null)
	{
		r.setPass("123464");
		r.setNm("SAAD ABBAS");
		r.setPhno("7047249367");
		r.setEmail("asdfhj@gmail.com");
		rrepo.save(r);
	}
	return r;
	 }

public void deleteData(String uname)
{ 
	Register r = rrepo.findById(uname).orElse(null);
	rrepo.delete(r);
}

public List<Register> getData()
{
	return rrepo.findAll();
}

}
