/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     16-May-18 9:35:14 AM                         */
/*==============================================================*/


drop table if exists BUKU;

drop table if exists MEMBER;

drop table if exists PETUGAS;

drop table if exists PINJAM;

/*==============================================================*/
/* Table: BUKU                                                  */
/*==============================================================*/
create table BUKU
(
   IDBUKU               varchar(25) not null,
   NAMABUKU             varchar(25) not null,
   STOCK                int not null,
   STATUS               varchar(8) not null,
   primary key (IDBUKU)
);

/*==============================================================*/
/* Table: MEMBER                                                */
/*==============================================================*/
create table MEMBER
(
   IDMEMBER             varchar(25) not null,
   NAMAMEMBER           varchar(25) not null,
   JK                   char(1) not null,
   ALAMAT               varchar(25) not null,
   TLP                  varchar(15) not null,
   primary key (IDMEMBER)
);

/*==============================================================*/
/* Table: PETUGAS                                               */
/*==============================================================*/
create table PETUGAS
(
   IDPETUGAS            varchar(25) not null,
   NAMAPETUGAS          varchar(25) not null,
   JK                   char(1) not null,
   ALAMAT               varchar(25) not null,
   TLP                  varchar(15) not null,
   primary key (IDPETUGAS)
);

/*==============================================================*/
/* Table: PINJAM                                                */
/*==============================================================*/
create table PINJAM
(
   IDBUKU               varchar(25),
   IDMEMBER             varchar(25),
   ID_PETUGAS           varchar(25),
   JUMLAHPINJAM         int,
   TGLPINJAM            datetime,
   TGLHRSKEMBALI        datetime,
   TGLKEMBALI           datetime,
   STATUS               varchar(8)
);

alter table PINJAM add constraint FK_RELATIONSHIP_1 foreign key (IDMEMBER)
      references MEMBER (IDMEMBER) on delete restrict on update restrict;

alter table PINJAM add constraint FK_RELATIONSHIP_2 foreign key (IDBUKU)
      references BUKU (IDBUKU) on delete restrict on update restrict;

