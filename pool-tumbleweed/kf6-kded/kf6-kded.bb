SUMMARY = "Central daemon of KDE workspaces"
DESCRIPTION = "KDED runs in the background and performs a number of small tasks. \
Some of these tasks are built in, others are started on demand."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-kded-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "cac85dd8921994b666153b3f7cb0199884c693164080636a8fa38e45543c60968aba6820cc0b2c01ab687713f61e42231f7b463f503a8b289f184a651b452a9b"

RPROVIDES:${PN} += "kf6-kded"

RDEPENDS:${PN} += "/usr/bin/sh \
kconf-update6 \
ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6DBusAddons.so.6 \
libKF6Service.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
