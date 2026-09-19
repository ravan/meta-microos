SUMMARY = "LeechCraft Azoth Media Objects Module"
DESCRIPTION = "This package provides an plugin for LeechCraft Azoth which \
allows embedding different media objects in chat tabs."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-azoth-embedmedia-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "de6fc5e57627f0cbbaeb69f435bab794d61b95df62a7addf46f3b93b23f928103ba7cbd570b1367dfa15342a7449d46d20f6c243f354c198236e7acfeecc66be"

RPROVIDES:${PN} += "leechcraft-azoth-embedmedia \
libleechcraft-azoth-embedmedia.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft-azoth \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-gui-qt6.so.0.6.75 \
libleechcraft-util-qt6.so.0.6.75 \
libleechcraft-util-sll-qt6.so.0.6.75 \
libleechcraft-util-threads-qt6.so.0.6.75 \
libleechcraft-util-xpc-qt6.so.0.6.75 \
libstdc++.so.6"

inherit rpm
