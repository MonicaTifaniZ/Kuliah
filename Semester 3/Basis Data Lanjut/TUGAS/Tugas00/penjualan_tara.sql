/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     11-Sep-18 11:55:04 AM                        */
/*==============================================================*/


drop table if exists BARANG;

drop table if exists DETAIL_TRANS1;

drop table if exists DETAIL_TRANS2;

drop table if exists KONSUMEN;

drop table if exists PEMBELI;

drop table if exists PENJUAL;

drop table if exists PETUGAS;

drop table if exists RETUR;

drop table if exists SUPPLIER;

/*==============================================================*/
/* Table: BARANG                                                */
/*==============================================================*/
create table BARANG
(
   ID_BARANG            varchar(20) not null,
   NAMA_BARANG          varchar(20) not null,
   HARGA                float(15) not null,
   STOK                 varchar(20),
   primary key (ID_BARANG)
);

/*==============================================================*/
/* Table: DETAIL_TRANS1                                         */
/*==============================================================*/
create table DETAIL_TRANS1
(
   ID_PENJUAL           varchar(20) not null,
   ID_BARANG            varchar(20) not null,
   ID_DETAILTRANS1      varchar(20) not null,
   primary key (ID_DETAILTRANS1)
);

/*==============================================================*/
/* Table: DETAIL_TRANS2                                         */
/*==============================================================*/
create table DETAIL_TRANS2
(
   ID_BARANG            varchar(20) not null,
   ID_PEMBELI           varchar(20) not null,
   ID_DETAILTRANS2      varchar(20) not null,
   primary key (ID_DETAILTRANS2)
);

/*==============================================================*/
/* Table: KONSUMEN                                              */
/*==============================================================*/
create table KONSUMEN
(
   ID_KONSUMEN          varchar(20) not null,
   NAMA_KONSUMEN        varchar(20),
   ALAMAT_KON           varchar(20),
   primary key (ID_KONSUMEN)
);

/*==============================================================*/
/* Table: PEMBELI                                               */
/*==============================================================*/
create table PEMBELI
(
   ID_PEMBELI           varchar(20) not null,
   ID_RETUR             varchar(20),
   ID_SUPPLIER          varchar(20),
   ID_PETUGAS           varchar(20),
   NAMA_PEMBELI         varchar(20),
   TOTAL_BELI           varchar(20),
   ALAMAT_PEMBELI       varchar(20),
   primary key (ID_PEMBELI)
);

/*==============================================================*/
/* Table: PENJUAL                                               */
/*==============================================================*/
create table PENJUAL
(
   ID_PENJUAL           varchar(20) not null,
   ID_PETUGAS           varchar(20),
   ID_KONSUMEN          varchar(20),
   NAMA_PENJUAL         varchar(20),
   ALAMAT_PENJUAL       varchar(20),
   primary key (ID_PENJUAL)
);

/*==============================================================*/
/* Table: PETUGAS                                               */
/*==============================================================*/
create table PETUGAS
(
   ID_PETUGAS           varchar(20) not null,
   NAMA_PET             varchar(25) not null,
   ALAMAT_PET           varchar(20),
   TELP_PET             varchar(15),
   primary key (ID_PETUGAS)
);

/*==============================================================*/
/* Table: RETUR                                                 */
/*==============================================================*/
create table RETUR
(
   ID_RETUR             varchar(20) not null,
   ID_PEMBELI           varchar(20),
   ID_PETUGAS           varchar(20),
   TANGGAL_PEM          date not null,
   TANGGAL_PENG         date not null,
   primary key (ID_RETUR)
);

/*==============================================================*/
/* Table: SUPPLIER                                              */
/*==============================================================*/
create table SUPPLIER
(
   ID_SUPPLIER          varchar(20) not null,
   NAMA_SUPLIER         varchar(20),
   ALAMAT_SUP           varchar(20),
   primary key (ID_SUPPLIER)
);

alter table DETAIL_TRANS1 add constraint FK_RELATIONSHIP_5 foreign key (ID_PENJUAL)
      references PENJUAL (ID_PENJUAL) on delete restrict on update restrict;

alter table DETAIL_TRANS1 add constraint FK_RELATIONSHIP_6 foreign key (ID_BARANG)
      references BARANG (ID_BARANG) on delete restrict on update restrict;

alter table DETAIL_TRANS2 add constraint FK_RELATIONSHIP_7 foreign key (ID_BARANG)
      references BARANG (ID_BARANG) on delete restrict on update restrict;

alter table DETAIL_TRANS2 add constraint FK_RELATIONSHIP_8 foreign key (ID_PEMBELI)
      references PEMBELI (ID_PEMBELI) on delete restrict on update restrict;

alter table PEMBELI add constraint FK_RELATIONSHIP_1 foreign key (ID_PETUGAS)
      references PETUGAS (ID_PETUGAS) on delete restrict on update restrict;

alter table PEMBELI add constraint FK_RELATIONSHIP_11 foreign key (ID_RETUR)
      references RETUR (ID_RETUR) on delete restrict on update restrict;

alter table PEMBELI add constraint FK_RELATIONSHIP_9 foreign key (ID_SUPPLIER)
      references SUPPLIER (ID_SUPPLIER) on delete restrict on update restrict;

alter table PENJUAL add constraint FK_RELATIONSHIP_2 foreign key (ID_PETUGAS)
      references PETUGAS (ID_PETUGAS) on delete restrict on update restrict;

alter table PENJUAL add constraint FK_RELATIONSHIP_4 foreign key (ID_KONSUMEN)
      references KONSUMEN (ID_KONSUMEN) on delete restrict on update restrict;

alter table RETUR add constraint FK_RELATIONSHIP_10 foreign key (ID_PEMBELI)
      references PEMBELI (ID_PEMBELI) on delete restrict on update restrict;

alter table RETUR add constraint FK_RELATIONSHIP_3 foreign key (ID_PETUGAS)
      references PETUGAS (ID_PETUGAS) on delete restrict on update restrict;

