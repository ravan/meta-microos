SUMMARY = "Utilities for graphical user interfaces"
DESCRIPTION = "The KDE GUI addons provide utilities for graphical user interfaces in the areas \
of colors, fonts, text, images, keyboard input."
LICENSE = "LGPL-2.1-or-later"

PV = "5.116.0"

RPM_NAME = "kguiaddons-5.116.0-1.11.aarch64.rpm"
RPM_HASH = "0a1dcef905cb58d210c8bc709a20f038dd4979dc8fdb9ee862dc4e5ff682906f29e7f9525ae9dafd5df0446ca0ce71bced8678f836a25d70787b9fc6b09f92e9"

RPROVIDES:${PN} += "kguiaddons"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5GuiAddons5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libc.so.6"

inherit rpm
