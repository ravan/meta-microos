SUMMARY = "PL/Tcl Procedural Language for PostgreSQL"
DESCRIPTION = "PostgreSQL is an advanced object-relational database management system \
that supports an extended subset of the SQL standard, including \
transactions, foreign keys, subqueries, triggers, and user-defined \
types and functions. \
 \
This package contains the PL/Tcl procedural language for PostgreSQL. \
With thie module one can use Tcl to write stored procedures, functions, \
and triggers."
LICENSE = "PostgreSQL"

PV = "18"

RPM_NAME = "postgresql-pltcl-18-3.4.noarch.rpm"
RPM_HASH = "f72c39db886f525c9f900c06355b4f6793cd7e1e0e38bddeb78a442b856453d31bb3a51a90b53c9aaef50cec96f051182704db596feb88ce10aae77b4fa1d827"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "postgresql-pltcl \
postgresql-pltcl-noarch"

RDEPENDS:${PN} += "postgresql \
postgresql-noarch \
postgresql-pltcl-implementation"

inherit rpm
