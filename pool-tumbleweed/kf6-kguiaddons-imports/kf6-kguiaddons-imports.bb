SUMMARY = "QtQuick bindings for utilities for graphical user interfaces"
DESCRIPTION = "The KDE GUI addons provide utilities for graphical user interfaces in the areas \
of colors, fonts, text, images, keyboard input. This package provides QtQuick \
bindings to use these GUI addons with QML and QtQuick applications."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-kguiaddons-imports-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "62494167a84ae91964cfe64426d91575404098c153371448f44167fa2846b0fc631a6774971da3bc3a3bb09d999be6ab7b5ff366286d0970dc943fa4b30daf60"

RPROVIDES:${PN} += "kf6-kguiaddons-imports \
libkguiaddonsqml.so \
qt6qmlimport-org.kde.guiaddons \
qt6qmlimport-org.kde.guiaddons.1 \
qt6qmlimport-org.kde.guiaddons.254"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6GuiAddons.so.6 \
libKF6GuiAddons6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
