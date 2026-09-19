SUMMARY = "LeechCraft Media player Module"
DESCRIPTION = "This package provides an audio player plugin for LeechCraft. \
It uses Gstreamer as a backend, thus supporting major codecs. \
 \
Features: \
 * Streaming media over Internet. \
 * Play queue. \
 * Support for automatic podcast playing (with a plugin like Aggregator)."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-lmp-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "48dcdddc8380fd631b1dcb4b723e39f35a43f401794f0233ac9be9010e34ba0946a2eb300868352d0ac34337df4b95e6ffbe5ff3c44016ab5af56be9dc5751db"

RPROVIDES:${PN} += "leechcraft-audioplayer \
leechcraft-lmp \
leechcraft-soundnotifications \
libleechcraft-lmp.so"

RDEPENDS:${PN} += "gstreamer-plugins-base \
gstreamer-plugins-good \
ld-linux-aarch64.so.1 \
leechcraft \
libQt6Concurrent.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Qml.so.6 \
libQt6QuickWidgets.so.6 \
libQt6Sql.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstreamer-1.0.so.0 \
libleechcraft-lmp-util-qt6.so.0.6.75 \
libleechcraft-util-db-qt6.so.0.6.75 \
libleechcraft-util-gui-qt6.so.0.6.75 \
libleechcraft-util-models-qt6.so.0.6.75 \
libleechcraft-util-qml-qt6.so.0.6.75 \
libleechcraft-util-qt6.so.0.6.75 \
libleechcraft-util-sll-qt6.so.0.6.75 \
libleechcraft-util-sys-qt6.so.0.6.75 \
libleechcraft-util-threads-qt6.so.0.6.75 \
libleechcraft-util-xpc-qt6.so.0.6.75 \
libleechcraft-util-xsd-qt6.so.0.6.75 \
libleechcraft-xsd-qt6.so.0.6.75 \
libm.so.6 \
libstdc++.so.6 \
libtag.so.2 \
qt6qmlimport-QtQuick \
qt6qmlimport-QtQuick.2 \
qt6qmlimport-QtQuick.Controls \
qt6qmlimport-QtQuick.Effects \
qt6qmlimport-QtQuick.Layouts"

inherit rpm
