SUMMARY = "Plasma shell for mobile devices"
DESCRIPTION = "Plasma shell for mobile devices."
LICENSE = "GPL-2.0-or-later"

PV = "6.7.5"

RPM_NAME = "plasma6-mobile-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "b403e7a0c0e2bc7344957d2660cf59865c3b173105a87b5c841967fda6acebd5aefc8839ccbc84f506b7b459246ed62eac1584aff8da85eb8e1d788e5c2e034b"

RPROVIDES:${PN} += "libcellularplugin.so \
libdpmsplugin.so \
libflashlightplugin.so \
libhapticsplugin.so \
libkscreenosdplugin.so \
libmobileshellplugin.so \
libmobileshellstateplugin.so \
libmobiletaskswitcherplugin.so \
libnightcolorplugin.so \
libpowermenuplugin.so \
libprepareplugin.so \
libquicksettingsplugin.so \
libraiselockscreenplugin.so \
librecordplugin.so \
librotationplugin.so \
libscreenbrightnessplugin.so \
libscreenrotationplugin.so \
libscreenshotplugin.so \
libshellsettingsplugin.so \
libtimeplugin.so \
libwallpaperimageplugin.so \
libwaydroidintegrationplugin.so \
libwifiplugin.so \
libwindowplugin.so \
plasma5-mobile \
plasma6-mobile \
qt6qmlimport-org.kde.plasma.mobileinitialstart.cellular \
qt6qmlimport-org.kde.plasma.mobileinitialstart.prepare \
qt6qmlimport-org.kde.plasma.mobileinitialstart.prepare.1 \
qt6qmlimport-org.kde.plasma.mobileinitialstart.time \
qt6qmlimport-org.kde.plasma.mobileinitialstart.time.1 \
qt6qmlimport-org.kde.plasma.mobileinitialstart.wifi \
qt6qmlimport-org.kde.plasma.mobileinitialstart.wifi.1 \
qt6qmlimport-org.kde.plasma.private.mobileshell \
qt6qmlimport-org.kde.plasma.private.mobileshell.2 \
qt6qmlimport-org.kde.plasma.private.mobileshell.254 \
qt6qmlimport-org.kde.plasma.private.mobileshell.6 \
qt6qmlimport-org.kde.plasma.private.mobileshell.dpmsplugin \
qt6qmlimport-org.kde.plasma.private.mobileshell.dpmsplugin.254 \
qt6qmlimport-org.kde.plasma.private.mobileshell.hapticsplugin \
qt6qmlimport-org.kde.plasma.private.mobileshell.hapticsplugin.254 \
qt6qmlimport-org.kde.plasma.private.mobileshell.quicksettingsplugin \
qt6qmlimport-org.kde.plasma.private.mobileshell.quicksettingsplugin.254 \
qt6qmlimport-org.kde.plasma.private.mobileshell.quicksettingsplugin.6 \
qt6qmlimport-org.kde.plasma.private.mobileshell.raiselockscreenplugin \
qt6qmlimport-org.kde.plasma.private.mobileshell.raiselockscreenplugin.254 \
qt6qmlimport-org.kde.plasma.private.mobileshell.rotationplugin \
qt6qmlimport-org.kde.plasma.private.mobileshell.rotationplugin.254 \
qt6qmlimport-org.kde.plasma.private.mobileshell.screenbrightnessplugin \
qt6qmlimport-org.kde.plasma.private.mobileshell.screenbrightnessplugin.254 \
qt6qmlimport-org.kde.plasma.private.mobileshell.shellsettingsplugin \
qt6qmlimport-org.kde.plasma.private.mobileshell.shellsettingsplugin.254 \
qt6qmlimport-org.kde.plasma.private.mobileshell.state \
qt6qmlimport-org.kde.plasma.private.mobileshell.state.254 \
qt6qmlimport-org.kde.plasma.private.mobileshell.state.6 \
qt6qmlimport-org.kde.plasma.private.mobileshell.taskswitcherplugin \
qt6qmlimport-org.kde.plasma.private.mobileshell.taskswitcherplugin.254 \
qt6qmlimport-org.kde.plasma.private.mobileshell.taskswitcherplugin.6 \
qt6qmlimport-org.kde.plasma.private.mobileshell.wallpaperimageplugin \
qt6qmlimport-org.kde.plasma.private.mobileshell.wallpaperimageplugin.254 \
qt6qmlimport-org.kde.plasma.private.mobileshell.waydroidintegrationplugin \
qt6qmlimport-org.kde.plasma.private.mobileshell.waydroidintegrationplugin.254 \
qt6qmlimport-org.kde.plasma.private.mobileshell.windowplugin \
qt6qmlimport-org.kde.plasma.private.mobileshell.windowplugin.254 \
qt6qmlimport-org.kde.plasma.quicksetting.flashlight \
qt6qmlimport-org.kde.plasma.quicksetting.flashlight.254 \
qt6qmlimport-org.kde.plasma.quicksetting.kscreenosd \
qt6qmlimport-org.kde.plasma.quicksetting.kscreenosd.1 \
qt6qmlimport-org.kde.plasma.quicksetting.nightcolor \
qt6qmlimport-org.kde.plasma.quicksetting.nightcolor.254 \
qt6qmlimport-org.kde.plasma.quicksetting.powermenu \
qt6qmlimport-org.kde.plasma.quicksetting.powermenu.254 \
qt6qmlimport-org.kde.plasma.quicksetting.record \
qt6qmlimport-org.kde.plasma.quicksetting.record.254 \
qt6qmlimport-org.kde.plasma.quicksetting.screenrotation \
qt6qmlimport-org.kde.plasma.quicksetting.screenrotation.1 \
qt6qmlimport-org.kde.plasma.quicksetting.screenshot \
qt6qmlimport-org.kde.plasma.quicksetting.screenshot.1"

