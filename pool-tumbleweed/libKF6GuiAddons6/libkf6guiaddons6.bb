SUMMARY = "Utilities for graphical user interfaces"
DESCRIPTION = "The KDE GUI addons provide utilities for graphical user interfaces in the areas \
of colors, fonts, text, images, keyboard input."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "libKF6GuiAddons6-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "8f7e1704d604e2ca62aeb0e44e287503687f13433d3869d97aceb2079555bf07164920d036d225c6409ec0db3aa6119baa833d7eaa27bab00cb3e0fbb065ee2e"

RPROVIDES:${PN} += "libKF6GuiAddons.so.6 \
libKF6GuiAddons6"

RDEPENDS:${PN} += "/sbin/ldconfig \
kf6-kguiaddons \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6WaylandClient.so.6 \
libX11.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6 \
libwayland-client.so.0"

inherit rpm
