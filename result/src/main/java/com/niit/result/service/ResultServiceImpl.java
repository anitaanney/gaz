package com.niit.result.service;

	import java.util.List;

	import javax.transaction.Transactional;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;

import com.niit.result.dao.ResultDAO;
import com.niit.result.model.Result;
import com.niit.timetable.dao.TimetableDAO;
import com.niit.timetable.model.Timetable;


	@Service
	public class ResultServiceImpl  implements ResultService {
		@Autowired
		private ResultDAO resultDAO;
		
		@Override
		@Transactional
		public List<Result> getResults() {
			return resultDAO.getResults();
		}

		@Override
		@Transactional
		public void saveResult(Result theResult) {
			resultDAO.saveResult(theResult);
		}

		@Override
		@Transactional
		public Result getResult(int theId) {
			return resultDAO.getResult(theId);
		}

		@Override
		@Transactional
		public void deleteResult(int theId) {
			resultDAO.deleteResult(theId);
		}
	}
