SUMMARY = "LeechCraft GMail notifier Module"
DESCRIPTION = "This package provides a GMail notifications plugin for Leechcraft \
which allows to show notifications about new mail in your GMail account. \
 \
It has a configurable frequency for updates and the number of last unread \
messages shown."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-gmailnotifier-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "93afcba5838dbdff0d0ea8c0b30b6cb28bc4f9aa145741e5c78012887d5d8e7afe02c5bf0d29a5e64355cae3be9d4e997b8ba27159045d5aad5f00a9daad5ded"

RPROVIDES:${PN} += "leechcraft-gmailnotifier \
libleechcraft-gmailnotifier.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
leechcraft-http \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Qml.so.6 \
libQt6QuickWidgets.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-gui-qt6.so.0.6.75 \
libleechcraft-util-qml-qt6.so.0.6.75 \
libleechcraft-util-sys-qt6.so.0.6.75 \
libleechcraft-util-xpc-qt6.so.0.6.75 \
libleechcraft-xsd-qt6.so.0.6.75 \
libstdc++.so.6 \
qt6qmlimport-QtQuick"

inherit rpm
