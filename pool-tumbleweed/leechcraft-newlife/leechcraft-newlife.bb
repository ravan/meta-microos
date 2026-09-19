SUMMARY = "LeechCraft Importer Module"
DESCRIPTION = "This package provides a settings importer plugin for LeechCraft \
which can import settings, preferences, etc. from various applications. \
 \
Currently it supports \
 * Kopete: chat history. \
 * Psi+: account settings, chat history. \
 * Vacuum IM: account settings, chat history. \
 * Akregator: feeds list, individual settings for each feed, like \
update interval and custom storage parameters, Akregator's settings. \
 * Firefox: history, bookmarks, RSS feeds (aka Live bookmarks). \
 * Liferea: feeds list."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-newlife-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "b1d30329e2e385560cb63150324eb9647fdde1f71d0d1d013de736afe4f37d0228a49ff9eb1916b263249cc424c3f3946b2239e4af91200f52936d0fd697a81c"

RPROVIDES:${PN} += "leechcraft-newlife \
libleechcraft-newlife.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Sql.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-sll-qt6.so.0.6.75 \
libleechcraft-util-sys-qt6.so.0.6.75 \
libleechcraft-util-xpc-qt6.so.0.6.75 \
libstdc++.so.6"

inherit rpm
