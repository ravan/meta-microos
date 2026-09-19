SUMMARY = "PostgreSQL development header files and libraries"
DESCRIPTION = "PostgreSQL is an advanced object-relational database management system \
that supports an extended subset of the SQL standard, including \
transactions, foreign keys, subqueries, triggers, and user-defined \
types and functions. \
 \
This package contains the header files and libraries needed to compile \
C applications which will directly interact with a PostgreSQL database \
management server and the ECPG Embedded C Postgres preprocessor. You \
need to install this package if you want to develop applications in C \
which will interact with a PostgreSQL server."
LICENSE = "PostgreSQL"

PV = "18"

RPM_NAME = "postgresql-devel-18-3.4.noarch.rpm"
RPM_HASH = "a0b0065294f0dfde79d934a022070811ce8d85bfa4534c9b73fcf8fd6647ad7a9002bb98dc523ce2b24e6f7e36edfa87db15551049b4a23ffa1d1fca0b0dfc66"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pkgconfig-libecpg \
pkgconfig-libecpg-compat \
pkgconfig-libpgtypes \
pkgconfig-libpq \
postgresql-devel \
postgresql-devel-noarch"

RDEPENDS:${PN} += "postgresql \
postgresql-devel-implementation \
postgresql-noarch"

inherit rpm
