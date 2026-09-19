SUMMARY = "Config Module for the System Firewall"
DESCRIPTION = "Config Module for the System Firewall"
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "6.7.5"

RPM_NAME = "plasma6-firewall-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "b8510d2fcaa4d5497e714428a8c1eaf5a5f319b96cdab437816eada4f7f24b0fb9c59423a1445e5c81c01269f6997aa87bf0f213ab831b18fdb26eac51ea128b"

RPROVIDES:${PN} += "libkcm-firewall-core.so \
plasma5-firewall \
plasma6-firewall"

RDEPENDS:${PN} += "firewalld \
kf6-kirigami-imports \
kf6-kitemmodels-imports \
ld-linux-aarch64.so.1 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKF6KCMUtilsCore.so.6 \
libKF6KCMUtilsQuick.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
