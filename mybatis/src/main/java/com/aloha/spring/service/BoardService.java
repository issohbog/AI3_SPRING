package com.aloha.spring.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.aloha.spring.dto.Board;


public interface BoardService {
	public List<Board> list() throws Exception;
	
	public Board select(int no) throws Exception;
	
	public boolean insert(Board board) throws Exception;
	
	public boolean update(Board board) throws Exception;
	
	public boolean delete(int no) throws Exception;
}
