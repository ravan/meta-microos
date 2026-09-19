SUMMARY = "Screensaver and locker for Xfce"
DESCRIPTION = "xfce4-screensaver is a screen saver and locker that integrates with the Xfce desktop. \
This software is not ready for production machines yet. Please use with caution. \
 \
Add xfce4-screensaver-command -l to xflock4 script for it to work properly."
LICENSE = "GPL-2.0-only"

PV = "4.20.2"

RPM_NAME = "xfce4-screensaver-4.20.2-1.4.aarch64.rpm"
RPM_HASH = "4e1eddfb59a2c3771bd5312bb37ff296942b77a234e0cecd1a7ce236051731cb2361a4cacc10075d81771ff9f93bbe627e7be4006c71dd7f8135e9536a8b7081"

RPROVIDES:${PN} += "config-xfce4-screensaver \
xfce4-screensaver"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libXss.so.1 \
libc.so.6 \
libcairo.so.2 \
libdbus-1.so.3 \
libdbus-glib-1.so.2 \
libgarcon-1.so.0 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libpam.so.0 \
libpango-1.0.so.0 \
libsystemd.so.0 \
libwayland-client.so.0 \
libwlembed-0.so.0 \
libwlembed-gtk3-0.so.0 \
libwnck-3.so.0 \
libxfce4ui-2.so.0 \
libxfce4util.so.7 \
libxfce4windowing-0.so.0 \
libxfconf-0.so.3 \
libxklavier.so.16 \
xfconf"

inherit rpm
