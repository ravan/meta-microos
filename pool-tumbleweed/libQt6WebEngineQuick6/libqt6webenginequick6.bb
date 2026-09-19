SUMMARY = "Qt6 WebEngineQuick library"
DESCRIPTION = "The Qt6 WebEngineQuick library."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "libQt6WebEngineQuick6-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "e4f2073165ce5f53239fb9f17961677d4058de51cdaf6ffdf3449f0177b3249abae7410395af1c2f24270acb7f3825dc7a829cd7acb644de459a8295ad420b28"

RPROVIDES:${PN} += "libQt6WebEngineQuick.so.6 \
libQt6WebEngineQuick6 \
libQt6WebEngineQuickDelegatesQml.so.6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6WebChannelQuick.so.6 \
libQt6WebEngineCore.so.6 \
libc.so.6 \
libstdc++.so.6 \
qt6-webengine-imports"

inherit rpm
