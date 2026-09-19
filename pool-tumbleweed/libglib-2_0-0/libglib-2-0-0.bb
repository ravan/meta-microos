SUMMARY = "General-Purpose Utility Library"
DESCRIPTION = "GLib is a general-purpose utility library, which provides many useful \
data types, macros, type conversions, string utilities, file utilities, \
a main loop abstraction, and so on."
LICENSE = "LGPL-2.1-or-later"

PV = "2.88.3"

RPM_NAME = "libglib-2_0-0-2.88.3-1.1.aarch64.rpm"
RPM_HASH = "6e91c5a1d5138db96c03ba07154ff2cc77aa41e0be0b77c5896aebf036693bafa6edb32d3cdaca2e3d3ad1c73b104c3486b25cbdd94b5e3a76722c267640e8ba"

RPROVIDES:${PN} += "glib2 \
libglib-2-0-0 \
libglib-2.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcre2-8.so.0"

inherit rpm
