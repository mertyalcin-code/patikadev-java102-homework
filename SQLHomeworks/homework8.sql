/* test veritabanınızda employee isimli sütun bilgileri id(INTEGER), name VARCHAR(50), birthday DATE, email VARCHAR(100) olan bir tablo oluşturalım.
Oluşturduğumuz employee tablosuna 'Mockaroo' servisini kullanarak 50 adet veri ekleyelim.
Sütunların her birine göre diğer sütunları güncelleyecek 5 adet UPDATE işlemi yapalım.
Sütunların her birine göre ilgili satırı silecek 5 adet DELETE işlemi yapalım.
*/
Create table employee (
                          id integer not null primary key,
                          name varchar(50) not null,
                          birthday date not null,
                          email varchar(100) not null
);
insert into employee (id, name, birthday, email) values (1, 'Rodrick', '21/08/2021', 'rliddington0@is.gd');
insert into employee (id, name, birthday, email) values (2, 'Prinz', '12/05/2021', 'psproat1@fc2.com');
insert into employee (id, name, birthday, email) values (3, 'Kalvin', '05/08/2021', 'kcoper2@wsj.com');
insert into employee (id, name, birthday, email) values (4, 'Finn', '01/06/2021', 'fblankau3@webmd.com');
insert into employee (id, name, birthday, email) values (5, 'Dwight', '17/03/2021', 'driggulsford4@hc360.com');
insert into employee (id, name, birthday, email) values (6, 'Kennie', '28/08/2021', 'kgary5@ucoz.com');
insert into employee (id, name, birthday, email) values (7, 'Celene', '19/11/2021', 'chousecraft6@over-blog.com');
insert into employee (id, name, birthday, email) values (8, 'Panchito', '21/06/2021', 'pstuttard7@dyndns.org');
insert into employee (id, name, birthday, email) values (9, 'Maximilianus', '25/05/2021', 'msolan8@shutterfly.com');
insert into employee (id, name, birthday, email) values (10, 'Kahaleel', '21/10/2021', 'krosas9@irs.gov');
insert into employee (id, name, birthday, email) values (11, 'Evan', '09/10/2021', 'epurringtona@163.com');
insert into employee (id, name, birthday, email) values (12, 'Penn', '15/08/2021', 'pserjentb@wiley.com');
insert into employee (id, name, birthday, email) values (13, 'Katinka', '19/06/2021', 'kponcefordc@live.com');
insert into employee (id, name, birthday, email) values (14, 'Katalin', '03/07/2021', 'klafuented@hugedomains.com');
insert into employee (id, name, birthday, email) values (15, 'Pepe', '18/05/2021', 'poosthoutdevreee@cargocollective.com');
insert into employee (id, name, birthday, email) values (16, 'Dalton', '17/11/2021', 'ddudlestonef@senate.gov');
insert into employee (id, name, birthday, email) values (17, 'Reeba', '16/09/2021', 'rtendahlg@wp.com');
insert into employee (id, name, birthday, email) values (18, 'Torre', '18/01/2021', 'tmargetsonh@flavors.me');
insert into employee (id, name, birthday, email) values (19, 'Kimberlyn', '30/08/2021', 'klelievrei@slideshare.net');
insert into employee (id, name, birthday, email) values (20, 'Raquela', '03/03/2021', 'rrickaertj@google.com.br');
insert into employee (id, name, birthday, email) values (21, 'Minne', '13/02/2021', 'mcoullingk@usa.gov');
insert into employee (id, name, birthday, email) values (22, 'Yalonda', '03/07/2021', 'ypykettl@deviantart.com');
insert into employee (id, name, birthday, email) values (23, 'Lutero', '14/02/2021', 'lcaldecotm@themeforest.net');
insert into employee (id, name, birthday, email) values (24, 'Phil', '04/11/2021', 'pbaldacchin@oracle.com');
insert into employee (id, name, birthday, email) values (25, 'Marci', '20/10/2021', 'mseveno@surveymonkey.com');
insert into employee (id, name, birthday, email) values (26, 'Clarette', '27/02/2021', 'cangrockp@ameblo.jp');
insert into employee (id, name, birthday, email) values (27, 'Hewett', '22/07/2021', 'hkeyesq@craigslist.org');
insert into employee (id, name, birthday, email) values (28, 'Ronnica', '27/10/2021', 'rbundeyr@over-blog.com');
insert into employee (id, name, birthday, email) values (29, 'Jarid', '30/03/2021', 'jlangtrys@networkadvertising.org');
insert into employee (id, name, birthday, email) values (30, 'Ginni', '01/04/2021', 'gmalonet@360.cn');
insert into employee (id, name, birthday, email) values (31, 'Gloriana', '05/05/2021', 'griggu@ustream.tv');
insert into employee (id, name, birthday, email) values (32, 'Olivie', '06/04/2021', 'odraxfordv@istockphoto.com');
insert into employee (id, name, birthday, email) values (33, 'Berenice', '11/12/2021', 'bswindallw@redcross.org');
insert into employee (id, name, birthday, email) values (34, 'Brander', '14/06/2021', 'blishmundx@bandcamp.com');
insert into employee (id, name, birthday, email) values (35, 'Esma', '14/06/2021', 'escrymgeoury@sciencedirect.com');
insert into employee (id, name, birthday, email) values (36, 'Chlo', '25/09/2021', 'ccharletz@intel.com');
insert into employee (id, name, birthday, email) values (37, 'Janek', '21/07/2021', 'jmilthorpe10@scribd.com');
insert into employee (id, name, birthday, email) values (38, 'Frederique', '11/05/2021', 'fkingzet11@tuttocitta.it');
insert into employee (id, name, birthday, email) values (39, 'Marya', '01/04/2021', 'mrochell12@amazon.com');
insert into employee (id, name, birthday, email) values (40, 'Shannah', '28/11/2021', 'svauter13@bizjournals.com');
insert into employee (id, name, birthday, email) values (41, 'Marlyn', '01/08/2021', 'mbartak14@t-online.de');
insert into employee (id, name, birthday, email) values (42, 'Lawton', '13/06/2021', 'lmcaleese15@prweb.com');
insert into employee (id, name, birthday, email) values (43, 'Powell', '15/08/2021', 'pmuslim16@sphinn.com');
insert into employee (id, name, birthday, email) values (44, 'Jaime', '18/12/2021', 'jclose17@cbsnews.com');
insert into employee (id, name, birthday, email) values (45, 'Zulema', '26/04/2021', 'zarondel18@wunderground.com');
insert into employee (id, name, birthday, email) values (46, 'Talbot', '23/05/2021', 'tcutten19@smh.com.au');
insert into employee (id, name, birthday, email) values (47, 'Fara', '16/06/2021', 'fstange1a@so-net.ne.jp');
insert into employee (id, name, birthday, email) values (48, 'Benedikt', '12/09/2021', 'blightbody1b@yellowbook.com');
insert into employee (id, name, birthday, email) values (49, 'Queenie', '04/09/2021', 'qtait1c@paypal.com');
insert into employee (id, name, birthday, email) values (50, 'Correna', '06/10/2021', 'cwilne1d@salon.com');


update employee set id=1000,name='updated',birthday='07/01/1994',email='fake@fake.com'  where id=1;
update employee set id=1001,name='updated',birthday='07/01/1994',email='fake@fake.com'  where id=2;
update employee set id=1002,name='updated',birthday='07/01/1994',email='fake@fake.com'  where id=3;
update employee set id=1003,name='updated',birthday='07/01/1994',email='fake@fake.com'  where id=4;
update employee set id=1004,name='updated',birthday='07/01/1994',email='fake@fake.com'  where id=5;

delete from employee where id=6;
delete from employee where id=7;
delete from employee where id=8;
delete from employee where id=9;
delete from employee where id=10;

select * from employee;