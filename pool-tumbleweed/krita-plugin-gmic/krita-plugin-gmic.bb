SUMMARY = "GMIC plugin for krita"
DESCRIPTION = "This is a plugin for krita to provide gmic features."
LICENSE = "GPL-3.0-or-later"

PV = "4.0.3"

RPM_NAME = "krita-plugin-gmic-4.0.3-1.2.aarch64.rpm"
RPM_HASH = "29cdb63c0e5d8b4c66dcc8be589228767597a02195527707bf22955f68e33f12d69d10c2cb0b87171b786a3ead8fe50f93a03d98b8c045371130c498449f3f20"

RPROVIDES:${PN} += "krita-plugin-gmic"

RDEPENDS:${PN} += "gmic-data \
krita \
ld-linux-aarch64.so.1 \
libKF5CoreAddons.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libX11.so.6 \
libc.so.6 \
libfftw3-threads.so.3 \
libgcc-s.so.1 \
libgmic.so.4 \
libgomp.so.1 \
libkritaqmicinterface.so.20 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
