SUMMARY = "Documentation for qt6-positioning in QCH format"
DESCRIPTION = "This package contains documentation for qt6-positioning in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-positioning-docs-qch-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "bec7520796bf30884ad2153c4ed92b9c3eff685bdde19cb78dcce8e46df7b631bc6f85f408157409998640d0ac8463617bc77898a3f0b13bd3a010ded89f0810"

RPROVIDES:${PN} += "qt6-location-docs-qch \
qt6-positioning-docs-qch"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
