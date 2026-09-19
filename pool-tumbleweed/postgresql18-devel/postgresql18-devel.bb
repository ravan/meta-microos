SUMMARY = "PostgreSQL client development header files and libraries"
DESCRIPTION = "PostgreSQL is an advanced object-relational database management system \
that supports an extended subset of the SQL standard, including \
transactions, foreign keys, subqueries, triggers, and user-defined \
types and functions. \
 \
This package contains the header files and libraries needed to compile \
C applications which will directly interact with a PostgreSQL database \
management server and the ECPG Embedded C Postgres preprocessor. You \
need to install this package if you want to develop applications in C \
which will interact with a PostgreSQL server. \
 \
For building PostgreSQL server extensions, see the \
postgresql18-server-devel package."
LICENSE = "PostgreSQL"

PV = "18.6"

RPM_NAME = "postgresql18-devel-18.6-1.2.aarch64.rpm"
RPM_HASH = "f3fb912916dffee7010cf6e3dd1cab5d893809e2ec70ad89c0309706b04d2c38b3a0c8477ff1f3ae1b1a7e240d9b4673bef845700bde6a025f8ad4c0fa6a9ba3"

RPROVIDES:${PN} += "pkgconfig-libecpg \
pkgconfig-libecpg-compat \
pkgconfig-libpgtypes \
pkgconfig-libpq \
postgresql-devel \
postgresql-devel-exclusive \
postgresql-devel-implementation \
postgresql18-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libecpg6 \
libpq5 \
pkgconfig-libcrypto \
pkgconfig-libcurl \
pkgconfig-libecpg \
pkgconfig-libpgtypes \
pkgconfig-libpq \
pkgconfig-libssl \
postgresql-devel-noarch"

inherit rpm
