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

PV = "18.6"

RPM_NAME = "postgresql18-pltcl-18.6-1.2.aarch64.rpm"
RPM_HASH = "bb03611a2c16061844f6f8d2d0d9570373f05a494cae0ca611e69a24ee7851ea876de40c0ff929f37711d0460d6d5f9ff8cc185b69f7cc54796e4d228b4c0d1a"

RPROVIDES:${PN} += "postgresql-pltcl-implementation \
postgresql18-pltcl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libtcl8.6.so \
postgresql-pltcl-noarch \
postgresql18-server \
tcl"

inherit rpm
