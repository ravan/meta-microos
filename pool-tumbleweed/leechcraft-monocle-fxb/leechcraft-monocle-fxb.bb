SUMMARY = "FictionBook support for LeechCraft Monocle"
DESCRIPTION = "This package contains the FictionBook subplugin for LeechCraft Monocle."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-monocle-fxb-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "b32886c04757e60873388740c6840e82814a15f9ec6ec135ab361ac6234ed0b15bf43a931cdc97767ce98c495466c7497cd4d94b26c36a3457e8b4f724131d64"

RPROVIDES:${PN} += "leechcraft-monocle-fxb \
leechcraft-monocle-subplugin \
libleechcraft-monocle-fxb.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
leechcraft-monocle \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-monocle-util-qt6.so.0.6.75 \
libleechcraft-util-sll-qt6.so.0.6.75 \
libleechcraft-xsd-qt6.so.0.6.75 \
libstdc++.so.6"

inherit rpm
