SUMMARY = "Utilities for graphical user interfaces"
DESCRIPTION = "The KDE GUI addons provide utilities for graphical user interfaces in the areas \
of colors, fonts, text, images, keyboard input."
LICENSE = "LGPL-2.1-or-later"

PV = "5.116.0"

RPM_NAME = "libKF5GuiAddons5-5.116.0-1.11.aarch64.rpm"
RPM_HASH = "4ce1de7bf909e52f183ff0294d29b784749158fec87c089cd1bdc13ef4358e58618aaea74dfe7141741e6854b5d79cd3f0b6ad027faaa5a0cb823cf2ca944181"

RPROVIDES:${PN} += "libKF5GuiAddons.so.5 \
libKF5GuiAddons5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Gui5 \
libQt5WaylandClient.so.5 \
libQt5X11Extras.so.5 \
libX11.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6 \
libwayland-client.so.0"

inherit rpm
