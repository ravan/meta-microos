SUMMARY = "Administration of PostgreSQL over the web"
DESCRIPTION = "phpPgAdmin is a web-based administration tool for PostgreSQL. It is \
perfect for PostgreSQL DBAs, newbies and hosting services. \
 \
Features \
 \
* Administer multiple servers \
* Support for PostgreSQL 9.x.x, 10.x, 11.x, 12.x, 14.x \
* Manage all aspects of: \
	o Users &amp; groups \
	o Databases \
	o Schemas \
	o Tables, indexes, constraints, triggers, rules &amp; privileges \
	o Views, sequences &amp; functions \
	o Advanced objects \
	o Reports \
* Easy data manipulation: \
	o Browse tables, views &amp; reports \
	o Execute arbitrary SQL \
	o Select, insert, update and delete \
* Dump table data in a variety of formats: SQL, COPY, XML, XHTML, CSV, Tabbed, pg_dump \
* Import SQL scripts, COPY data, XML, CSV and Tabbed \
* Supports the Slony master-slave replication engine \
* Excellent language support: \
	o Available in 27 languages \
	o No encoding conflicts. Edit Russian data using a Japanese interface! \
* Easy to install and configure"
LICENSE = "GPL-2.0-or-later"

PV = "7.14.7"

RPM_NAME = "phpPgAdmin-7.14.7-1.3.noarch.rpm"
RPM_HASH = "d311964198d11b9d673035ed7b8db76e62789068ba7fc989677d0c41092500b262ec30e16d2339317be495d2a1788c8122f89a7fb8f04b0e5d8cb3fc658f61a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-phpPgAdmin \
phpPgAdmin"

RDEPENDS:${PN} += "group-www \
php \
php-pgsql \
user-wwwrun"

inherit rpm
