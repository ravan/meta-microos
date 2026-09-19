SUMMARY = "LeechCraft Blogique LiveJournal Module"
DESCRIPTION = "This package provides a LiveJournal subplugin for LeechCraft Blogique."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-blogique-metida-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "3b8726ce35bbfeca40950bbc2c74116f84d6f46712258c9178dd9fd7f7ddf56b9957992b491c97f6348f3f4b480d155fbbceb923d6e21273916bce1a5a504b57"

RPROVIDES:${PN} += "leechcraft-blogique-metida \
leechcraft-blogique-subplugin \
libleechcraft-blogique-metida.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
leechcraft-blogique \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Sql.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-db-qt6.so.0.6.75 \
libleechcraft-util-gui-qt6.so.0.6.75 \
libleechcraft-util-models-qt6.so.0.6.75 \
libleechcraft-util-qt6.so.0.6.75 \
libleechcraft-util-sll-qt6.so.0.6.75 \
libleechcraft-util-svcauth-qt6.so.0.6.75 \
libleechcraft-util-sys-qt6.so.0.6.75 \
libleechcraft-util-threads-qt6.so.0.6.75 \
libleechcraft-util-xpc-qt6.so.0.6.75 \
libleechcraft-xsd-qt6.so.0.6.75 \
libstdc++.so.6"

inherit rpm
