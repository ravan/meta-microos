SUMMARY = "LXQt File Archiver"
DESCRIPTION = "A simple & lightweight Qt file archiver. The core I/O functions are ported \
from Engrampa (a Gnome File Roller fork). This is only a front-end (a \
graphical interface) to archiving programs like tar and zip."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.0"

RPM_NAME = "lxqt-archiver-1.4.0-1.3.aarch64.rpm"
RPM_HASH = "bb7257ba13aaab203d34091f7ffe6deaff4de370083e6154b5cbea907a72f96f75130d2dbe11f711d103531b5357531f47e32af754f68fbc3f446b5c37908061"

RPROVIDES:${PN} += "lxqt-archiver"

RDEPENDS:${PN} += "bsdtar \
desktop-file-utils \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libfm-qt6.so.17 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libjson-glib-1.0.so.0 \
libstdc++.so.6"

inherit rpm
