/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     16-Sep-18 1:15:52 PM                         */
/*==============================================================*/


drop table if exists BARANG_HP;

drop table if exists KARYAWAN;

drop table if exists PELANGGAN;

drop table if exists TIPE_HP;

drop table if exists TRANSJUAL;

/*==============================================================*/
/* Table: BARANG_HP                                             */
/*==============================================================*/
create table BARANG_HP
(
   NOSERI               varchar(25) not null,
   KD_MERK              varchar(25),
   WARNA                varchar(20) not null,
   primary key (NOSERI)
);

/*==============================================================*/
/* Table: KARYAWAN                                              */
/*==============================================================*/
create table KARYAWAN
(
   KD_KAR               varchar(20) not null,
   NAMAK                varchar(35) not null,
   JABATAN              varchar(20) not null,
   ALAMATK              varchar(35) not null,
   TELPK                varchar(15) not null,
   primary key (KD_KAR)
);

/*==============================================================*/
/* Table: PELANGGAN                                             */
/*==============================================================*/
create table PELANGGAN
(
   KD_PEL               varchar(25) not null,
   NAMAP                varchar(35) not null,
   ALAMATP              varchar(30) not null,
   TELPP                varchar(20) not null,
   primary key (KD_PEL)
);

/*==============================================================*/
/* Table: TIPE_HP                                               */
/*==============================================================*/
create table TIPE_HP
(
   KD_MERK              varchar(25) not null,
   MERK                 varchar(20) not null,
   TYPE                 varchar(15) not null,
   HARGA                int not null,
   primary key (KD_MERK)
);

/*==============================================================*/
/* Table: TRANSJUAL                                             */
/*==============================================================*/
create table TRANSJUAL
(
   NOTA                 varchar(25) not null,
   TANGGAL              date not null,
   KD_MERK              varchar(25),
   NOSERI               varchar(25),
   KD_KAR               varchar(20),
   KD_PEL               varchar(25),
   TOTAL                float not null,
   primary key (NOTA)
);

alter table BARANG_HP add constraint FK_RELATIONSHIP_6 foreign key (KD_MERK)
      references TIPE_HP (KD_MERK) on delete restrict on update restrict;

alter table TRANSJUAL add constraint FK_RELATIONSHIP_2 foreign key (KD_KAR)
      references KARYAWAN (KD_KAR) on delete restrict on update restrict;

alter table TRANSJUAL add constraint FK_RELATIONSHIP_3 foreign key (KD_PEL)
      references PELANGGAN (KD_PEL) on delete restrict on update restrict;

alter table TRANSJUAL add constraint FK_RELATIONSHIP_4 foreign key (NOSERI)
      references BARANG_HP (NOSERI) on delete restrict on update restrict;

alter table TRANSJUAL add constraint FK_RELATIONSHIP_5 foreign key (KD_MERK)
      references TIPE_HP (KD_MERK) on delete restrict on update restrict;

