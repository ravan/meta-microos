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

PV = "17.11"

RPM_NAME = "postgresql17-plpython-17.11-2.2.aarch64.rpm"
RPM_HASH = "7a4805d7672886eefe31b9bcafc2a3394ef49bbfb1efe612af40ee8e2a43b80e01084a2b37218159a0be5662fe2e44af8f739cae558ec7d73ffedaa3d9a2d16e"

RPROVIDES:${PN} += "postgresql-plpython-implementation \
postgresql17-plpython"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpython3.13.so.1.0 \
postgresql-plpython-noarch \
postgresql17-server \
python3"

inherit rpm
