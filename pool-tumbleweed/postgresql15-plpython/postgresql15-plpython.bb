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

PV = "15.19"

RPM_NAME = "postgresql15-plpython-15.19-2.2.aarch64.rpm"
RPM_HASH = "58f5f904f2ca477b9e43dd0dae1c4371a56eca024039b786f2aeaab355b743c8fbaa4f312655fa47e60b77dada22c8e9888b315ded5649ba914b4f3b9d6958ef"

RPROVIDES:${PN} += "postgresql-plpython-implementation \
postgresql15-plpython"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpython3.13.so.1.0 \
postgresql-plpython-noarch \
postgresql15-server \
python3"

inherit rpm
