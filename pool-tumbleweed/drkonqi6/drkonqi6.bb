SUMMARY = "Helper for debugging and reporting crashes"
DESCRIPTION = "The KDE Crash Handler gives the user feedback if a program has crashed."
LICENSE = "GPL-2.0-or-later"

PV = "6.7.5"

RPM_NAME = "drkonqi6-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "5269fd2c5f82ba7e0c1c5fd40e3b5c82a2f13795cafc9d7067be8d7a8c6db9715916306efefd7dfe5d4434519d33e8d27cf2500e114fdfd1f9b535e362a37b39"

RPROVIDES:${PN} += "drkonqi5 \
drkonqi6"

RDEPENDS:${PN} += "/usr/bin/sh \
konsole \
ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6I18n.so.6 \
libKF6IdleTime.so.6 \
libKF6KIOCore.so.6 \
libKF6KIOGui.so.6 \
libKF6Notifications.so.6 \
libKF6Service.so.6 \
libKF6StatusNotifierItem.so.6 \
libKF6SyntaxHighlighting.so.6 \
libKF6Wallet.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6WindowSystem.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Qml.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libpolkit-qt6-core-1.so.1 \
libstdc++.so.6 \
libsystemd.so.0 \
python3-psutil"

inherit rpm
