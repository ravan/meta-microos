SUMMARY = "LeechCraft Web Browser Module"
DESCRIPTION = "This package provides a WebEngine-based web browser plugin for LeechCraft. \
Poshuku is extensible with plugins. \
 \
Currently it features: \
 * integration with other plugins; \
 * autodiscovery; \
 * tagging bookmarks; \
 * support for SQLite or PostgreSQL storage."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-poshuku-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "623bd010bc165173c10867675a30010f1c8f8bf2bbeba40ce567bf94e3bcc1795e9891e0fe2f9d582e9b501ba7e0daea60b59798753bb0234c8b62f6605e0ec6"

RPROVIDES:${PN} += "leechcraft-poshuku \
libleechcraft-poshuku.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
leechcraft-poshuku-backend \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Sql.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libidn.so.12 \
libleechcraft-util-db-qt6.so.0.6.75 \
libleechcraft-util-gui-qt6.so.0.6.75 \
libleechcraft-util-models-qt6.so.0.6.75 \
libleechcraft-util-network-qt6.so.0.6.75 \
libleechcraft-util-qt6.so.0.6.75 \
libleechcraft-util-shortcuts-qt6.so.0.6.75 \
libleechcraft-util-sll-qt6.so.0.6.75 \
libleechcraft-util-sys-qt6.so.0.6.75 \
libleechcraft-util-tags-qt6.so.0.6.75 \
libleechcraft-util-xpc-qt6.so.0.6.75 \
libleechcraft-util-xsd-qt6.so.0.6.75 \
libleechcraft-xsd-qt6.so.0.6.75 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
