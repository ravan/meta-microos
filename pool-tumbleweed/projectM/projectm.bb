SUMMARY = "A Music Visualizer"
DESCRIPTION = "projectM is a music visualizer."
LICENSE = "LGPL-2.1-or-later"

PV = "3.1.12"

RPM_NAME = "projectM-3.1.12-4.7.aarch64.rpm"
RPM_HASH = "fae829d2df8aefc3c9d49c15f022cdd5f2f4a6de0576f43e2242e73d26d118208fc3ea1724a9d5160988d5bb6375537c5de6ca1d991c3f93eba1974d201389ba"

RPROVIDES:${PN} += "projectM \
projectM-qt5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGL.so.1 \
libGLESv2.so.2 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5OpenGL.so.5 \
libQt5Widgets.so.5 \
libSDL2-2.0.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libprojectM.so.3 \
libpulse.so.0 \
libstdc++.so.6"

inherit rpm
