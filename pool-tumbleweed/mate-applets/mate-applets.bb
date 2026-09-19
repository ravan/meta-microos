SUMMARY = "A set of applets for the MATE Desktop"
DESCRIPTION = "This package provides a set of applets to use with the MATE panel."
LICENSE = "GFDL-1.1-only & GPL-2.0-or-later"

PV = "1.28.0"

RPM_NAME = "mate-applets-1.28.0-1.11.aarch64.rpm"
RPM_HASH = "1f8316fddcb46f66e0cb8ba3393c3764531b0695a0777278d6e70700d9afed3b0ebc125ddff02806ca90b076b0f3bc045dfa8115cf4ec41e67c7d5ffba467364"

RPROVIDES:${PN} += "config-mate-applets \
mate-applet-netspeed \
mate-applets \
mate-netspeed"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgtop-2.0.so.11 \
libgucharmap-2-90.so.7 \
libm.so.6 \
libmate-desktop-2.so.17 \
libmate-panel-applet-4.so.1 \
libmateweather.so.1 \
libnl-3.so.200 \
libnl-genl-3.so.200 \
libnotify.so.4 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libupower-glib.so.3 \
libwnck-3.so.0 \
libxml2.so.16"

inherit rpm
