package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.entity.Visits;

public interface IVisitService {
	
	public Visits addvisit(Visits visit);
	public void updateDateByVisitId(Visits visit);
	public List<Visits> getAllVisits();
	public Visits findByIdd(Long id);
	public List<Visits> findByuserId(Long id);
	public void deleteVisit(Long visitId);
	public void updateVisitById(Visits prop, Long id);
	public List<Visits> findViByIdUser(Long id);
	
	
}
