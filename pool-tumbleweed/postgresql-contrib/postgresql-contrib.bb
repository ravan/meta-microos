SUMMARY = "Contributed Extensions and Additions to PostgreSQL"
DESCRIPTION = "PostgreSQL is an advanced object-relational database management system \
that supports an extended subset of the SQL standard, including \
transactions, foreign keys, subqueries, triggers, and user-defined \
types and functions. \
 \
The postgresql-contrib package includes extensions and additions that \
are distributed along with the PostgreSQL sources, but are not (yet) \
officially part of the PostgreSQL core. \
 \
Documentation for the modules contained in this package can be found in \
/usr/share/doc/packages/postgresql/contrib."
LICENSE = "PostgreSQL"

PV = "18"

RPM_NAME = "postgresql-contrib-18-3.4.noarch.rpm"
RPM_HASH = "53e7136ca1bee5e78260fbf26589f10552fe01f1b4fa1cf694f68672b02e0d0e6f61c4ea0b9e0ad6d6f83b15670d49b20a426cd08f8a998d9305d4c72663fda4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "postgresql-contrib \
postgresql-contrib-noarch"

RDEPENDS:${PN} += "postgresql \
postgresql-contrib-implementation \
postgresql-noarch"

inherit rpm
