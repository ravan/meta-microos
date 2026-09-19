SUMMARY = "MariaDB and MySQL driver for the Perl5 Database Interface (DBI)"
DESCRIPTION = "*DBD::MariaDB* is the Perl5 Database Interface driver for MariaDB and MySQL \
databases. In other words: DBD::MariaDB is an interface between the Perl \
programming language and the MariaDB/MySQL programming API that comes with \
the MariaDB/MySQL relational database management system. Most functions \
provided by this programming API are supported. Some rarely used functions \
are missing, mainly because no-one ever requested them."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.240.0"

RPM_NAME = "perl-DBD-MariaDB-1.240.0-1.5.aarch64.rpm"
RPM_HASH = "1619bd898d5ae7192c21071eef2b5c02c5f78b4b54866caa25832b60f3ff20499c5685f97542b8765e413b2bd38598f73a4b9a58855682ca5c839df209a280b8"

RPROVIDES:${PN} += "perl-DBD--MariaDB \
perl-DBD-MariaDB"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmariadb.so.3 \
perl--MODULE-COMPAT-5.42.1 \
perl-DBI \
perl-DynaLoader \
perl-strict \
perl-warnings"

inherit rpm
