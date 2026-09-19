SUMMARY = "LeechCraft TabsList Module"
DESCRIPTION = "This package provides a tabs list plugin for Leechcraft \
which can show the list of currently opened tabs \
and allows to navigate between them."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-tabslist-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "702c8938713df7d8f98f522979e535de15af3a5c50182240300af7513a97df749e787e427ecc8b9175a9f6b1ca2f83502925f317918ca5bb4aa067294c6558f5"

RPROVIDES:${PN} += "leechcraft-tabslist \
libleechcraft-tabslist.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
