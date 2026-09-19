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

PV = "14.24"

RPM_NAME = "postgresql14-plpython-14.24-2.2.aarch64.rpm"
RPM_HASH = "650b3046a3c406a2d4094cf2a757ac67a5315fa4547d3ae5cd799a90b01557cef75447620a79e0962cc5a2f2c583ad4586fb84a9ed144e72c606a39a62e59fac"

RPROVIDES:${PN} += "postgresql-plpython-implementation \
postgresql14-plpython"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpython3.13.so.1.0 \
postgresql-plpython-noarch \
postgresql14-server \
python3"

inherit rpm
