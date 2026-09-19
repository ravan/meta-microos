SUMMARY = "A backend implementation for xdg-desktop-portal"
DESCRIPTION = "A backend implementation for xdg-desktop-portal for the GNOME \
desktop environment."
LICENSE = "LGPL-2.1-or-later"

PV = "50.0"

RPM_NAME = "xdg-desktop-portal-gnome-50.0-1.3.aarch64.rpm"
RPM_HASH = "5c9bf395fc20e843b6a75805e5026d92e8e9665d1540b28b825f9497b598da18b4b437dabb7579e85b21fe4cc5f8b64da052f6c34bff8b896659cd511ff4ca71"

RPROVIDES:${PN} += "xdg-desktop-portal-gnome"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libadwaita-1.so.0 \
libc.so.6 \
libcairo.so.2 \
libfontconfig.so.1 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgnome-bg-4.so.2 \
libgnome-desktop-4.so.2 \
libgobject-2.0.so.0 \
libgraphene-1.0.so.0 \
libgtk-4.so.1 \
libwayland-client.so.0 \
xdg-desktop-portal"

inherit rpm
