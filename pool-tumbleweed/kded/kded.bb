SUMMARY = "Central daemon of KDE workspaces"
DESCRIPTION = "KDED runs in the background and performs a number of small tasks. \
Some of these tasks are built in, others are started on demand."
LICENSE = "LGPL-2.1-or-later"

PV = "5.116.0"

RPM_NAME = "kded-5.116.0-1.8.aarch64.rpm"
RPM_HASH = "65564b9a4fb73d1413efa9b9966a32705b7ef5a09f476fd125e143f2a137f198b59c361cd2a617e4491714f7535486a0d0643d203da3ab94dcc75e754ea8cd55"

RPROVIDES:${PN} += "kded"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5DBusAddons.so.5 \
libKF5Service.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
