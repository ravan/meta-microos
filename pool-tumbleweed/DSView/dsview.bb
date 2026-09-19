SUMMARY = "GUI for DreamSourceLab USB-based instruments"
DESCRIPTION = "GUI for DreamSourceLab USB-based instruments"
LICENSE = "GPL-3.0-or-later"

PV = "1.3.2"

RPM_NAME = "DSView-1.3.2-1.9.aarch64.rpm"
RPM_HASH = "f35febfe8ff123689f9c4ab6bdc68b1832f3a84a3d7aa5bedaeb5e8d3cd48057319b283798c1349a339260a077fce4e45603ddfa5cc3e7dbd7054e0599e63e68"

RPROVIDES:${PN} += "DSView"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libfftw3.so.3 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libm.so.6 \
libpython3.13.so.1.0 \
libstdc++.so.6 \
libusb-1.0.so.0 \
libz.so.1"

inherit rpm
