SUMMARY = "Notification Daemon"
DESCRIPTION = "D-BUS notification daemon."
LICENSE = "GPL-2.0-or-later"

PV = "3.20.0"

RPM_NAME = "notification-daemon-3.20.0-8.7.aarch64.rpm"
RPM_HASH = "74d777d36fe3a31fd5229eed4dfbc10067db6255b2385396c1efa24b42ec8f8bb03810c30b1e1cb00424549301efdb5592cb4a14c5fdb0ffe16d8e07310f1e6b"

RPROVIDES:${PN} += "dbus-org.freedesktop.Notifications \
notification-daemon"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo-gobject.so.2 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libharfbuzz.so.0 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libz.so.1"

inherit rpm
