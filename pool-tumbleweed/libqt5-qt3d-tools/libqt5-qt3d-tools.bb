SUMMARY = "Qt5 3D tools"
DESCRIPTION = "Tools for libqt5-qt3d module."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.19+kde0"

RPM_NAME = "libqt5-qt3d-tools-5.15.19+kde0-1.2.aarch64.rpm"
RPM_HASH = "8291908a7cf3554a28e56826a24bacdf3a6839a5709e6a33ee6d857737a01740eea61f871148fe36ad6362f91f7b2f708b712ae5baa771c51f33e0aab458d9dc"

RPROVIDES:${PN} += "libqt5-qt3d-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libassimp.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
