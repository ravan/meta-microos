SUMMARY = "The PL/Python Procedural Languages for PostgreSQL"
DESCRIPTION = "PostgreSQL is an advanced object-relational database management system \
that supports an extended subset of the SQL standard, including \
transactions, foreign keys, subqueries, triggers, and user-defined \
types and functions. \
 \
This package contains the PL/Python procedural language for PostgreSQL. \
With this module one can use Python to write stored procedures, \
functions, and triggers. \
 \
PostgreSQL also offers the built-in procedural language PL/SQL which is \
included in the postgresql-server package."
LICENSE = "PostgreSQL"

PV = "16.15"

RPM_NAME = "postgresql16-plpython-16.15-2.2.aarch64.rpm"
RPM_HASH = "73c9ff32d7239a08d1361d7dbf50cb5fa1f0469555f9c1406a18015c23168bc68c0e885700ee085b8bd0758b4827a4cd2e7c3ad14e735d0c5a3ca6371898d2e5"

RPROVIDES:${PN} += "postgresql-plpython-implementation \
postgresql16-plpython"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpython3.13.so.1.0 \
postgresql-plpython-noarch \
postgresql16-server \
python3"

inherit rpm
