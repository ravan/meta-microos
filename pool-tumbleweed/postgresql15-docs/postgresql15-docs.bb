SUMMARY = "HTML Documentation for PostgreSQL"
DESCRIPTION = "PostgreSQL is an advanced object-relational database management system \
that supports an extended subset of the SQL standard, including \
transactions, foreign keys, subqueries, triggers, and user-defined \
types and functions. \
 \
This package contains the HTML documentation for PostgreSQL. The start \
page is: file:///usr/share/doc/packages/postgresql15/html/index.html . \
Manual pages for the PostgreSQL SQL statements can be found in the \
postgresql package."
LICENSE = "PostgreSQL"

PV = "15.19"

RPM_NAME = "postgresql15-docs-15.19-2.2.noarch.rpm"
RPM_HASH = "820b7b98c995f13c9394c06591800ed7dc7d9eb5d9ab5dac7075801e096029304386c591953a515cdcedc4912a67df735ad9c006b3845dc0950d5b911e288e78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "postgresql-docs-implementation \
postgresql15-docs"

RDEPENDS:${PN} += "postgresql-docs-noarch"

inherit rpm
