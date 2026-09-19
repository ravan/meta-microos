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

PV = "14.24"

RPM_NAME = "postgresql14-14.24-2.2.aarch64.rpm"
RPM_HASH = "8d564e5fb1a1c646bb87a4399011fed19ef720e448ee97fb117c2c80c9dae646ed08a6d6d62df0193aaa95f604c6e59ee0b0d5ae61bda16f9c93d45b0a962db8"

RPROVIDES:${PN} += "postgresql \
postgresql-implementation \
postgresql14"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libm.so.6 \
libpq.so.5 \
libpq5 \
libreadline.so.8 \
libz.so.1 \
pg-alts \
postgresql-noarch"

inherit rpm
