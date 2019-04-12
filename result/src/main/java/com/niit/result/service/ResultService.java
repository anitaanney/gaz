package com.niit.result.service;

	import java.util.List;

import com.niit.result.model.Result;



public interface ResultService {

		public List <Result> getResults();
		
		public void saveResult(Result theResult);
		public Result getResult(int theId);
		public void deleteResult(int theId);

	
	}
