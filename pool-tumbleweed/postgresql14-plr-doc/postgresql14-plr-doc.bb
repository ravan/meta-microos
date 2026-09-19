SUMMARY = "Documentation for PL/R - R Procedural Language for PostgreSQL"
DESCRIPTION = "PL/R is a loadable procedural language that enables you to write PostgreSQL \
functions and triggers in the R programming language. PL/R offers most (if \
not all) of the capabilities a function writer has in the R language. \
 \
This package contain the associated documentation"
LICENSE = "GPL-2.0-or-later"

PV = "8.4.8.6"

RPM_NAME = "postgresql14-plr-doc-8.4.8.6-1.3.aarch64.rpm"
RPM_HASH = "06e56d0bb31ac7588f9644f5922e0e10ff4d551920337b6e4c17a65c1f1d35f892ad3bc0a753a869452601759d56cc412f87a5317696ef4e5d8394ecc6572eee"

RPROVIDES:${PN} += "postgresql14-plr-doc"

RDEPENDS:${PN} += ""

inherit rpm
