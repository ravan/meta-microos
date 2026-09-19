SUMMARY = "Plasma shell for TVs"
DESCRIPTION = "Plasma Bigscreen is a Wayland desktop environment designed for devices like \
HTPCs and SBCs connected to TVs and projectors."
LICENSE = "GPL-2.0-or-later"

PV = "6.7.5"

RPM_NAME = "plasma6-bigscreen-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "8cf9a21a00982650f50329b8a0843701cad7e4353c64beba6ff2166f7353d2d64f02fca30aa3c8f8b0a651c58cfe257d863dfa67f0e5a6c64aad9755a1bbf186"

RPROVIDES:${PN} += "libbigscreenplugin.so \
libbigscreenshell.so \
libcontrollerhandlerplugin.so \
libplasma-bigscreen-webapp-plugin.so \
plasma6-bigscreen \
qt6qmlimport-org.kde.bigscreen \
qt6qmlimport-org.kde.bigscreen.254 \
qt6qmlimport-org.kde.bigscreen.controllerhandler \
qt6qmlimport-org.kde.bigscreen.controllerhandler.254 \
qt6qmlimport-org.kde.bigscreen.shell \
qt6qmlimport-org.kde.bigscreen.shell.254 \
qt6qmlimport-org.kde.bigscreen.webapp.sources \
qt6qmlimport-org.kde.bigscreen.webapp.sources.254"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libKF6BluezQt.so.6 \
libKF6ConfigCore.so.6 \
libKF6CoreAddons.so.6 \
libKF6DBusAddons.so.6 \
libKF6GlobalAccel.so.6 \
libKF6I18n.so.6 \
libKF6I18nQml.so.6 \
libKF6IconThemes.so.6 \
libKF6JobWidgets.so.6 \
libKF6KCMUtilsCore.so.6 \
libKF6KCMUtilsQuick.so.6 \
libKF6KIOGui.so.6 \
libKF6Notifications.so.6 \
libKF6Package.so.6 \
libKF6Screen.so.8 \
libKF6Service.so.6 \
libKF6Solid.so.6 \
libKF6WindowSystem.so.6 \
libPlasma.so.7 \
libPlasmaActivities.so.7 \
libQCoro6Qml.so.0 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6WebEngineCore.so.6 \
libQt6WebEngineQuick.so.6 \
libQt6Widgets.so.6 \
libSDL3.so.0 \
libc.so.6 \
libcec.so.8 \
libgcc-s.so.1 \
libkworkspace6.so.6 \
libstdc++.so.6 \
libtaskmanager.so.6 \
qt6qmlimport-Qt.labs.platform \
qt6qmlimport-Qt5Compat.GraphicalEffects \
qt6qmlimport-QtMultimedia \
qt6qmlimport-QtQml \
qt6qmlimport-QtQml.Models \
qt6qmlimport-QtQuick \
qt6qmlimport-QtQuick.2 \
qt6qmlimport-QtQuick.Controls \
qt6qmlimport-QtQuick.Controls.2 \
qt6qmlimport-QtQuick.Effects \
qt6qmlimport-QtQuick.Layouts \
qt6qmlimport-QtQuick.Layouts.1 \
qt6qmlimport-QtQuick.Templates \
qt6qmlimport-QtQuick.Window \
qt6qmlimport-QtQuick.Window.2 \
qt6qmlimport-QtWebEngine \
qt6qmlimport-org.kde.bluezqt \
qt6qmlimport-org.kde.breeze.components \
qt6qmlimport-org.kde.coreaddons \
qt6qmlimport-org.kde.kcmutils \
qt6qmlimport-org.kde.kdeconnect \
qt6qmlimport-org.kde.kirigami \
qt6qmlimport-org.kde.kirigamiaddons.components \
qt6qmlimport-org.kde.kitemmodels \
qt6qmlimport-org.kde.kquickcontrols \
qt6qmlimport-org.kde.kquickcontrolsaddons \
qt6qmlimport-org.kde.kquickcontrolsaddons.2 \
qt6qmlimport-org.kde.ksvg \
qt6qmlimport-org.kde.layershell \
qt6qmlimport-org.kde.milou \
qt6qmlimport-org.kde.plasma.clock \
qt6qmlimport-org.kde.plasma.components \
qt6qmlimport-org.kde.plasma.components.3 \
qt6qmlimport-org.kde.plasma.configuration.2 \
qt6qmlimport-org.kde.plasma.core \
qt6qmlimport-org.kde.plasma.core.2 \
qt6qmlimport-org.kde.plasma.extras \
qt6qmlimport-org.kde.plasma.extras.2 \
qt6qmlimport-org.kde.plasma.networkmanagement \
qt6qmlimport-org.kde.plasma.plasma5support \
qt6qmlimport-org.kde.plasma.plasmoid \
qt6qmlimport-org.kde.plasma.private.battery \
qt6qmlimport-org.kde.plasma.private.batterymonitor \
qt6qmlimport-org.kde.plasma.private.kicker.0 \
qt6qmlimport-org.kde.plasma.private.nanoshell \
qt6qmlimport-org.kde.plasma.private.sessions \
qt6qmlimport-org.kde.plasma.private.volume \
qt6qmlimport-org.kde.plasma.wallpapers.image.2 \
qt6qmlimport-org.kde.plasma.workspace.keyboardlayout \
qt6qmlimport-org.kde.taskmanager \
systemsettings6"

inherit rpm
