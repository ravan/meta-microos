SUMMARY = "Maliit virtual keyboard"
DESCRIPTION = "Maliit provides a flexible and cross-platform input method framework. \
It has a plugin-based client-server architecture where applications \
act as clients and communicate with the Maliit server via input \
context plugins. The communication link currently uses D-Bus. Maliit \
is an open source framework (LGPL 2) with open source plugins (BSD)."
LICENSE = "BSD-3-Clause & LGPL-3.0-only & CC-BY-3.0"

PV = "2.3.1"

RPM_NAME = "maliit-keyboard-2.3.1-3.10.aarch64.rpm"
RPM_HASH = "ae9e2e804d82652092fa2aa07cbc69d6d9e825279816d3e053e870fc139a94034c701f5254921e0462dca6d630c61a6cf65ecf23e8d26e88c29b6aee4e0a388e"

RPROVIDES:${PN} += "libenplugin.so \
libmaliit-keyboard-plugin.so \
maliit-keyboard \
maliit-keyboard-emoji \
maliit-keyboard2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Multimedia.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5QuickControls2.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libhunspell-1.7.so.0 \
libmaliit-plugins.so.2 \
libpresage.so.1 \
libqt5-qtwayland \
libstdc++.so.6 \
qt5qmlimport-QtGraphicalEffects.1 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Controls.2 \
qt5qmlimport-QtQuick.Layouts.1 \
qt5qmlimport-QtQuick.LocalStorage.2 \
qt5qmlimport-QtQuick.Window.2"

inherit rpm
