SUMMARY = "Notification daemon for MATE"
DESCRIPTION = "D-Bus notification daemon for MATE."
LICENSE = "GPL-2.0-or-later"

PV = "1.28.0"

RPM_NAME = "mate-notification-daemon-1.28.0-1.12.aarch64.rpm"
RPM_HASH = "f38f61f3f247a6d0519db0a26c09d8ba907b571c5bea8b555f47b6adbf93b98e5af0b08cbc87a99f3fe2f11070cab12e9483c7a5cfd83a6ceb232bfc10c6f853"

RPROVIDES:${PN} += "config-mate-notification-daemon \
dbus-org.freedesktop.Notifications \
libcoco.so \
libnodoka.so \
libslider.so \
libstandard.so \
mate-notification-daemon"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo.so.2 \
libcanberra-gtk3.so.0 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libmate-desktop-2.so.17 \
libmate-panel-applet-4.so.1 \
libnotify.so.4 \
libwnck-3.so.0 \
libxml2.so.16"

inherit rpm
