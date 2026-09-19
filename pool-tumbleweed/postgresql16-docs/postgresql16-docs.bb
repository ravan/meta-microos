SUMMARY = "HTML Documentation for PostgreSQL"
DESCRIPTION = "PostgreSQL is an advanced object-relational database management system \
that supports an extended subset of the SQL standard, including \
transactions, foreign keys, subqueries, triggers, and user-defined \
types and functions. \
 \
This package contains the HTML documentation for PostgreSQL. The start \
page is: file:///usr/share/doc/packages/postgresql16/html/index.html . \
Manual pages for the PostgreSQL SQL statements can be found in the \
postgresql package."
LICENSE = "PostgreSQL"

PV = "16.15"

RPM_NAME = "postgresql16-docs-16.15-2.2.noarch.rpm"
RPM_HASH = "fa2cb21439f3b047ab0e477146407fd011511b6026b9dc8016fd302dae8b4712fdcbd132764008a134e01d52d455cc6f661a56e21887def3977b846a48ad9752"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "postgresql-docs-implementation \
postgresql16-docs"

RDEPENDS:${PN} += "postgresql-docs-noarch"

inherit rpm
