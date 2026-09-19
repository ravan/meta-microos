SUMMARY = "PolicyKit authentication agent for Plasma"
DESCRIPTION = "Provides Policy Kit Authentication Agent that nicely fits Plasma."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "6.7.5"

RPM_NAME = "polkit-kde-agent-6-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "1d058fba46f237ecd1c810089cafa313b61d40ea2a7d34b58facdb411769b593a4260434729f2913ffbd5fa89728bb7fe9c4b6c999249d5b82e5fad299d2ac11"

RPROVIDES:${PN} += "polkit-kde-agent-5 \
polkit-kde-agent-6"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6DBusAddons.so.6 \
libKF6I18n.so.6 \
libKF6I18nQml.so.6 \
libKF6Notifications.so.6 \
libKF6WindowSystem.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libpolkit-qt6-agent-1.so.1 \
libpolkit-qt6-core-1.so.1 \
libstdc++.so.6"

inherit rpm
