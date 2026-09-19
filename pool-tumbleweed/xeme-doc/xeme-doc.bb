SUMMARY = "Documentation for xeme"
DESCRIPTION = "Library files for xeme."
LICENSE = "LGPL-2.1-or-later"

PV = "0+64"

RPM_NAME = "xeme-doc-0+64-1.5.noarch.rpm"
RPM_HASH = "7b2d2ecbbc9042baef6e12a446f6a5a07ad609adfde84f49405e44bca2330c0be3d06b36de1b861fac0bfabcd3f332d05daf330648d8477006d587115a868ff1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xeme-doc"

RDEPENDS:${PN} += ""

inherit rpm
