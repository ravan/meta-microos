SUMMARY = "A sddm control module for KDE"
DESCRIPTION = "SDDM control module for Plasma. It provides a graphical frontend for the SDDM."
LICENSE = "GPL-2.0-only"

PV = "6.7.5"

RPM_NAME = "sddm-kcm6-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "49d90008ed746d6954169c9f946e26d933ee5cea218efd469ba9311c68af8750a020c9a32fad6765d17d185b0c5527bfed857b53b0c27df85e8fb1ae353379dc"

RPROVIDES:${PN} += "kcm-sddm \
sddm-kcm6"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6Archive.so.6 \
libKF6AuthCore.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKF6KCMUtilsCore.so.6 \
libKF6KCMUtilsQuick.so.6 \
libKF6KIOGui.so.6 \
libKF6Service.so.6 \
libKF6WidgetsAddons.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
