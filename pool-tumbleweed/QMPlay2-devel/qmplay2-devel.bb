SUMMARY = "QMPlay2 development files"
DESCRIPTION = "It's a development package for QMPlay2."
LICENSE = "LGPL-3.0-or-later"

PV = "26.08.02"

RPM_NAME = "QMPlay2-devel-26.08.02-1.2.noarch.rpm"
RPM_HASH = "ab454ae7cb93fe4b3cd24f412f7372c01a4c88ebd47a46de9c5f67c6be969e861dd2e820cfc3fb5de42924d40e41871960b2ee1976e52762aa2551cac9ee7d19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "QMPlay2-devel"

RDEPENDS:${PN} += "QMPlay2"

inherit rpm
