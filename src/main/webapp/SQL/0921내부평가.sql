--tbl_board10 테이블 생성
create table tbl_board10 (
    board_no number(38) primary key,
    board_title varchar2(200),
    board_cont varchar2(4000)
    );
    select * from tbl_board10;
    
    commit;
    select * from tbl_board10;
    insert into tbl_board10 values (board_no_seq10.nextval, '안녕', '하세요');
    commit;
 --board_no_seq10 번호 발생기 시퀀스 생성
  create sequence board_no_seq10
  start with 1 --1부터 시작
  increment by 1 --1씩 증가
  nocache --임시 메모리를 사용하지 않겠다는 의미
  nocycle;
  
  --시퀀스 번호값 확인
  select board_no_seq10.nextval from dual;