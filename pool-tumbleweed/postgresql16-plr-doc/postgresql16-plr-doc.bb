SUMMARY = "Documentation for PL/R - R Procedural Language for PostgreSQL"
DESCRIPTION = "PL/R is a loadable procedural language that enables you to write PostgreSQL \
functions and triggers in the R programming language. PL/R offers most (if \
not all) of the capabilities a function writer has in the R language. \
 \
This package contain the associated documentation"
LICENSE = "GPL-2.0-or-later"

PV = "8.4.8.6"

RPM_NAME = "postgresql16-plr-doc-8.4.8.6-1.3.aarch64.rpm"
RPM_HASH = "13d2b805883a728ed27be8ad3fd2a9d5d23500e757c5a75be927347c85b30292b72967e2a89785166c1a5993c1809166937a552f55bb39ea450b2f18ed30f6ab"

RPROVIDES:${PN} += "postgresql16-plr-doc"

RDEPENDS:${PN} += ""

inherit rpm
