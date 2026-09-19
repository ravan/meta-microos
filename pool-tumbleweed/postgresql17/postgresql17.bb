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

PV = "17.11"

RPM_NAME = "postgresql17-17.11-2.2.aarch64.rpm"
RPM_HASH = "442ff90f5bfdd80718b02e19d9921a05a0a81cc18848d5739f17bb60a8ce8afee2411538cb49b9e154c35b334b5455d16c114b08d4ba3deb7b9a2de2efd55e6b"

RPROVIDES:${PN} += "postgresql \
postgresql-implementation \
postgresql17"

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
