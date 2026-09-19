SUMMARY = "Clipboard history applet"
DESCRIPTION = "Lightweight and cross-platform clipboard history applet."
LICENSE = "GPL-2.0-or-later"

PV = "6.0.0"

RPM_NAME = "qlipper-6.0.0-1.5.aarch64.rpm"
RPM_HASH = "c295b8d40cacca5b0ff8fb5df82031f8a7c2ab5761a64856e57fbd92d702437f07e55fe0efb69c62353ae739bf174246f3baacd70612041f4b0c232c4868b1ae"

RPROVIDES:${PN} += "config-qlipper \
qlipper"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6GuiAddons.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libX11.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
