SUMMARY = "Documentation for PL/R - R Procedural Language for PostgreSQL"
DESCRIPTION = "PL/R is a loadable procedural language that enables you to write PostgreSQL \
functions and triggers in the R programming language. PL/R offers most (if \
not all) of the capabilities a function writer has in the R language. \
 \
This package contain the associated documentation"
LICENSE = "GPL-2.0-or-later"

PV = "8.4.8.6"

RPM_NAME = "postgresql15-plr-doc-8.4.8.6-1.3.aarch64.rpm"
RPM_HASH = "c9702486c6b54be0199b5b16c0328adffb2cead29480550a52ad43cc7d0a98c3e28880de4955950245bb1d2dc04c1e3728d66c8cd05be4044f2f7bd8088cc5b0"

RPROVIDES:${PN} += "postgresql15-plr-doc"

RDEPENDS:${PN} += ""

inherit rpm
