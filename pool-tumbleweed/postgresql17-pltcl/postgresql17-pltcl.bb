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

PV = "17.11"

RPM_NAME = "postgresql17-pltcl-17.11-2.2.aarch64.rpm"
RPM_HASH = "5ee62ef8cd579a46cdaf3f741cbe5cdd36501927d92e479917ed2b8de1d93ab2d85db1151f23f207eff4cf07fa749bd02f3d8d1f0ffd96a655767d3d046673e1"

RPROVIDES:${PN} += "postgresql-pltcl-implementation \
postgresql17-pltcl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libtcl8.6.so \
postgresql-pltcl-noarch \
postgresql17-server \
tcl"

inherit rpm
