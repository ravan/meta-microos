SUMMARY = "LeechCraft Poshuku Online Bookmarks Module"
DESCRIPTION = "This package provides an online bookmarks plugin for LeechCraft Poshuku \
for synchronization of bookmarks with services."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-poshuku-onlinebookmarks-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "1911d87077f1285a727a4cc775b3096697401cdbc4008658369ac5f92dd15355b5d3b062a9d8f7ffd205010fea03f9c341c5bcfab93dbfd6104d9912f47d4657"

RPROVIDES:${PN} += "leechcraft-poshuku-onlinebookmarks \
libleechcraft-poshuku-onlinebookmarks.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft-poshuku \
leechcraft-securestorage \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-xpc-qt6.so.0.6.75 \
libleechcraft-xsd-qt6.so.0.6.75 \
libstdc++.so.6"

inherit rpm
