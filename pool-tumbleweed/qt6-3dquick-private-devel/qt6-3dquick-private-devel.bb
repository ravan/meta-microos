SUMMARY = "Non-ABI stable API for the Qt 6 3DQuick library"
DESCRIPTION = "This package provides private headers of libQt63DQuick that do not have any \
ABI or API guarantees."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-3dquick-private-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "753327f38eeb619e8ce7ceeac2e01d810b44df1402757d241c3f529dc5baa539697c4528af481ea0d964e02ae9965e4f79985c0d9d3f35c260447af193d6de9f"

RPROVIDES:${PN} += "cmake-Qt63DQuickPrivate \
qt6-3dquick-private-devel"

RDEPENDS:${PN} += "cmake-Qt63DQuick \
cmake-Qt6CorePrivate \
cmake-Qt6GuiPrivate \
cmake-Qt6QmlPrivate \
cmake-Qt6QuickPrivate"

inherit rpm
