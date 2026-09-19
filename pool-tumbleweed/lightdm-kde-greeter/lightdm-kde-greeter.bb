SUMMARY = "LightDM KDE Greeter"
DESCRIPTION = "This package provides a KDE-based LightDM greeter engine. \
This is a fork of KDE4-based LightDM greeter engine for KDE6."
LICENSE = "GPL-3.0-or-later"

PV = "6.0.5"

RPM_NAME = "lightdm-kde-greeter-6.0.5-1.4.aarch64.rpm"
RPM_HASH = "f85df72b099f9e3214c9588b83a0c86b8430860d0bdf1c61788000a69416b543cd024a645172fc6df31af78992234aee7d7b4c90512d329dd68b4c59d5fbd5b9"

RPROVIDES:${PN} += "lightdm-greeter \
lightdm-kde-greeter"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libKF6AuthCore.so.6 \
libKF6ConfigCore.so.6 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKF6IconThemes.so.6 \
libKF6KCMUtilsCore.so.6 \
libKF6KCMUtilsQuick.so.6 \
libKF6NetworkManagerQt.so.6 \
libKF6Package.so.6 \
libPlasma.so.7 \
libQt6Core.so.6 \
libQt6Core5Compat.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6QuickControls2.so.6 \
libQt6Widgets.so.6 \
libX11.so.6 \
libXrandr.so.2 \
libc.so.6 \
libgobject-2.0.so.0 \
liblightdm-gobject-1.so.0 \
libstdc++.so.6 \
libxcb-xkb.so.1 \
libxcb.so.1 \
lightdm \
lightdm-kde-greeter-branding \
qt6qmlimport-Qt5Compat.GraphicalEffects \
qt6qmlimport-QtQml.2 \
qt6qmlimport-QtQuick \
qt6qmlimport-QtQuick.2 \
qt6qmlimport-QtQuick.Controls \
qt6qmlimport-QtQuick.Controls.2 \
qt6qmlimport-QtQuick.Dialogs \
qt6qmlimport-QtQuick.Layouts.1 \
qt6qmlimport-QtQuick.VirtualKeyboard.2 \
qt6qmlimport-QtQuick.Window.2 \
qt6qmlimport-org.kde.kirigami \
qt6qmlimport-org.kde.kirigami.2 \
qt6qmlimport-org.kde.ksvg \
qt6qmlimport-org.kde.plasma.components.3 \
qt6qmlimport-org.kde.plasma.plasma5support \
qt6qmlimport-org.kde.plasma.wallpapers.image \
qt6qmlimport-org.kde.plasma.workspace.components.2 \
update-alternatives"

inherit rpm
