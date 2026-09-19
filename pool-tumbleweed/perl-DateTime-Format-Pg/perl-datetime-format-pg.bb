SUMMARY = "Parse and format PostgreSQL dates and times"
DESCRIPTION = "This module understands the formats used by PostgreSQL for its DATE, TIME, \
TIMESTAMP, and INTERVAL data types. It can be used to parse these formats \
in order to create 'DateTime' or 'DateTime::Duration' objects, and it can \
take a 'DateTime' or 'DateTime::Duration' object and produce a string \
representing it in a format accepted by PostgreSQL."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.16014"

RPM_NAME = "perl-DateTime-Format-Pg-0.16014-1.26.noarch.rpm"
RPM_HASH = "3ba06710a4888c585dbfc001f09385b2fce854d3e3b0dc8c025dd4af5d7680258242cd76464340aed7db4a03fc293ecef96ce0e91271c892cc592cd734959da0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-DateTime--Format--Pg \
perl-DateTime-Format-Pg"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-DateTime \
perl-DateTime--Format--Builder \
perl-DateTime--TimeZone"

inherit rpm
