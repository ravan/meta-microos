SUMMARY = "Indonesian documentation and tutorials for KiCad"
DESCRIPTION = "This package contains Indonesian documentation and tutorials for KiCad"
LICENSE = "CC-BY-SA-3.0 & GPL-3.0-or-later"

PV = "10.0.6"

RPM_NAME = "kicad-doc-id-10.0.6-1.1.noarch.rpm"
RPM_HASH = "414c9215ba987a122a38bd70b355d5d4faf057b7079b7e276a2dbb5591e732165dc0669f1e4ed51746db6cab42bf41901815f3d7a5f3530f7791b8291c280864"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kicad-doc-id \
locale-kicad-doc-id"

RDEPENDS:${PN} += "kicad-doc-en"

inherit rpm
