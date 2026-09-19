SUMMARY = "GLib-based Instant Messenger Library"
DESCRIPTION = "libpurple is a library intended to be used by programmers seeking \
to write an IM client that connects to many IM networks. \
 \
This package provides the core libpurple client library."
LICENSE = "GPL-2.0-only"

PV = "2.14.14"

RPM_NAME = "libpurple-client0-2.14.14-2.3.aarch64.rpm"
RPM_HASH = "eb0d9a88656382e011b2169ee9d228142c56c335b0ab3fbb26058fa5d2212219d65b287dab4fdcd4d98a95841082afd9ffc0932c2c15f17c2d803dc0f18d08a0"

RPROVIDES:${PN} += "libpurple-client.so.0 \
libpurple-client0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libdbus-glib-1.so.2 \
libglib-2.0.so.0"

inherit rpm
