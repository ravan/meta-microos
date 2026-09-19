SUMMARY = "Qt 5 3D Addon"
DESCRIPTION = "Qt is a set of libraries for developing applications. \
 \
This package provides core Qt 3D QML types."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.19+kde0"

RPM_NAME = "libQt53DQuick5-5.15.19+kde0-1.2.aarch64.rpm"
RPM_HASH = "b0bf978f897f1357ea525553e3a2f9ba7189f4c7e425556eeb64615db5f0022835fbe25e85259226a03c2ff3b2bcffafa53235f663573d35ca7767b82f2af519"

RPROVIDES:${PN} += "libQt53DQuick.so.5 \
libQt53DQuick5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt53DCore.so.5 \
libQt5Core.so.5 \
libQt5Core5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5QmlModels.so.5 \
libQt5Quick.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
