SUMMARY = "Pidgin plugin for notifications using libnotify"
DESCRIPTION = "Provides an interface to libnotify for Pidgin notifications."
LICENSE = "GPL-3.0+"

PV = "0.14"

RPM_NAME = "pidgin-plugin-libnotify-0.14-2.8.aarch64.rpm"
RPM_HASH = "c1c050945ef81a92cc8ceb751d3d0a79bacf1e40b77c9c285a1f304ffcd4459c21cf1c754d29ff487424608c70113bb61c2dd861f7276d420bdc9c47f3eff08e"

RPROVIDES:${PN} += "pidgin-libnotify \
pidgin-plugin-libnotify"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libnotify.so.4 \
pidgin"

inherit rpm
