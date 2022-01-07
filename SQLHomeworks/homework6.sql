select avg(rental_rate) from film;
select count(title) from film where title like('C%');
select film.length from film where rental_rate=0.99 order by film.length desc limit 1;
select count(distinct replacement_cost) from film where film.length>150;
/*

film tablosunda bulunan rental_rate sütunundaki değerlerin ortalaması nedir?
film tablosunda bulunan filmlerden kaç tanesi 'C' karakteri ile başlar?
film tablosunda bulunan filmlerden rental_rate değeri 0.99 a eşit olan en uzun (length) film kaç dakikadır?
film tablosunda bulunan filmlerin uzunluğu 150 dakikadan büyük olanlarına ait kaç farklı replacement_cost değeri vardır?

*/