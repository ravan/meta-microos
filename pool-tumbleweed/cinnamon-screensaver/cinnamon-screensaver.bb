SUMMARY = "Cinnamon screensaver and locker"
DESCRIPTION = "cinnamon-screensaver is a screensaver and locker that aims to have \
simple, sane and secure defaults, and be well integrated with the \
Cinnamon Desktop."
LICENSE = "GPL-2.0-or-later"

PV = "6.6.1"

RPM_NAME = "cinnamon-screensaver-6.6.1-1.4.aarch64.rpm"
RPM_HASH = "71aaf7e73850207b0653fc4b204689ce9cc9f88d0bb0e17d0896fe5f521541735ec0a5a58ad64229d14a37cb8e840f9a81ba7dccb29cdeff0302d36d0136bc57"

RPROVIDES:${PN} += "cinnamon-screensaver \
libcscreensaver.so"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
iso-country-flags-png \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libXinerama.so.1 \
libXrandr.so.2 \
libc.so.6 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpam.so.0 \
libpango-1.0.so.0 \
libxdo.so.4 \
python3-cairo \
python3-gobject \
python3-gobject-Gdk \
python3-gobject-cairo \
python3-setproctitle \
python3-xapp \
typelib-CDesktopEnums \
typelib-CScreensaver \
typelib-Caribou \
typelib-CinnamonDesktop \
typelib-Cvc \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-GdkX11 \
typelib-Gio \
typelib-Gtk \
typelib-Pango"

inherit rpm
