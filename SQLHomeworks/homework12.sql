select count(*) from film where length > (select Avg(length) from film);
select count(*) from film where rental_Rate = any (select max(rental_rate) from film);
select * from film where rental_Rate = any (select min(rental_rate) from film) and replacement_cost = any (select min(replacement_cost) from film);
SELECT customer_id,count(*) FROM payment GROUP BY customer_id HAVING COUNT(*) >= ALL(
    SELECT COUNT(*)
    FROM payment
    GROUP BY customer_id
)
order by count(*) desc
/*
film tablosunda film uzunluğu length sütununda gösterilmektedir. Uzunluğu ortalama film uzunluğundan fazla kaç tane film vardır?
film tablosunda en yüksek rental_rate değerine sahip kaç tane film vardır?
film tablosunda en düşük rental_rate ve en düşün replacement_cost değerlerine sahip filmleri sıralayınız.
payment tablosunda en fazla sayıda alışveriş yapan müşterileri(customer) sıralayınız.
*/