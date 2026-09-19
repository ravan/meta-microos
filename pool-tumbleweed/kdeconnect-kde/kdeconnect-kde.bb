SUMMARY = "Integration of Android with Linux desktops"
DESCRIPTION = "A package for integration of Android with Linux desktops. \
 \
Current feature list: \
- Clipboard share: copy from or to your desktop \
- Notifications sync (4.3+): Read your Android notifications \
- Multimedia remote control: Use your phone as a remote control \
- WiFi connection: no USB wire or Bluetooth needed \
- RSA Encryption: your information is safe \
 \
Please note you will need to install KDE Connect on Android for this app to work: \
https://play.google.com/store/apps/details?id=org.kde.kdeconnect_tp or \
https://f-droid.org/en/packages/org.kde.kdeconnect_tp/"
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kdeconnect-kde-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "afd68137de6b7c31fae4397df1546a75076d06cbd7adea8696759d768be39e16b857618df14ed489ed3ad1a2ca60e0205648a6c56580d4f1ffe0fdd15a151604"

RPROVIDES:${PN} += "kdeconnect-kde \
kdeconnect-kde-zsh-completion \
libkdeconnect-findthisdevice-qmlhelper.so \
libkdeconnectcore.so.26 \
libkdeconnectdeclarativeplugin.so \
qt6qmlimport-org.kde.kdeconnect \
qt6qmlimport-org.kde.kdeconnect.1 \
qt6qmlimport-org.kde.kdeconnect.private.findthisdevice \
qt6qmlimport-org.kde.kdeconnect.private.findthisdevice.254"

RDEPENDS:${PN} += "/usr/bin/sh \
kf6-kirigami-imports \
kf6-kpeople-imports \
kf6-qqc2-desktop-style \
kirigami-addons6 \
ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6DBusAddons.so.6 \
libKF6GuiAddons.so.6 \
libKF6I18n.so.6 \
libKF6JobWidgets.so.6 \
libKF6KIOCore.so.6 \
libKF6KIOFileWidgets.so.6 \
libKF6KIOGui.so.6 \
libKF6KIOWidgets.so.6 \
libKF6ModemManagerQt.so.6 \
libKF6Notifications.so.6 \
libKF6People.so.6 \
libKF6PulseAudioQt.so.5 \
libKF6Service.so.6 \
libKF6Solid.so.6 \
libKF6StatusNotifierItem.so.6 \
libKF6WindowSystem.so.6 \
libQt6Bluetooth.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Multimedia.so.6 \
libQt6Network.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6QuickControls2.so.6 \
libQt6WaylandClient.so.6 \
libQt6Widgets.so.6 \
libX11.so.6 \
libXtst.so.6 \
libc.so.6 \
libcrypto.so.3 \
libdbus-1.so.3 \
libei.so.1 \
libevdev.so.2 \
libfakekey.so.0 \
libstdc++.so.6 \
libwayland-client.so.0 \
libxkbcommon.so.0 \
qt6-declarative-imports \
qt6-multimedia-imports \
qt6qmlimport-QtCore \
qt6qmlimport-QtQml \
qt6qmlimport-QtQml.Models \
qt6qmlimport-QtQuick \
qt6qmlimport-QtQuick.2 \
qt6qmlimport-QtQuick.Controls \
qt6qmlimport-QtQuick.Controls.2 \
qt6qmlimport-QtQuick.Dialogs \
qt6qmlimport-QtQuick.Layouts \
qt6qmlimport-QtQuick.Layouts.1 \
qt6qmlimport-org.kde.config \
qt6qmlimport-org.kde.kcmutils \
qt6qmlimport-org.kde.kdeconnect.1 \
qt6qmlimport-org.kde.kirigami \
qt6qmlimport-org.kde.kirigami.2 \
qt6qmlimport-org.kde.kitemmodels \
qt6qmlimport-org.kde.kquickcontrolsaddons \
qt6qmlimport-org.kde.plasma.components \
qt6qmlimport-org.kde.plasma.core \
qt6qmlimport-org.kde.plasma.extras \
qt6qmlimport-org.kde.plasma.plasmoid \
sshfs"

inherit rpm
