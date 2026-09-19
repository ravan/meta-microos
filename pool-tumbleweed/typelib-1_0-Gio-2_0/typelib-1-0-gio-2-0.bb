SUMMARY = "Object-Oriented Framework for C"
DESCRIPTION = "GLib is a general-purpose utility library, which provides many useful \
data types, macros, type conversions, string utilities, file utilities, \
a main loop abstraction, and so on. \
 \
The GObject library provides an object-oriented framework for C."
LICENSE = "LGPL-2.1-or-later"

PV = "2.88.3"

RPM_NAME = "typelib-1_0-Gio-2_0-2.88.3-1.1.aarch64.rpm"
RPM_HASH = "dbd312a9f42629c109c65795fc3eda66a118a52ce07555d6fd87815340228b58530ca5d28aa2a8ecc02aaaa87973145fd54f464858311e1417a11d1e77c4f371"

RPROVIDES:${PN} += "typelib-1-0-Gio-2-0 \
typelib-1-0-GioUnix-2-0 \
typelib-Gio \
typelib-GioUnix"

RDEPENDS:${PN} += "libgio-2.0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject"

inherit rpm
