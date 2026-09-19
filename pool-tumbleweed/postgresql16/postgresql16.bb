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

PV = "16.15"

RPM_NAME = "postgresql16-16.15-2.2.aarch64.rpm"
RPM_HASH = "0a5bea3791e1d033a8476f918f8084d96516cef1e98c8f0eca90b09548ce676f6445424c35cf190340b3ff7af638717a7fd4654e5d027a2eee1c359df4026bb1"

RPROVIDES:${PN} += "postgresql \
postgresql-implementation \
postgresql16"

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
