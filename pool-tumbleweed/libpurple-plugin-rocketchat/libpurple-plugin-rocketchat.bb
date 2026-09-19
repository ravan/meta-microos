SUMMARY = "RocketChat protocol plugin for libpurple"
DESCRIPTION = "RocketChat protocol plugin for libpurple-based applications."
LICENSE = "GPL-2.0-or-later"

PV = "20260223"

RPM_NAME = "libpurple-plugin-rocketchat-20260223-1.3.aarch64.rpm"
RPM_HASH = "63c0d291997f96b462e78d920bf46f7d65bb47f544c8a7be3fe0cb5a9fab2a5925c0cdde2c6d4e1d8f681dbc0d737d0690ba57fbb82f6304001883ee943fe928"

RPROVIDES:${PN} += "libpurple-plugin-rocketchat \
librocketchat.so"

RDEPENDS:${PN} += "libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libjson-glib-1.0.so.0 \
libpurple.so.0"

inherit rpm
