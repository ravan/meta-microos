SUMMARY = "Basic Clients and Utilities for PostgreSQL"
DESCRIPTION = "PostgreSQL is an advanced object-relational database management system \
that supports an extended subset of the SQL standard, including \
transactions, foreign keys, subqueries, triggers, and user-defined \
types and functions. \
 \
This package contains the basic utility and client programs necessary \
to maintain and work with local or remote PostgreSQL databases as well \
as manual pages for the SQL commands that PostgreSQL supports. Full \
HTML documentation for PostgreSQL can be found in the postgresql-docs \
package."
LICENSE = "PostgreSQL"

PV = "18.6"

RPM_NAME = "postgresql18-18.6-1.2.aarch64.rpm"
RPM_HASH = "8cfec772162346e12a581b74c184ccd2844ac381dbe1c57912d5d38014b93d9e63ccf0899efd3fa276975c70bebd9cd82ac01a6ebdc99baf2bbea56cc4b44ef7"

RPROVIDES:${PN} += "postgresql \
postgresql-implementation \
postgresql18"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
liblz4.so.1 \
libm.so.6 \
libpq.so.5 \
libpq5 \
libreadline.so.8 \
libz.so.1 \
libzstd.so.1 \
pg-alts \
postgresql-noarch"

inherit rpm
