/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     10-Sep-18 9:22:52 PM                         */
/*==============================================================*/


drop table if exists ANGGOTA;

drop table if exists ANGSURAN;

drop table if exists JENIS_PINJAMAN;

drop table if exists JENIS_SIMPANAN;

drop table if exists PETUGAS;

drop table if exists PINJAMAN;

drop table if exists SIMPANAN;

/*==============================================================*/
/* Table: ANGGOTA                                               */
/*==============================================================*/
create table ANGGOTA
(
   ID_ANGGOTA           varchar(35) not null,
   NAMA_ANGGOTA         varchar(35) not null,
   ALAMAT               varchar(35) not null,
   TELP                 varchar(25) not null,
   primary key (ID_ANGGOTA)
);

/*==============================================================*/
/* Table: ANGSURAN                                              */
/*==============================================================*/
create table ANGSURAN
(
   ID_ANGSURAN          varchar(35) not null,
   ID_PINJAMAN          varchar(35),
   ID_ANGGOTA           varchar(35),
   ID_PETUGAS           varchar(35),
   JENIS_ANGSURAN       varchar(25) not null,
   SISA_ANGSURAN        float(35) not null,
   primary key (ID_ANGSURAN)
);

/*==============================================================*/
/* Table: JENIS_PINJAMAN                                        */
/*==============================================================*/
create table JENIS_PINJAMAN
(
   JENIS_PINJAMAN       varchar(35) not null,
   primary key (JENIS_PINJAMAN)
);

/*==============================================================*/
/* Table: JENIS_SIMPANAN                                        */
/*==============================================================*/
create table JENIS_SIMPANAN
(
   ID_JENISSIMPANAN     varchar(35) not null,
   primary key (ID_JENISSIMPANAN)
);

/*==============================================================*/
/* Table: PETUGAS                                               */
/*==============================================================*/
create table PETUGAS
(
   ID_PETUGAS           varchar(35) not null,
   JADWAL               datetime not null,
   NAMA_PETUGAS         varchar(35) not null,
   primary key (ID_PETUGAS)
);

/*==============================================================*/
/* Table: PINJAMAN                                              */
/*==============================================================*/
create table PINJAMAN
(
   ID_PINJAMAN          varchar(35) not null,
   ID_PETUGAS           varchar(35),
   ID_ANGGOTA           varchar(35),
   JENIS_PINJAMAN       varchar(35),
   TANGGAL_PINJAMAN     date not null,
   JUMLAH_PINJAMAN      float(35) not null,
   BUNGA                float(35) not null,
   primary key (ID_PINJAMAN)
);

/*==============================================================*/
/* Table: SIMPANAN                                              */
/*==============================================================*/
create table SIMPANAN
(
   ID_SIMPANAN          varchar(35) not null,
   ID_JENISSIMPANAN     varchar(35),
   ID_ANGGOTA           varchar(35),
   ID_PETUGAS           varchar(35),
   TANGGAL              date not null,
   SALDO                float(35) not null,
   primary key (ID_SIMPANAN)
);

alter table ANGSURAN add constraint FK_RELATIONSHIP_7 foreign key (ID_PINJAMAN)
      references PINJAMAN (ID_PINJAMAN) on delete restrict on update restrict;

alter table ANGSURAN add constraint FK_RELATIONSHIP_8 foreign key (ID_PETUGAS)
      references PETUGAS (ID_PETUGAS) on delete restrict on update restrict;

alter table ANGSURAN add constraint FK_RELATIONSHIP_9 foreign key (ID_ANGGOTA)
      references ANGGOTA (ID_ANGGOTA) on delete restrict on update restrict;

alter table PINJAMAN add constraint FK_RELATIONSHIP_10 foreign key (ID_ANGGOTA)
      references ANGGOTA (ID_ANGGOTA) on delete restrict on update restrict;

alter table PINJAMAN add constraint FK_RELATIONSHIP_4 foreign key (ID_PETUGAS)
      references PETUGAS (ID_PETUGAS) on delete restrict on update restrict;

alter table PINJAMAN add constraint FK_RELATIONSHIP_5 foreign key (JENIS_PINJAMAN)
      references JENIS_PINJAMAN (JENIS_PINJAMAN) on delete restrict on update restrict;

alter table SIMPANAN add constraint FK_RELATIONSHIP_11 foreign key (ID_ANGGOTA)
      references ANGGOTA (ID_ANGGOTA) on delete restrict on update restrict;

alter table SIMPANAN add constraint FK_RELATIONSHIP_2 foreign key (ID_PETUGAS)
      references PETUGAS (ID_PETUGAS) on delete restrict on update restrict;

alter table SIMPANAN add constraint FK_RELATIONSHIP_3 foreign key (ID_JENISSIMPANAN)
      references JENIS_SIMPANAN (ID_JENISSIMPANAN) on delete restrict on update restrict;

