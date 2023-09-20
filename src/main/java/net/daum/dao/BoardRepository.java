package net.daum.dao;

import org.springframework.data.repository.CrudRepository;

import net.daum.vo.BoardVO;

public interface BoardRepository extends CrudRepository<BoardVO, Integer> {
 /* CrudRepository<엔티티빈 클래스명, 빈클래스 유일 식별키 @Id로 정의된 변수명 자료형 참조타입>
  * 
  * JpaRepository 인터페이스의 부모 인터페이스가 PagingAndSortingRepository에서 페이징과 정렬이라는
  * 기능을 제공한다.
  * PagingAndSortingRepository의 부모 인터페이스가 CrudRepository이다.
  * CrudRepository 인터페이스의 부모 인터페이스가 Repository이다.
  */
}
