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

PV = "14.24"

RPM_NAME = "postgresql14-pltcl-14.24-2.2.aarch64.rpm"
RPM_HASH = "e40f61b78f767f842b85aaed0c1984c795ef72ca81d854793776e973e0852838b55616cc83fea9339cc46bcfb22f7e863fe651b2744a791cdb278f184ccdc71a"

RPROVIDES:${PN} += "postgresql-pltcl-implementation \
postgresql14-pltcl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libtcl8.6.so \
postgresql-pltcl-noarch \
postgresql14-server \
tcl"

inherit rpm
