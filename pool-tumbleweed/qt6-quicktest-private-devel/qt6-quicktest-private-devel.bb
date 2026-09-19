SUMMARY = "Non-ABI stable API for the Qt 6 QuickTest library"
DESCRIPTION = "This package provides private headers of libQt6QuickTest that do not have any \
ABI or API guarantees."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-quicktest-private-devel-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "b7d2d3513894203b63dfb882f293991ff3aee8f669413aaef3311d1fba047b52d48427d252cb7dfc4b372dba0b04a769260fab0935686fa9b30398191a857cae"

RPROVIDES:${PN} += "cmake-Qt6QuickTestPrivate \
qt6-quicktest-private-devel"

RDEPENDS:${PN} += "cmake-Qt6QuickTest \
cmake-Qt6TestPrivate"

inherit rpm
