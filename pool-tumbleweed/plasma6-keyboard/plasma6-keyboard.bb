SUMMARY = "Virtual Keyboard for Qt based desktops"
DESCRIPTION = "The plasma-keyboard is a virtual keyboard based on Qt Virtual Keyboard \
designed to integrate in Plasma."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "6.7.5"

RPM_NAME = "plasma6-keyboard-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "e6610bd24bd49b0b5f9b21373fd5c7507960923b615c92584f9fa1ac4966a64a3f81de0d10ca270775f4c0e678d146104903ff218e3c27c51ad3a5d0c5787717"

RPROVIDES:${PN} += "libbreezestyle.so \
libkeyboardlib.so \
plasma6-keyboard \
qt6qmlimport-QtQuick.VirtualKeyboard.Styles.Breeze \
qt6qmlimport-QtQuick.VirtualKeyboard.Styles.Breeze.254 \
qt6qmlimport-org.kde.plasma.keyboard.lib \
qt6qmlimport-org.kde.plasma.keyboard.lib.254"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6I18n.so.6 \
libKF6I18nQml.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6VirtualKeyboard.so.6 \
libQt6WaylandClient.so.6 \
libc.so.6 \
libstdc++.so.6 \
libwayland-client.so.0 \
libxkbcommon.so.0 \
qt6qmlimport-QtQuick \
qt6qmlimport-QtQuick.Controls \
qt6qmlimport-QtQuick.Effects \
qt6qmlimport-QtQuick.Layouts \
qt6qmlimport-QtQuick.VirtualKeyboard \
qt6qmlimport-QtQuick.VirtualKeyboard.Components \
qt6qmlimport-QtQuick.VirtualKeyboard.Plugins \
qt6qmlimport-QtQuick.VirtualKeyboard.Styles \
qt6qmlimport-QtQuick.Window \
qt6qmlimport-org.kde.kirigami \
qt6qmlimport-org.kde.layershell"

inherit rpm
