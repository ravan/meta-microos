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

PV = "18.6"

RPM_NAME = "postgresql18-plpython-18.6-1.2.aarch64.rpm"
RPM_HASH = "f166e2394577e8b6cf9ae2f27f6d16c09d8036796b8ed1f35787d18444dde18cf36d9f13d03d6a4a8457ceebac7d7f696e5dea3f6e88665ba01e22d648092433"

RPROVIDES:${PN} += "postgresql-plpython-implementation \
postgresql18-plpython"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpython3.13.so.1.0 \
postgresql-plpython-noarch \
postgresql18-server \
python3"

inherit rpm
