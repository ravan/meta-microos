SUMMARY = "Documentation for the libwpg API"
DESCRIPTION = "This package contains documentation for the libwpg API."
LICENSE = "LGPL-2.1-or-later & MPL-2.0"

PV = "0.3.4"

RPM_NAME = "libwpg-devel-doc-0.3.4-2.12.noarch.rpm"
RPM_HASH = "81abbcea31a5f144cd56434a2873d84111e5a45bff0e0e40232355bb477166ed18dcbf030819fb54b1653d4428b544a7a4540bb4edc325e6f1da50595ef5640d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libwpg-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
