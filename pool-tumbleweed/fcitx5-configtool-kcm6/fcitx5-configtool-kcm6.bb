SUMMARY = "Configuration module for fcitx5"
DESCRIPTION = "Configuration module for fcitx5"
LICENSE = "GPL-2.0-or-later"

PV = "5.1.12"

RPM_NAME = "fcitx5-configtool-kcm6-5.1.12-1.5.aarch64.rpm"
RPM_HASH = "be849c56b92c7daa820d1e903224b8a362790dc944c80dd8be083bc17c51736616a73eec743d29a2c0e31d84af23c2ba9f528bb887870f3f1a8efada6d557a37"

RPROVIDES:${PN} += "fcitx5-configtool-kcm6 \
kcm5-fcitx \
kf5-kcm-fcitx \
kf5-kcm-fcitx-icons"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libFcitx5Config.so.6 \
libFcitx5Qt6DBusAddons.so.1 \
libFcitx5Utils.so.2 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKF6KCMUtilsCore.so.6 \
libKF6KCMUtilsQuick.so.6 \
libKF6Svg.so.6 \
libPlasma.so.7 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libxkbcommon.so.0"

inherit rpm
