--tbl_boards2 테이블의 content컬럼 크기를 4000으로 변경
alter table tbl_boards2 modify (content varchar2(4000));

--bno_seq2 시퀀스 메모리를 사용하지 않기
alter sequence bno_seq2 nocache;