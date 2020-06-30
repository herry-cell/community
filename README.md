## 工具
[Git](https://git-scm.com/download)
[Flyway](https://flywaydb.org/getstarted/firststeps/maven)
[Lombok](https://projectlombok.org/setup/maven)

## 脚本
```sql
create table user
(
	id int auto_increment,
	account_id varchar(100),
	name varchar(50),
	token char(36),
	gmt_create BIGINT,
	gmt_modified BIGINT,
	constraint table_name_pk
		primary key (id)
);
```
```bash
mvn flyway:migrate
```


## 资料
[bootstrap](https://v3.bootcss.com/)
[elasticsearch](https://elasticsearch.cn/)
[interceptor](https://docs.spring.io/spring/docs/5.0.3.RELEASE/spring-framework-reference/web.html#mvc-config-interceptors)
