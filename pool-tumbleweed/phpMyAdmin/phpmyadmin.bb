SUMMARY = "Administration of MySQL over the web"
DESCRIPTION = "phpMyAdmin can manage a whole MySQL server (needs a super-user) as well as a \
single database. To accomplish the latter you'll need a properly set up MySQL \
user who can read/write only the desired database. It's up to you to look up \
the appropriate part in the MySQL manual. \
 \
Currently phpMyAdmin can: \
 \
  * browse and drop databases, tables, views, fields and indexes \
  * create, copy, drop, rename and alter databases, tables, fields and indexes \
  * maintenance server, databases and tables, with proposals on server \
    configuration \
  * execute, edit and bookmark any SQL-statement, even batch-queries \
  * load text files into tables \
  * create^1 and read dumps of tables \
  * export^1 data to various formats: CSV, XML, PDF, ISO/IEC 26300 - \
    OpenDocument Text and Spreadsheet, Word, Excel and L^AT[E]X formats \
  * import data and MySQL structures from Microsoft Excel and OpenDocument \
    spreadsheets, as well as XML, CSV, and SQL files \
  * administer multiple servers \
  * manage MySQL users and privileges \
  * check referential integrity in MyISAM tables \
  * using Query-by-example (QBE), create complex queries automatically \
    connecting required tables \
  * create PDF graphics of your Database layout \
  * search globally in a database or a subset of it \
  * transform stored data into any format using a set of predefined functions, \
    like displaying BLOB-data as image or download-link \
  * track changes on databases, tables and views \
  * support InnoDB tables and foreign keys (see FAQ 3.6) \
  * support mysqli, the improved MySQL extension (see FAQ 1.17) \
  * communicate in 57 different languages \
  * synchronize two databases residing on the same as well as remote servers \
    (see FAQ 9.1)"
LICENSE = "GPL-2.0-or-later"

PV = "5.2.3"

RPM_NAME = "phpMyAdmin-5.2.3-1.3.noarch.rpm"
RPM_HASH = "768726cd9c09af9fc952007867e7d6a471958db7661b2b9996285d91272364c12a6b12e3373b0ed1f9c1f31c31c08b51b66126cabb941f6b21870fe9b53546d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-phpMyAdmin \
phpMyAdmin"

RDEPENDS:${PN} += "/usr/bin/sh \
group-www \
php-bz2 \
php-ctype \
php-gd \
php-gettext \
php-iconv \
php-json \
php-mbstring \
php-mysql \
php-openssl \
php-session"

inherit rpm
