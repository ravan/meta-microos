SUMMARY = "Documentation for qt6-virtualkeyboard in QCH format"
DESCRIPTION = "This package contains documentation for qt6-virtualkeyboard in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-virtualkeyboard-docs-qch-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "35fb3617b4c65c28ee91d8b1afab2411c1f27d17fcb013d24f28ff4bed8d941cb0fe497bc8faada447f5573b347285c4a362b2f261e227d8ee70036934353f37"

RPROVIDES:${PN} += "qt6-virtualkeyboard-docs-qch"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
