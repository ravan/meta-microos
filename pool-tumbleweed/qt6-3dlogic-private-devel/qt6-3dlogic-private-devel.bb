SUMMARY = "Non-ABI stable API for the Qt 6 3DLogic library"
DESCRIPTION = "This package provides private headers of libQt63DLogic that do not have any \
ABI or API guarantees."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-3dlogic-private-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "17073ca7e788fc5c06a1926c4c2923aa4bf370db7098fb8a3d75b564cc6c6287de2600d7a4d311a20c343b3b5812afc5dbcbdd6caeb175093c6f858e1949f946"

RPROVIDES:${PN} += "cmake-Qt63DLogicPrivate \
qt6-3dlogic-private-devel"

RDEPENDS:${PN} += "cmake-Qt63DCorePrivate \
cmake-Qt63DLogic \
cmake-Qt6CorePrivate \
cmake-Qt6GuiPrivate"

inherit rpm
