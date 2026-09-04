-- Question : https://www.hackerrank.com/challenges/japanese-cities-attributes/problem
select ID, NAME, COUNTRYCODE, DISTRICT, POPULATION
from CITY
where COUNTRYCODE = 'JPN';
