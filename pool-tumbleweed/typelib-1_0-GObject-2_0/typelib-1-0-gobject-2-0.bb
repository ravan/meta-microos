SUMMARY = "Object-Oriented Framework for C"
DESCRIPTION = "GLib is a general-purpose utility library, which provides many useful \
data types, macros, type conversions, string utilities, file utilities, \
a main loop abstraction, and so on. \
 \
The GObject library provides an object-oriented framework for C."
LICENSE = "LGPL-2.1-or-later"

PV = "2.88.3"

RPM_NAME = "typelib-1_0-GObject-2_0-2.88.3-1.1.aarch64.rpm"
RPM_HASH = "bfcc9942a790ba7220dceec9a11504448179e96b826aaa09673a3b4da968a27649533dde23078686efa4b367aa7b900644202b715926c60c9aa8ccc9d8c1145b"

RPROVIDES:${PN} += "typelib-1-0-GObject-2-0 \
typelib-GObject"

RDEPENDS:${PN} += "libgobject-2.0.so.0 \
typelib-GLib"

inherit rpm
