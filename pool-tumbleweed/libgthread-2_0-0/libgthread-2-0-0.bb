SUMMARY = "Portable API from glib wrapping system threads"
DESCRIPTION = "GLib is a general-purpose utility library, which provides many useful \
data types, macros, type conversions, string utilities, file utilities, \
a main loop abstraction, and so on. \
 \
The libgthread library provides a portable way to write multi-threaded \
software."
LICENSE = "LGPL-2.1-or-later"

PV = "2.88.3"

RPM_NAME = "libgthread-2_0-0-2.88.3-1.1.aarch64.rpm"
RPM_HASH = "8416df8614276aabde933fe4a7522a676205d2b6b67b945baaf0767a38ff21503f0a7327a816a3d21ca41d39ebdd9c717936db928cf9aed103a0cb719d60ba9e"

RPROVIDES:${PN} += "libgthread-2-0-0 \
libgthread-2.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libglib-2.0.so.0"

inherit rpm
