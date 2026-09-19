SUMMARY = "Object-Oriented Framework for C"
DESCRIPTION = "GLib is a general-purpose utility library, which provides many useful \
data types, macros, type conversions, string utilities, file utilities, \
a main loop abstraction, and so on. \
 \
The GObject library provides an object-oriented framework for C."
LICENSE = "LGPL-2.1-or-later"

PV = "2.88.3"

RPM_NAME = "libgirepository-2_0-0-2.88.3-1.1.aarch64.rpm"
RPM_HASH = "5054b2eb832f4714388c4c76c8c3f4ca88f208ccdf55f8fbd36470197fff7c2f38097ee12aa8d8f082fad89881236efa4a6a5857406b02ba0a81675dcaeb9259"

RPROVIDES:${PN} += "libgirepository-2-0-0 \
libgirepository-2.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libffi.so.8 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libm.so.6"

inherit rpm
