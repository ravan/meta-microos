SUMMARY = "ksvg library"
DESCRIPTION = "The ksvg library."
LICENSE = "GPL-2.0-or-later"

PV = "6.30.0"

RPM_NAME = "libKF6Svg6-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "8e8c933dfff222e492ccebf51e3a62aa1aba1ef851233145452ba25e1441b5a2cba87fc285be484fa54b63268c72785ebdb568e8b7ddaddc34d3de42e43f44a1"

RPROVIDES:${PN} += "libKF6Svg.so.6 \
libKF6Svg6"

RDEPENDS:${PN} += "/sbin/ldconfig \
kf6-ksvg \
ld-linux-aarch64.so.1 \
libKF6Archive.so.6 \
libKF6ColorScheme.so.6 \
libKF6ConfigCore.so.6 \
libKF6CoreAddons.so.6 \
libKF6GuiAddons.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Svg.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
