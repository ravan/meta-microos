SUMMARY = "Object-Oriented Framework for C"
DESCRIPTION = "GLib is a general-purpose utility library, which provides many useful \
data types, macros, type conversions, string utilities, file utilities, \
a main loop abstraction, and so on. \
 \
The GObject library provides an object-oriented framework for C."
LICENSE = "LGPL-2.1-or-later"

PV = "2.88.3"

RPM_NAME = "libgobject-2_0-0-2.88.3-1.1.aarch64.rpm"
RPM_HASH = "b8781d387addf8898ec760aab6c25c8a81546caa606f2242bd409d098549dca91c6f27261ea46b984afa6725d63c11017da2c9059d69d7928733c49d6c20ef6b"

RPROVIDES:${PN} += "libgobject-2-0-0 \
libgobject-2.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libffi.so.8 \
libglib-2.0.so.0"

inherit rpm
