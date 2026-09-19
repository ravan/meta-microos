SUMMARY = "Documentation for qt6-multimedia in QCH format"
DESCRIPTION = "This package contains documentation for qt6-multimedia in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-multimedia-docs-qch-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "d3221e2619724588223edaf910f8e215fa93afd8e6cf612050415d244f677aef680993c81d2b752887e5610eb62b5c225e7e188647a2ab6d02b2b8a6de86834e"

RPROVIDES:${PN} += "qt6-multimedia-docs-qch"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
