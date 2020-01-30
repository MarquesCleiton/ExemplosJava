create database cursinho;
use cursinho;

desc tblcurso;
desc tblaluno;

insert into tblcurso(nome, detalhes) values('java','Java básico');
insert into tblcurso(nome, detalhes) values('SQL','SQL básico');
insert into tblcurso(nome, detalhes) values('Paint','Paint avançado');

insert into tblaluno(nome, email, curso_id_curso) values('Cleiton','cleiton@marques', 1);
insert into tblaluno(nome, email, curso_id_curso) values('Mayara','may@why', 2);
insert into tblaluno(nome, email, curso_id_curso) values('Matheus','matheus@matiusch', 3);

select * from tblcurso;
