SUMMARY = "Non-ABI stable API for the Qt 6 SensorsQuick library"
DESCRIPTION = "This package provides private headers of libQt6SensorsQuick that do not have any \
ABI or API guarantees."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-sensorsquick-private-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "1d7a440013aa015e724cf9d8db77f21dda94ce7831a424f290813f1866f708080b28b567babd4d247f9bfc91a9ce3f502efe3240d8a4fcd3872edb0e89659e15"

RPROVIDES:${PN} += "cmake-Qt6SensorsQuickPrivate \
qt6-sensorsquick-private-devel"

RDEPENDS:${PN} += "cmake-Qt6SensorsQuick"

inherit rpm
