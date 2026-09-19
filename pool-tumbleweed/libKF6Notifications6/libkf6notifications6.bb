SUMMARY = "KDE Desktop notifications"
DESCRIPTION = "KNotification is used to notify the user of an event. It covers feedback and \
persistent events."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "libKF6Notifications6-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "881a38aef2547ff74bf70920c06025576763ed58ad712b01e38787ebdc6dff386ddb5a70a30e46a0d96511496ec9297fbb1fa3a18ae56da814d492f047bcae54"

RPROVIDES:${PN} += "libKF6Notifications.so.6 \
libKF6Notifications6"

RDEPENDS:${PN} += "/sbin/ldconfig \
kf6-knotifications \
ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libcanberra.so.0 \
libstdc++.so.6"

inherit rpm
