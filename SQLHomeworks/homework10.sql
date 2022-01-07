select city.city ,country.country from city left join country on city.country_id = country.country_id;
select payment.payment_id,customer.first_name,customer.last_name from customer right join payment on payment.customer_id = customer.customer_id;
select r.rental_id, c.first_name,c.last_name from customer c full join rental r on r.customer_id=c.customer_id;

/*
city tablosu ile country tablosunda bulunan şehir (city) ve ülke (country) isimlerini birlikte görebileceğimiz LEFT JOIN sorgusunu yazınız.
customer tablosu ile payment tablosunda bulunan payment_id ile customer tablosundaki first_name ve last_name isimlerini birlikte görebileceğimiz RIGHT JOIN sorgusunu yazınız.
customer tablosu ile rental tablosunda bulunan rental_id ile customer tablosundaki first_name ve last_name isimlerini birlikte görebileceğimiz FULL JOIN sorgusunu yazınız.
*/