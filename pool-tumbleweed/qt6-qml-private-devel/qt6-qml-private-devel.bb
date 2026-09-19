SUMMARY = "Non-ABI stable API for the Qt 6 Qml library"
DESCRIPTION = "This package provides private headers of libQt6Qml that do not have any \
ABI or API guarantees."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-qml-private-devel-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "94e511cc9f375aaab81935e7fa810071b6862e94f5362acd1baf731bcfc8bdd7535eaae762b16b4411ee9cf89ae9e287e17d9861854ecbffe4e4918250ac7e5d"

RPROVIDES:${PN} += "cmake-Qt6QmlPrivate \
qt6-qml-private-devel"

RDEPENDS:${PN} += "cmake-Qt6CorePrivate \
cmake-Qt6Qml"

inherit rpm
