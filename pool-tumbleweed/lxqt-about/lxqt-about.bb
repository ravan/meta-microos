SUMMARY = "LXQt About Dialog"
DESCRIPTION = "About dialog for LXQt"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.4.0"

RPM_NAME = "lxqt-about-2.4.0-1.2.aarch64.rpm"
RPM_HASH = "eaa4f46cfd6026b3fcb8863a254d161acb13795b858ad46acb5aa9fa981d0e6ac8be8ca236de0a673d4664600a3805bd12934f7782ebd2d375d0cf03bb38a4e0"

RPROVIDES:${PN} += "lxqt-about"

RDEPENDS:${PN} += "desktop-file-utils \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libQt6Xdg.so.4 \
libc.so.6 \
liblxqt.so.2 \
libstdc++.so.6"

inherit rpm
