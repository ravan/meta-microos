SUMMARY = "A window switcher, run dialog and dmenu replacement"
DESCRIPTION = "This is a fork of rofi with added support for Wayland via the layer shell protocol."
LICENSE = "MIT"

PV = "1.7.9+wayland1+git.1757683229.9b0363ca"

RPM_NAME = "rofi-wayland-1.7.9+wayland1+git.1757683229.9b0363ca-1.6.aarch64.rpm"
RPM_HASH = "666c818b2677d353360615197856c979a8e9103f8bb647354784d944f82ac82340d4fd917e8245f96368ce5fd2b1011c734693315a3791821d0dfb1d2e816c2f"

RPROVIDES:${PN} += "rofi-launcher \
rofi-wayland"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libwayland-client.so.0 \
libwayland-cursor.so.0 \
libxkbcommon.so.0"

inherit rpm
