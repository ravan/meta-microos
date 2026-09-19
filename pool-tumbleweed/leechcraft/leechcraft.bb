SUMMARY = "Modular Internet Client"
DESCRIPTION = "LeechCraft is a modular 'Internet client' application. \
 \
LeechCraft allows to browse the web, read RSS/Atom feeds, download \
files via BitTorrent, HTTP, FTP and DC, automatically stream, \
download or play podcasts and other media files and much more. \
 \
Features can be added via plugins that can be integrated with \
each other, while staying abstract from the exact implementation. \
 \
This package contains the main LeechCraft executable, which connects \
all the plugins with each other, routes requests between them, tracks \
dependencies and performs several other housekeeping tasks."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "8b28c616a29c0567050d4137e89c249cdb5c65a1a43a7d18dfcced4cebfa94daf80b1783051dab4880afbd8853ab51b24280eef2876a2344e4e138c8939f1a59"

RPROVIDES:${PN} += "leechcraft \
libleechcraft-util-qt6.so.0.6.75 \
libleechcraft-xsd-qt6.so.0.6.75"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libQt6Concurrent.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6Sql.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libX11.so.6 \
libboost-program-options.so.1.91.0 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-db-qt6.so.0.6.75 \
libleechcraft-util-gui-qt6.so.0.6.75 \
libleechcraft-util-models-qt6.so.0.6.75 \
libleechcraft-util-network-qt6.so.0.6.75 \
libleechcraft-util-qml-qt6.so.0.6.75 \
libleechcraft-util-shortcuts-qt6.so.0.6.75 \
libleechcraft-util-sll-qt6.so.0.6.75 \
libleechcraft-util-sys-qt6.so.0.6.75 \
libleechcraft-util-tags-qt6.so.0.6.75 \
libleechcraft-util-x11-qt6.so.0.6.75 \
libleechcraft-util-xpc-qt6.so.0.6.75 \
libstdc++.so.6 \
oxygen-icon-theme \
qt6qmlimport-QtQuick \
qt6qmlimport-QtQuick.2"

inherit rpm
