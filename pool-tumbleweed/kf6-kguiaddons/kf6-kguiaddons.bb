SUMMARY = "Utilities for graphical user interfaces"
DESCRIPTION = "The KDE GUI addons provide utilities for graphical user interfaces in the areas \
of colors, fonts, text, images, keyboard input."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-kguiaddons-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "4a621693a49d219cfd98b73a05593785ac7064f726cbeddeac3d49fb9cd787bedf0593b5894d32cc1074b82386f36ac97495df4657589228ce9cc7119ef8dbc2"

RPROVIDES:${PN} += "kf6-kguiaddons \
kguiaddons"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6GuiAddons6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libc.so.6"

inherit rpm
