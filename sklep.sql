BEGIN TRANSACTION;
CREATE TABLE zamowienia(
  zid integer primary key autoincrement,
  pid integer,
  kid integer,
  ilosc integer,
  foreign key(kid) references klienci(kid),
  foreign key(pid) references produkty(pid)
);
INSERT INTO `zamowienia` VALUES ('0','1','1','12');
INSERT INTO `zamowienia` VALUES ('1','1','1','1');
INSERT INTO `zamowienia` VALUES ('2','1','1','2');
INSERT INTO `zamowienia` VALUES ('3','3','3','100');
INSERT INTO `zamowienia` VALUES ('4','1','3','15');
INSERT INTO `zamowienia` VALUES ('5','1','2','20');
INSERT INTO `zamowienia` VALUES ('6','2','3','20');
CREATE TABLE "produkty" (
	`pid`	INTEGER,
	`nazwa`	TEXT,
	`cena`	INTERGER,
	PRIMARY KEY(pid)
);
INSERT INTO `produkty` VALUES ('1','GPU','12');
INSERT INTO `produkty` VALUES ('2','AMD_CPU','10');
INSERT INTO `produkty` VALUES ('3','INTEL_CPU','15');
CREATE TABLE klienci (kid INTEGER PRIMARY KEY, nazwisko TEXT, imie TEXT);
INSERT INTO `klienci` VALUES ('1','Tianchen','Lou');
INSERT INTO `klienci` VALUES ('2','Chengdu','Tao');
INSERT INTO `klienci` VALUES ('3','Binjie','Fang');
COMMIT;
