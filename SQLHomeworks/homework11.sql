/*
actor ve customer tablolarında bulunan first_name sütunları için tüm verileri sıralayalım.
actor ve customer tablolarında bulunan first_name sütunları için kesişen verileri sıralayalım.
actor ve customer tablolarında bulunan first_name sütunları için ilk tabloda bulunan ancak ikinci tabloda bulunmayan verileri sıralayalım.
İlk 3 sorguyu tekrar eden veriler için de yapalım.
*/
(select actor.first_name from actor order by first_name) union (select customer.first_name from customer);
(select actor.first_name from actor order by first_name) intersect (select customer.first_name from customer);
(select actor.first_name from actor order by first_name) except (select customer.first_name from customer);

(select actor.first_name from actor order by first_name) union all (select customer.first_name from customer);
(select actor.first_name from actor order by first_name) intersect all (select customer.first_name from customer);
(select actor.first_name from actor order by first_name) except all(select customer.first_name from customer);
