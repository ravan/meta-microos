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

PV = "15.19"

RPM_NAME = "postgresql15-15.19-2.2.aarch64.rpm"
RPM_HASH = "acc9fccc3ae6c208bcc85bbb7e7f61234bd095bb9f82c84906ad5d43cc3206a51f1bda39721f5a8eb5832c7cb2a891f63bdd500c3c8b1014d6c479d1ed33a250"

RPROVIDES:${PN} += "postgresql \
postgresql-implementation \
postgresql15"

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
