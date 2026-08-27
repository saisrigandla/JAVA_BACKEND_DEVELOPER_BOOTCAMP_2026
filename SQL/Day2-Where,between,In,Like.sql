use placement_db;
select Id, Name, Age, Course
from students
where Id=2;

use placement_db;
select distinct Course
from students;

use placement_db;
select Name, Age
from students
where Age between 18 and 22;

use placement_db;
select Name, Age 
from students
where Age in (18,22);

use placement_db;
select Name 
from students
where name like '_ai';