RDEPENDS:${PN} += "/usr/bin/sh \
kde-cli-tools6 \
kf6-bluez-qt-imports \
kf6-kdeclarative-imports \
kf6-kirigami-imports \
kwin6 \
layer-shell-qt6-imports \
ld-linux-aarch64.so.1 \
libKF6AuthCore.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6ConfigQml.so.6 \
libKF6CoreAddons.so.6 \
libKF6DBusAddons.so.6 \
libKF6I18n.so.6 \
libKF6JobWidgets.so.6 \
libKF6KCMUtilsCore.so.6 \
libKF6KCMUtilsQuick.so.6 \
libKF6KIOCore.so.6 \
libKF6KIOGui.so.6 \
libKF6KIOWidgets.so.6 \
libKF6ModemManagerQt.so.6 \
libKF6NetworkManagerQt.so.6 \
libKF6Notifications.so.6 \
libKF6Package.so.6 \
libKF6Screen.so.8 \
libKF6ScreenDpms.so.8 \
libKF6Service.so.6 \
libKF6Solid.so.6 \
libKF6WindowSystem.so.6 \
libKPipeWireRecord.so.6 \
libKWaylandClient.so.6 \
libLayerShellQtInterface.so.6 \
libPlasma.so.7 \
libPlasmaQuick.so.7 \
libQCoro6Core.so.0 \
libQCoro6DBus.so.0 \
libQCoro6Qml.so.0 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6Sensors.so.6 \
libQt6WaylandClient.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libkwin.so.6 \
libkworkspace6.so.6 \
libm.so.6 \
libstdc++.so.6 \
libudev.so.1 \
libwayland-client.so.0 \
milou6 \
plasma6-nano \
plasma6-nm \
plasma6-pa \
plasma6-workspace \
qqc2-breeze-style6 \
qt6-declarative-imports \
qt6-qt5compat-imports \
qt6-wayland \
systemsettings6"

inherit rpm
