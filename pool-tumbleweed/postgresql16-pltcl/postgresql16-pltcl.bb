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

PV = "16.15"

RPM_NAME = "postgresql16-pltcl-16.15-2.2.aarch64.rpm"
RPM_HASH = "581da52b74cc5e9fa8d9d5388c4906ced2731715dd683ac9fb0f167968599ee0542fc400134b5277ac36dc2c88090be5b765262d7a3631d41896f3e6373cb78e"

RPROVIDES:${PN} += "postgresql-pltcl-implementation \
postgresql16-pltcl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libtcl8.6.so \
postgresql-pltcl-noarch \
postgresql16-server \
tcl"

inherit rpm
