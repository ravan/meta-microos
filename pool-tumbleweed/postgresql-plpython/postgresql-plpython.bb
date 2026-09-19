SUMMARY = "The PL/Python Procedural Languages for PostgreSQL"
DESCRIPTION = "PostgreSQL is an advanced object-relational database management system \
that supports an extended subset of the SQL standard, including \
transactions, foreign keys, subqueries, triggers, and user-defined \
types and functions. \
 \
This package contains the PL/Python procedural language for PostgreSQL. \
With this module one can use Python to write stored procedures, \
functions, and triggers."
LICENSE = "PostgreSQL"

PV = "18"

RPM_NAME = "postgresql-plpython-18-3.4.noarch.rpm"
RPM_HASH = "10cd5ba964ba48a3c56036237e3ed321bb0be074a0e765e064e5db3bb469b5e25f3bd83963dfe2eac5f79c2b5f7761a86eade99e39bfa31997d90ea03af28028"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "postgresql-plpython \
postgresql-plpython-noarch"

RDEPENDS:${PN} += "postgresql \
postgresql-noarch \
postgresql-plpython-implementation"

inherit rpm
