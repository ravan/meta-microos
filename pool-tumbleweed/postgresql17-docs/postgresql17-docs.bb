SUMMARY = "HTML Documentation for PostgreSQL"
DESCRIPTION = "PostgreSQL is an advanced object-relational database management system \
that supports an extended subset of the SQL standard, including \
transactions, foreign keys, subqueries, triggers, and user-defined \
types and functions. \
 \
This package contains the HTML documentation for PostgreSQL. The start \
page is: file:///usr/share/doc/packages/postgresql17/html/index.html . \
Manual pages for the PostgreSQL SQL statements can be found in the \
postgresql package."
LICENSE = "PostgreSQL"

PV = "17.11"

RPM_NAME = "postgresql17-docs-17.11-2.2.noarch.rpm"
RPM_HASH = "1a99cd8bdfea7a622943f7de449185227d5cbb99f7247e3889a6f671f290d49a121444810d10802ea6d9b89c9a1caacadddab1c8f7389e5acda87d216208bdcb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "postgresql-docs-implementation \
postgresql17-docs"

RDEPENDS:${PN} += "postgresql-docs-noarch"

inherit rpm
