-- 산술 연산자

select 100*10,employee_id from employees;
select 100*10 from dual;--oracle 에서는 연산 계산 할때는 dual테이블을 이용하면됨    mysql은 그냥 됨

select salary  as "본봉", salary+salary*0.3 as "보너스" from employees;

select -salary from employees;


--null을 산술 연산식에 사용하면 결과는 무조건 null
select first_name || ' ' || last_name as "이름", (salary+(salary*commission_pct))*12 as"연봉" from employees; 