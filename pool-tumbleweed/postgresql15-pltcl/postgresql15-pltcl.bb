SUMMARY = "PL/Tcl Procedural Language for PostgreSQL"
DESCRIPTION = "PostgreSQL is an advanced object-relational database management system \
that supports an extended subset of the SQL standard, including \
transactions, foreign keys, subqueries, triggers, and user-defined \
types and functions. \
 \
This package contains the PL/Tcl procedural language for PostgreSQL. \
With thie module one can use Tcl to write stored procedures, functions, \
and triggers. \
 \
PostgreSQL also offers the built-in procedural language PL/SQL which is \
included in the postgresql-server package."
LICENSE = "PostgreSQL"

PV = "15.19"

RPM_NAME = "postgresql15-pltcl-15.19-2.2.aarch64.rpm"
RPM_HASH = "5a782efeb08c350a9458aa971867e7b2a54e9ef68035c2315d897bfbda104c5153ddaf99fec8f717aec5cf1b0fbbe8c9291ed4e733e2c6ba3456e42ffcde0499"

RPROVIDES:${PN} += "postgresql-pltcl-implementation \
postgresql15-pltcl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libtcl8.6.so \
postgresql-pltcl-noarch \
postgresql15-server \
tcl"

inherit rpm
