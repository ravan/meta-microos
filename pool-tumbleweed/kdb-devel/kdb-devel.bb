SUMMARY = "Development package for kdb"
DESCRIPTION = "The development package for the database connectivity and creation framework"
LICENSE = "LGPL-2.0-only"

PV = "3.2.0"

RPM_NAME = "kdb-devel-3.2.0-10.7.aarch64.rpm"
RPM_HASH = "dcaa0453202b09dcc0b189f5cac020657221f58a8b51a2c3121f90415e1a55f35c5dba0fcb3271c46592bc215d6960971fb0fcab6038fff93081fd5e85583bba"

RPROVIDES:${PN} += "cmake-KDb \
kdb-devel"

RDEPENDS:${PN} += "libKDb3-4"

inherit rpm
