SUMMARY = "The PL/Tcl, PL/Perl, and  PL/Python procedural languages for PostgreSQL"
DESCRIPTION = "PostgreSQL is an advanced object-relational database management system \
that supports an extended subset of the SQL standard, including \
transactions, foreign keys, subqueries, triggers, and user-defined \
types and functions. \
 \
This package contains the PL/Perl procedural language for PostgreSQL. \
With this module one can use Perl to write stored procedures, \
functions, and triggers."
LICENSE = "PostgreSQL"

PV = "18"

RPM_NAME = "postgresql-plperl-18-3.4.noarch.rpm"
RPM_HASH = "e6dae7aa895a740019a96294060a066e5945c4fb75186420976b4ddb8ab7b6e60a994170b0e19f49c0d0108b52ac0cab39d82ab0259c4f8abaf3a43b4bc204d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "postgresql-plperl \
postgresql-plperl-noarch"

RDEPENDS:${PN} += "postgresql \
postgresql-noarch \
postgresql-plperl-implementation"

inherit rpm
