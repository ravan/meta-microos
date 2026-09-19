SUMMARY = "Documentation for PL/R - R Procedural Language for PostgreSQL"
DESCRIPTION = "PL/R is a loadable procedural language that enables you to write PostgreSQL \
functions and triggers in the R programming language. PL/R offers most (if \
not all) of the capabilities a function writer has in the R language. \
 \
This package contain the associated documentation"
LICENSE = "GPL-2.0-or-later"

PV = "8.4.8.6"

RPM_NAME = "postgresql18-plr-doc-8.4.8.6-1.3.aarch64.rpm"
RPM_HASH = "857896f544fb4fee7908a3cb7668b2640b8af2405bdb1bff6d37922b528efcafbc945b0981a8d868d47cdb8fe2cca95446c0ed5be8b2ad026b7495b99dd2774c"

RPROVIDES:${PN} += "postgresql18-plr-doc"

RDEPENDS:${PN} += ""

inherit rpm
