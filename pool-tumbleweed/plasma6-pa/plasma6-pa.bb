SUMMARY = "The Plasma6 Volume Manager"
DESCRIPTION = "A volume manager plasmoid superseding kmix."
LICENSE = "GPL-2.0-or-later"

PV = "6.7.5"

RPM_NAME = "plasma6-pa-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "bebd4473e8fb5efe1fc7f1beadd091e7792997b0b40a06fa7a297d925aaf9744e20090797263a5d76686f8ab63b88d982c9b9e5d5189161a4e083c83f9226537"

RPROVIDES:${PN} += "libplasma-volume-declarative.so \
libplasma-volume.so.6 \
plasma5-pa \
plasma6-pa \
qt6qmlimport-org.kde.plasma.private.volume \
qt6qmlimport-org.kde.plasma.private.volume.0 \
qt6qmlimport-org.kde.plasma.private.volume.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
kf6-kirigami-imports \
kirigami-addons6 \
ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6CoreAddons.so.6 \
libKF6DBusAddons.so.6 \
libKF6GlobalAccel.so.6 \
libKF6I18n.so.6 \
libKF6KCMUtilsCore.so.6 \
libKF6KCMUtilsQuick.so.6 \
libKF6PulseAudioQt.so.5 \
libKF6StatusNotifierItem.so.6 \
libPlasma.so.7 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libcanberra.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libm.so.6 \
libpulse.so.0 \
libstdc++.so.6 \
qt6qmlimport-org.kde.kitemmodels"

inherit rpm
