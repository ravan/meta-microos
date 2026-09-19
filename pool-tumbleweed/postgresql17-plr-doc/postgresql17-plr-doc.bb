SUMMARY = "Documentation for PL/R - R Procedural Language for PostgreSQL"
DESCRIPTION = "PL/R is a loadable procedural language that enables you to write PostgreSQL \
functions and triggers in the R programming language. PL/R offers most (if \
not all) of the capabilities a function writer has in the R language. \
 \
This package contain the associated documentation"
LICENSE = "GPL-2.0-or-later"

PV = "8.4.8.6"

RPM_NAME = "postgresql17-plr-doc-8.4.8.6-1.3.aarch64.rpm"
RPM_HASH = "7e0fd4f2730cd75bee15b0c6d47dd31f6e54acdb4483e57e023f8769ff87bc731d402b9c442c1a8de2e420ec357acc02e955ee9e628bda8a32a9256555df5515"

RPROVIDES:${PN} += "postgresql17-plr-doc"

RDEPENDS:${PN} += ""

inherit rpm
