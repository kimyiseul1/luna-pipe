package kr.opensoftlab.lunaops.com.api.service;

import java.util.Map;



public interface ApiService {
	
	Object checkParamDataKey(String paramData) throws Exception;
	
	
	@SuppressWarnings("rawtypes")
	Map insertCIRepJenJob(Map paramMap) throws Exception;
	
	
	@SuppressWarnings("rawtypes")
	Map selectCIRepJenJob(Map paramMap) throws Exception;
	
	
	@SuppressWarnings({ "rawtypes"})
	Map selectTicketJobInfo(Map paramMap) throws Exception;
	
	
	@SuppressWarnings("rawtypes")
	Map insertCITicketJobList(Map paramMap) throws Exception;
	
	
	@SuppressWarnings({ "rawtypes" })
	Map insertJobBldLogInfo(Map paramMap) throws Exception;
	
	
	@SuppressWarnings({ "rawtypes" })
	Map insertJobBldAction(Map paramMap) throws Exception;
	
	
	@SuppressWarnings({ "rawtypes"})
	Map insertRepTicketBranchInfo(Map paramMap) throws Exception;
	
	
	@SuppressWarnings({ "rawtypes"})
	Map insertRepRevisionInfo(Map paramMap) throws Exception;
	
	
	@SuppressWarnings({ "rawtypes" })
	Map selectTicketRvDataList(Map paramMap) throws Exception;
	
	
	@SuppressWarnings({ "rawtypes" })
	Map selectTicketCheck(Map paramMap) throws Exception;
}
