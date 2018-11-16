/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     12-Sep-18 9:37:29 AM                         */
/*==============================================================*/


drop table if exists DEPARTEMENT;

drop table if exists EMPLOYEE;

/*==============================================================*/
/* Table: DEPARTEMENT                                           */
/*==============================================================*/
create table DEPARTEMENT
(
   DNUMBER              varchar(15) not null,
   MGRSSN               varchar(15),
   DNAME                varchar(15) not null,
   primary key (DNUMBER)
);

/*==============================================================*/
/* Table: EMPLOYEE                                              */
/*==============================================================*/
create table EMPLOYEE
(
   SSN                  varchar(15) not null,
   SUPERSSN             varchar(15),
   DNO                  varchar(15),
   ENAME                varchar(35) not null,
   SALARY               int not null,
   primary key (SSN)
);

alter table DEPARTEMENT add constraint FK_RELATIONSHIP_2 foreign key (MGRSSN)
      references EMPLOYEE (SSN) on delete restrict on update restrict;

alter table EMPLOYEE add constraint FK_RELATIONSHIP_1 foreign key (SUPERSSN)
      references EMPLOYEE (SSN) on delete restrict on update restrict;

alter table EMPLOYEE add constraint FK_RELATIONSHIP_3 foreign key (DNO)
      references DEPARTEMENT (DNUMBER) on delete restrict on update restrict;

