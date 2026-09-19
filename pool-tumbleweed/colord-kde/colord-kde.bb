SUMMARY = "KDE interfaces and session daemon to colord"
DESCRIPTION = "Colord-kde provides KCM module and KDE daemon module for colord support."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "colord-kde-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "f5e21e429d4eb9eb82dab50e35f4398c929e20f2e45063ca0345e186aeccdf4c9de2d248a60cce9912e45c9ac205381f5e01735df95d5790f244ab00e018a9af"

RPROVIDES:${PN} += "colord-kde"

RDEPENDS:${PN} += "colord \
ld-linux-aarch64.so.1 \
libKF6CoreAddons.so.6 \
libKF6DBusAddons.so.6 \
libKF6I18n.so.6 \
libKF6KCMUtilsCore.so.6 \
libKF6KCMUtilsQuick.so.6 \
libKF6WidgetsAddons.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Widgets.so.6 \
libX11.so.6 \
libXrandr.so.2 \
libc.so.6 \
liblcms2.so.2 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
