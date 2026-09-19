SUMMARY = "GUI Configuration app for labwc"
DESCRIPTION = "labwc-tweaks is a GUI configuration application for the labwc Wayland compositor"
LICENSE = "BSD-3-Clause & GPL-2.0-only"

PV = "0.1.0"

RPM_NAME = "labwc-tweaks-0.1.0-1.2.aarch64.rpm"
RPM_HASH = "3f66f281d20ac6fa26b14e096433bd7a68d430172d625918c830e94ef66132067ad31896d84be51d4665ab1914022fddb69a9dd35f1d03a49e77f197981e1914"

RPROVIDES:${PN} += "labwc-tweaks"

RDEPENDS:${PN} += "labwc \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libm.so.6 \
libstdc++.so.6 \
libxml2.so.16"

inherit rpm
