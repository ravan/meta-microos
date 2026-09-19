SUMMARY = "Non-ABI stable API for the Qt 6 Sensors library"
DESCRIPTION = "This package provides private headers of libQt6Sensors that do not have any \
ABI or API guarantees."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-sensors-private-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "2d7898e329c2f9d530ec975c4b05d7a12986cf20b4a73366a77efa6ed3b7c22ea473c90b6581d0a29938c809e8812e3b884d4e2b2ae31cc842394e67ffe216fa"

RPROVIDES:${PN} += "cmake-Qt6SensorsPrivate \
qt6-sensors-private-devel"

RDEPENDS:${PN} += "cmake-Qt6CorePrivate \
cmake-Qt6Sensors"

inherit rpm
