SUMMARY = "A lightweight lyrics overlay for Wayland compositors"
DESCRIPTION = "A lightweight lyrics overlay for Wayland compositors that displays \
synchronized lyrics for currently playing music."
LICENSE = "GPL-3.0-or-later"

PV = "0.10.0"

RPM_NAME = "wshowlyrics-0.10.0-1.2.aarch64.rpm"
RPM_HASH = "31b844d25693420d1745f3fec78f43b6fa097f7d7ace263d9711942af4ab78b5b699c603530b487ca7630afb23870bd858373a14d83c2d86b9eb29a08854b237"

RPROVIDES:${PN} += "config-wshowlyrics \
wshowlyrics"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libappindicator3.so.1 \
libc.so.6 \
libcairo.so.2 \
libcrypto.so.3 \
libcurl.so.4 \
libfontconfig.so.1 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libjson-c.so.5 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libwayland-client.so.0"

inherit rpm
