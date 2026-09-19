SUMMARY = "Documentation for the libodfgen API"
DESCRIPTION = "This package contains documentation for the libodfgen API."
LICENSE = "LGPL-2.1-or-later & MPL-2.0"

PV = "0.1.8"

RPM_NAME = "libodfgen-devel-doc-0.1.8-4.6.noarch.rpm"
RPM_HASH = "aedb457400a1846bc141940e0d47b3f022ff59b13e4ebc7af858751d388bfc8bb86f649914825aa40c9ec0bdd0f1879480234ba755dba85583bdde98cdb16080"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libodfgen-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
