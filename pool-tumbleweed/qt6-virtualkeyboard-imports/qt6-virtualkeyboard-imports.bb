SUMMARY = "Qt 6 VirtualKeyboard QML files and plugins"
DESCRIPTION = "QML files and plugins from the Qt 6 VirtualKeyboard module."
LICENSE = "GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-virtualkeyboard-imports-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "a6b37a682e7d504a5b94a4bd35862e05373d551073e620cda87ebb8f30e535a5d0fdf907869c5a982afbad1f554e318e3a43a18e6b04f8e33c499ba2188b3202"

RPROVIDES:${PN} += "libqtvkbbuiltinstylesplugin.so \
libqtvkbcomponentsplugin.so \
libqtvkbhangulplugin.so \
libqtvkbhunspellplugin.so \
libqtvkblayoutsplugin.so \
libqtvkbopenwnnplugin.so \
libqtvkbpinyinplugin.so \
libqtvkbplugin.so \
libqtvkbpluginsplugin.so \
libqtvkbsettingsplugin.so \
libqtvkbstylesplugin.so \
libqtvkbtcimeplugin.so \
libqtvkbthaiplugin.so \
libvirtualkeyboardplugin.so \
qt6-virtualkeyboard-imports \
qt6qmlimport-QtQuick.VirtualKeyboard \
qt6qmlimport-QtQuick.VirtualKeyboard.1 \
qt6qmlimport-QtQuick.VirtualKeyboard.2 \
qt6qmlimport-QtQuick.VirtualKeyboard.6 \
qt6qmlimport-QtQuick.VirtualKeyboard.Components \
qt6qmlimport-QtQuick.VirtualKeyboard.Components.1 \
qt6qmlimport-QtQuick.VirtualKeyboard.Components.2 \
qt6qmlimport-QtQuick.VirtualKeyboard.Components.6 \
qt6qmlimport-QtQuick.VirtualKeyboard.Core \
qt6qmlimport-QtQuick.VirtualKeyboard.Core.1 \
qt6qmlimport-QtQuick.VirtualKeyboard.Core.2 \
qt6qmlimport-QtQuick.VirtualKeyboard.Core.6 \
qt6qmlimport-QtQuick.VirtualKeyboard.Layouts \
qt6qmlimport-QtQuick.VirtualKeyboard.Layouts.1 \
qt6qmlimport-QtQuick.VirtualKeyboard.Layouts.2 \
qt6qmlimport-QtQuick.VirtualKeyboard.Layouts.6 \
qt6qmlimport-QtQuick.VirtualKeyboard.Plugins \
qt6qmlimport-QtQuick.VirtualKeyboard.Plugins.2 \
qt6qmlimport-QtQuick.VirtualKeyboard.Plugins.6 \
qt6qmlimport-QtQuick.VirtualKeyboard.Plugins.Hangul \
qt6qmlimport-QtQuick.VirtualKeyboard.Plugins.Hangul.1 \
qt6qmlimport-QtQuick.VirtualKeyboard.Plugins.Hangul.2 \
qt6qmlimport-QtQuick.VirtualKeyboard.Plugins.Hangul.6 \
qt6qmlimport-QtQuick.VirtualKeyboard.Plugins.Hunspell \
qt6qmlimport-QtQuick.VirtualKeyboard.Plugins.Hunspell.1 \
qt6qmlimport-QtQuick.VirtualKeyboard.Plugins.Hunspell.2 \
qt6qmlimport-QtQuick.VirtualKeyboard.Plugins.Hunspell.6 \
qt6qmlimport-QtQuick.VirtualKeyboard.Plugins.OpenWNN \
qt6qmlimport-QtQuick.VirtualKeyboard.Plugins.OpenWNN.1 \
qt6qmlimport-QtQuick.VirtualKeyboard.Plugins.OpenWNN.2 \
qt6qmlimport-QtQuick.VirtualKeyboard.Plugins.OpenWNN.6 \
qt6qmlimport-QtQuick.VirtualKeyboard.Plugins.Pinyin \
qt6qmlimport-QtQuick.VirtualKeyboard.Plugins.Pinyin.1 \
qt6qmlimport-QtQuick.VirtualKeyboard.Plugins.Pinyin.2 \
qt6qmlimport-QtQuick.VirtualKeyboard.Plugins.Pinyin.6 \
qt6qmlimport-QtQuick.VirtualKeyboard.Plugins.TCIme \
qt6qmlimport-QtQuick.VirtualKeyboard.Plugins.TCIme.1 \
qt6qmlimport-QtQuick.VirtualKeyboard.Plugins.TCIme.2 \
qt6qmlimport-QtQuick.VirtualKeyboard.Plugins.TCIme.6 \
qt6qmlimport-QtQuick.VirtualKeyboard.Plugins.Thai \
qt6qmlimport-QtQuick.VirtualKeyboard.Plugins.Thai.2 \
qt6qmlimport-QtQuick.VirtualKeyboard.Plugins.Thai.6 \
qt6qmlimport-QtQuick.VirtualKeyboard.Settings \
qt6qmlimport-QtQuick.VirtualKeyboard.Settings.1 \
qt6qmlimport-QtQuick.VirtualKeyboard.Settings.2 \
qt6qmlimport-QtQuick.VirtualKeyboard.Settings.6 \
qt6qmlimport-QtQuick.VirtualKeyboard.Styles \
qt6qmlimport-QtQuick.VirtualKeyboard.Styles.1 \
qt6qmlimport-QtQuick.VirtualKeyboard.Styles.2 \
qt6qmlimport-QtQuick.VirtualKeyboard.Styles.6 \
qt6qmlimport-QtQuick.VirtualKeyboard.Styles.Builtin \
qt6qmlimport-QtQuick.VirtualKeyboard.Styles.Builtin.1 \
qt6qmlimport-QtQuick.VirtualKeyboard.Styles.Builtin.2 \
qt6qmlimport-QtQuick.VirtualKeyboard.Styles.Builtin.6"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6HunspellInputMethod.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6Svg.so.6 \
libQt6VirtualKeyboard.so.6 \
libQt6VirtualKeyboardQml.so.6 \
libQt6VirtualKeyboardSettings.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6 \
qt6qmlimport-Qt.labs.folderlistmodel \
qt6qmlimport-QtMultimedia \
qt6qmlimport-QtQml \
qt6qmlimport-QtQuick \
qt6qmlimport-QtQuick.Layouts \
qt6qmlimport-QtQuick.Window"

inherit rpm
