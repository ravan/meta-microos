SUMMARY = "Plasma frontend for Thunderbolt 3 security levels"
DESCRIPTION = "This is a frontend for configuring security levels of Thunderbolt 3 devices."
LICENSE = "GPL-2.0-or-later"

PV = "6.7.5"

RPM_NAME = "plasma6-thunderbolt-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "120ee02a00bb5bc49bd98f7cc4b237e71d539857389e0b23c7fc5446b6563774cde9447eb588fac3aa01f1ebe80f85a669e5ab1b2068022e69af7050e40e8234"

RPROVIDES:${PN} += "libkbolt.so \
plasma5-thunderbolt \
plasma6-thunderbolt"

RDEPENDS:${PN} += "bolt \
kf6-kdeclarative-imports \
kf6-kded \
kf6-kirigami-imports \
ld-linux-aarch64.so.1 \
libKF6CoreAddons.so.6 \
libKF6DBusAddons.so.6 \
libKF6I18n.so.6 \
libKF6KCMUtilsCore.so.6 \
libKF6KCMUtilsQuick.so.6 \
libKF6Notifications.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
qt6-declarative-imports"

inherit rpm
