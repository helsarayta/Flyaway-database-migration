create table tbl_product (
  id bigint(20) not null auto_increment,
  name varchar(255) not null,
  description varchar(255) not null,
  imageUrl varchar(255) not null,
  category varchar(255) not null,
  price decimal (20) not null,
  primary key (id),
  unique key UK_product (name)
) engine=InnoDB default charset=utf8;
