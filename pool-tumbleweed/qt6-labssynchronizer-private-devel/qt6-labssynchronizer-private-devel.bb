SUMMARY = "Non-ABI stable API for the Qt 6 LabsSynchronizer library"
DESCRIPTION = "Development files for the Qt 6 LabsSynchronizer library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-labssynchronizer-private-devel-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "215da5c99ee328666966d869f22715346a46238932fee7e66a0feaff67adcefd4cc384d4602c64f3091a0bdd50ebc0a6ace239958aab531323160b3b0fbf5028"

RPROVIDES:${PN} += "cmake-Qt6LabsSynchronizer \
cmake-Qt6LabsSynchronizerPrivate \
pkgconfig-Qt6LabsSynchronizer \
qt6-labssynchronizer-private-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6QmlPrivate \
libQt6LabsSynchronizer6 \
pkgconfig-Qt6Core"

inherit rpm
