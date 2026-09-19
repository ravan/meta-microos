SUMMARY = "MySQL driver for the Perl5 Database Interface (DBI)"
DESCRIPTION = "*DBD::mysql* is the Perl5 Database Interface driver for the MySQL database. \
In other words: DBD::mysql is an interface between the Perl programming \
language and the MySQL programming API that comes with the MySQL relational \
database management system. Most functions provided by this programming API \
are supported. Some rarely used functions are missing, mainly because \
no-one ever requested them. :-)"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "4.050"

RPM_NAME = "perl-DBD-mysql-4.050-3.14.aarch64.rpm"
RPM_HASH = "1329dc386c822b31ab5b2a06a0caed4e2adb273efd802980ad14be02b1329507cb5ae51e73363e9a7e6b95225745bb39d5084b44c9d2ed7764c085b3cc03d4d3"

RPROVIDES:${PN} += "perl-Bundle--DBD--mysql \
perl-DBD--mysql \
perl-DBD--mysql--GetInfo \
perl-DBD--mysql--db \
perl-DBD--mysql--dr \
perl-DBD--mysql--st \
perl-DBD-mysql"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmariadb.so.3 \
perl--MODULE-COMPAT-5.44.0 \
perl-DBI"

inherit rpm
