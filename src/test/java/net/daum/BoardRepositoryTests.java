package net.daum;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import net.daum.dao.BoardRepository;
import net.daum.vo.BoardVO;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardRepositoryTests {
	
	@Autowired
	private BoardRepository boardRepo;
	
	@Test
	public void testInsertBoard() {
		BoardVO b = new BoardVO();
		
		b.setWriter("홍길동");
		b.setTitle("게시판 제목입니다.");
		b.setContent("게시판 내용입니다.");
		
		//this.boardRepo.save(b);//게시판 저장
	}//tbl_boards2 테이블에 레코드 저장
	
	@Test
	public void testBoardRead() {
		//Optional<BoardVO> b = this.boardRepo.findById(1);//1번 레코드를 검색
		//System.out.println(b);
	}//게시판 조회
	
	@Test
	public void testBoardEdit() {
		/*Optional<BoardVO> eb = this.boardRepo.findById(1); //1번 레코드 검색
		
		eb.ifPresent(ebBoard->{//검색된 자료가 있으면
			ebBoard.setWriter("수정 홍길동");
			ebBoard.setTitle("수정 게시판 제목입니다.");
			ebBoard.setContent("수정 게시판 내용입니다.");
			
			System.out.println("\n==============> 게시판 수정");
			this.boardRepo.save(ebBoard);//1번 레코드를 수정
		}); */
	}//게시판 수정
	
	@Test
	public void testBoardDel() {
		System.out.println(" \n ===========================> 게시판 삭제");
		this.boardRepo.deleteById(1);//1번 레코드 삭제
	}//삭제
}







