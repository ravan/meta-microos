SUMMARY = "HTML Documentation for PostgreSQL"
DESCRIPTION = "PostgreSQL is an advanced object-relational database management system \
that supports an extended subset of the SQL standard, including \
transactions, foreign keys, subqueries, triggers, and user-defined \
types and functions. \
 \
This package contains the HTML documentation for PostgreSQL. The start \
page is: file:///usr/share/doc/packages/postgresql18/html/index.html . \
Manual pages for the PostgreSQL SQL statements can be found in the \
postgresql package."
LICENSE = "PostgreSQL"

PV = "18.6"

RPM_NAME = "postgresql18-docs-18.6-1.2.noarch.rpm"
RPM_HASH = "98777bc90a4d9f1c9c7be3377836328608229e2f3bcd7cc76edb79bb02e764f1495bd1f6343efc521f424aecc70a89ebc9c86b7a3e935ba203e14a734b66dec7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "postgresql-docs-implementation \
postgresql18-docs"

RDEPENDS:${PN} += "postgresql-docs-noarch"

inherit rpm
