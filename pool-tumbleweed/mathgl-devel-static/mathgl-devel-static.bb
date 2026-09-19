SUMMARY = "Static libraries for MathGL"
DESCRIPTION = "MathGL is a library for making scientific graphics. It provides data \
plotting and handling of large data arrays, as well as window and \
console modes and for embedding into other programs. \
 \
This package contains static libraries for developing applications \
that use MathGL."
LICENSE = "GPL-3.0-only"

PV = "8.0.3"

RPM_NAME = "mathgl-devel-static-8.0.3-2.6.aarch64.rpm"
RPM_HASH = "2cc0c5a7901c637861164a25c766b9368ebd68816208302b456f23d90a2f461df55e382ae21e6c323cb880a6c6fef5d7099939104a2dae89823dcf8c5be43393"

RPROVIDES:${PN} += "mathgl-devel-static"

RDEPENDS:${PN} += "mathgl-devel"

inherit rpm
