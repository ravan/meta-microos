SUMMARY = "Qt 6 3DQuick library"
DESCRIPTION = "The Qt 6 3DQuick library."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "libQt63DQuick6-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "769d3102abe40579777a0cf64666322cbc3e6bcadb2737564cb56a59a89ad84357fee3fb419b5992951d40b34170d3ba43352c83e34f6b0f0d8d56cba1a0c76b"

RPROVIDES:${PN} += "libQt63DQuick.so.6 \
libQt63DQuick6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt63DCore.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6QmlModels.so.6 \
libQt6Quick.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
