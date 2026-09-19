SUMMARY = "Reserved SQL words by ANSI/ISO"
DESCRIPTION = "Determine if words are reserved by ANSI/ISO SQL standard."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.800.0"

RPM_NAME = "perl-SQL-ReservedWords-0.800.0-1.9.noarch.rpm"
RPM_HASH = "8bdd7aa8ace2feceba4aa63d15cd49759f3f847ccd1065180f863d01cdf4085431b0b42e90d6dc9902e96f50d304edcce9eb1e78efb2669aa45dc64902ee025c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-SQL--ReservedWords \
perl-SQL--ReservedWords--DB2 \
perl-SQL--ReservedWords--MySQL \
perl-SQL--ReservedWords--ODBC \
perl-SQL--ReservedWords--Oracle \
perl-SQL--ReservedWords--PostgreSQL \
perl-SQL--ReservedWords--SQLServer \
perl-SQL--ReservedWords--SQLite \
perl-SQL--ReservedWords--Sybase \
perl-SQL-ReservedWords"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.44.0 \
perl-Sub--Exporter"

inherit rpm
