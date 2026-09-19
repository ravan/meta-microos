SUMMARY = "HTML Documentation for PostgreSQL"
DESCRIPTION = "PostgreSQL is an advanced object-relational database management system \
that supports an extended subset of the SQL standard, including \
transactions, foreign keys, subqueries, triggers, and user-defined \
types and functions. \
 \
This package contains the HTML documentation for PostgreSQL. The start \
page is: file:///usr/share/doc/packages/postgresql14/html/index.html . \
Manual pages for the PostgreSQL SQL statements can be found in the \
postgresql package."
LICENSE = "PostgreSQL"

PV = "14.24"

RPM_NAME = "postgresql14-docs-14.24-2.2.noarch.rpm"
RPM_HASH = "dfb07e40320e848305e62d02bbe8a884e9d73f6220f3d0aed4103efd2d18b0aad216e705a1329ee37d5364bc35f0807f7e438c2da30a76c7005bbf4dc50ac9ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "postgresql-docs-implementation \
postgresql14-docs"

RDEPENDS:${PN} += "postgresql-docs-noarch"

inherit rpm
