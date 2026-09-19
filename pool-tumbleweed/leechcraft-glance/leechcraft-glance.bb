SUMMARY = "LeechCraft Opened tabs overview Module"
DESCRIPTION = "This package provides a tabs overview plugin for Leechcraft \
which shows a grid of overview thumbnails."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-glance-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "b589e6ecde32f395bf1bc0f80c71f324f908082049243ee593294fcbd5d21d98d9ea9d07766bd6d6f971079a813288b6bfba5a0cfd1fe45881e4991e623192c0"

RPROVIDES:${PN} += "leechcraft-glance \
libleechcraft-glance.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6QuickWidgets.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-qml-qt6.so.0.6.75 \
libleechcraft-util-sys-qt6.so.0.6.75 \
libstdc++.so.6 \
qt6qmlimport-QtQuick \
qt6qmlimport-QtQuick.Controls.2"

inherit rpm
