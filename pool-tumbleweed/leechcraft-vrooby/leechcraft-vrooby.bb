SUMMARY = "LeechCraft Removable storage devices Manager"
DESCRIPTION = "This package provides a Vrooby plugin for LeechCraft \
which allows to watch removable storage devices via D-Bus and udisks."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-vrooby-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "ccf0bdaf44fce7614dfb07131b3e2e7d7c142bae04ac5bec509f072af12341b83da70d90fffdde6ee39136c07e75eaa610d12d874ad7a999c0e0099db56a108f"

RPROVIDES:${PN} += "leechcraft-vrooby \
libleechcraft-vrooby.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
leechcraft-sb \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6QuickWidgets.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-gui-qt6.so.0.6.75 \
libleechcraft-util-models-qt6.so.0.6.75 \
libleechcraft-util-qml-qt6.so.0.6.75 \
libleechcraft-util-qt6.so.0.6.75 \
libleechcraft-util-sll-qt6.so.0.6.75 \
libleechcraft-util-sys-qt6.so.0.6.75 \
libleechcraft-util-threads-qt6.so.0.6.75 \
libleechcraft-util-xpc-qt6.so.0.6.75 \
libstdc++.so.6 \
qt6qmlimport-QtQuick \
qt6qmlimport-QtQuick.Controls"

inherit rpm
