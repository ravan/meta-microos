SUMMARY = "Flatpak Permissions Management KCM"
DESCRIPTION = "The KCM allows changing what permissions have been granted to installed Flatpak applications."
LICENSE = "GPL-2.0-or-later"

PV = "6.7.5"

RPM_NAME = "flatpak-kcm6-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "09181c34fb592fd3ad9b58bc64fd05821c21fd304f620215f5f1382b2fef4cb9d56e0fd86a8806c9adb2dd39b0961b31e06e65273dfb4f144984f57c64790d1c"

RPROVIDES:${PN} += "flatpak-kcm6 \
kcm-flatpak"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKF6KCMUtilsCore.so.6 \
libKF6KCMUtilsQuick.so.6 \
libKF6Service.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libflatpak.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libstdc++.so.6 \
systemsettings6"

inherit rpm
