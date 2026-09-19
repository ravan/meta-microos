SUMMARY = "LeechCraft Azoth Chat history Module"
DESCRIPTION = "This package provides a chat history plugin for LeechCraft Azoth. \
It supports storing history from normal one-to-one chats as well as from \
multiuser conferences and private chats in conferences. It also allows to \
search the logs with SQL's LIKE expressions. SQLite is used for storage."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-azoth-chathistory-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "3b12e8e476d7e09efbfa582bf5ecd8eddcba5a831de8a91a543318c2b8858da2969d21e88aa1036beaa11cfd45a9ef28fbed3c5d05f0347199c7ccf115083182"

RPROVIDES:${PN} += "leechcraft-azoth-chathistory \
libleechcraft-azoth-chathistory.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft-azoth \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Sql.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-db-qt6.so.0.6.75 \
libleechcraft-util-gui-qt6.so.0.6.75 \
libleechcraft-util-models-qt6.so.0.6.75 \
libleechcraft-util-qt6.so.0.6.75 \
libleechcraft-util-sll-qt6.so.0.6.75 \
libleechcraft-util-sys-qt6.so.0.6.75 \
libleechcraft-util-threads-qt6.so.0.6.75 \
libleechcraft-util-xpc-qt6.so.0.6.75 \
libleechcraft-xsd-qt6.so.0.6.75 \
libstdc++.so.6 \
qt6-sql-sqlite"

inherit rpm
