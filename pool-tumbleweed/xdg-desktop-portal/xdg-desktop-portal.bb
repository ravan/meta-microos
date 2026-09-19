SUMMARY = "A portal frontend service for Flatpak"
DESCRIPTION = "A portal frontend service for Flatpak and possibly other desktop containment frameworks. \
 \
xdg-desktop-portal works by exposing a series of D-Bus interfaces known as portals under \
a well-known name (org.freedesktop.portal.Desktop) and object path (/org/freedesktop/portal/desktop). \
 \
The portal interfaces include APIs for file access, opening URIs, printing and others."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.1"

RPM_NAME = "xdg-desktop-portal-1.22.1-1.2.aarch64.rpm"
RPM_HASH = "b47a118db0219d70d9c27ad1f21a047ffcb31932c8b83860271dd04021a7ef596a41f89a7d4ed82f2a2e9b8bac1bb178bcccbeecdbe085115f1a4189e4a0b938"

RPROVIDES:${PN} += "xdg-desktop-portal"

RDEPENDS:${PN} += "/usr/bin/fusermount3 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfuse3.so.4 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstpbutils-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgudev-1.0.so.0 \
libjson-glib-1.0.so.0 \
libpipewire-0.3.so.0 \
libsystemd.so.0"

inherit rpm
