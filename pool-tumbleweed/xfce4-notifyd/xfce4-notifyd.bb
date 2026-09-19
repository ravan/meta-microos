SUMMARY = "Simple Notification Daemon for Xfce"
DESCRIPTION = "Xfce4-notifyd is a simple, visually-appealing notification daemon for Xfce that \
implements the Freedesktop.org Desktop Notifications Specification."
LICENSE = "GPL-2.0-only"

PV = "0.9.7"

RPM_NAME = "xfce4-notifyd-0.9.7-1.7.aarch64.rpm"
RPM_HASH = "907aa20bfb75ecf304e22246ed993d3f8e2b60da5fa9f923d77af118649181812fe8eb9068f57a071dce1dd672da9c7bbd56a299f89cef0944deace1d8f9f9ee"

RPROVIDES:${PN} += "config-xfce4-notifyd \
libnotification-plugin.so \
notification-daemon-xfce \
xfce4-notifyd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo.so.2 \
libcanberra-gtk3.so.0 \
libcanberra.so.0 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgtk-layer-shell.so.0 \
libnotify-tools \
libnotify.so.4 \
libsqlite3.so.0 \
libxfce4panel-2.0.so.4 \
libxfce4ui-2.so.0 \
libxfce4util.so.7 \
libxfconf-0.so.3 \
xfce4-notifyd-branding"

inherit rpm
