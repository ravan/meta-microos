SUMMARY = "Non-ABI stable API for the Qt 6 3DExtras library"
DESCRIPTION = "This package provides private headers of libQt63DExtras that do not have any \
ABI or API guarantees."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-3dextras-private-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "aad58f3c44a591f2f4ee140703d9ccf2d2749083318fdf2b09b949c87c2937009d3b7d3f435df44d218cdc11c9274970c574c94b458828ff2637b63cd352c6ae"

RPROVIDES:${PN} += "cmake-Qt63DExtrasPrivate \
qt6-3dextras-private-devel"

RDEPENDS:${PN} += "cmake-Qt63DCorePrivate \
cmake-Qt63DExtras \
cmake-Qt63DRenderPrivate \
cmake-Qt6CorePrivate"

inherit rpm
