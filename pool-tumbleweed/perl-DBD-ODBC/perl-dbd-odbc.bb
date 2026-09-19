SUMMARY = "ODBC Driver for DBI"
DESCRIPTION = "ODBC Driver for DBI"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.61"

RPM_NAME = "perl-DBD-ODBC-1.61-2.14.aarch64.rpm"
RPM_HASH = "c377d781a51730965a8085eb69c15dadc9916ce837857385a7b438d3208b6c841e2c12b1b83d1e272f81736b6a5101f35771c9fd1121e3df85956abba3287e52"

RPROVIDES:${PN} += "perl-DBD--ODBC \
perl-DBD-ODBC"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libodbc.so.2 \
perl--MODULE-COMPAT-5.44.0 \
perl-DBI \
perl-Test--Simple"

inherit rpm
