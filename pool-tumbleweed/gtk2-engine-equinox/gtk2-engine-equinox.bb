SUMMARY = "Equinox GTK+ Theme Engine"
DESCRIPTION = "Equinox is a theme engine for GTK+. It is a heavily modified derivative \
of the Aurora engine (version 1.40)."
LICENSE = "GPL-2.0-or-later"

PV = "1.50"

RPM_NAME = "gtk2-engine-equinox-1.50-11.8.aarch64.rpm"
RPM_HASH = "446d8636ba7c8d0a07ec74f68a8604f776897d51b654822213f1a4dca667ae52fc8d404b8a670f4b01297f0b6efa49997362e973b4e15b203d0175c80132e236"

RPROVIDES:${PN} += "gtk2-engine-equinox \
libequinox.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libpangocairo-1.0.so.0"

inherit rpm
