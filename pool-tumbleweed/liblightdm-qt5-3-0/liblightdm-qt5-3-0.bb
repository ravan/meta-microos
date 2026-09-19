SUMMARY = "LightDM Qt5-based Client Library"
DESCRIPTION = "A Qt5-based library for LightDM clients to use to interface with \
LightDM."
LICENSE = "LGPL-2.0-only | LGPL-3.0-only"

PV = "1.32.0"

RPM_NAME = "liblightdm-qt5-3-0-1.32.0-9.4.aarch64.rpm"
RPM_HASH = "0fc620bf30f406219955e80da432df32b7d379b53fbd7d3738770cf0adf99ab839222bb5f92d434fece00cf179d584bf65898f08e429ac4b443f9d78380d6cba"

RPROVIDES:${PN} += "liblightdm-qt-3-0 \
liblightdm-qt5-3-0 \
liblightdm-qt5-3.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libgcc-s.so.1 \
liblightdm-gobject-1.so.0 \
libstdc++.so.6"

inherit rpm
