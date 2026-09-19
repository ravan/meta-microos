SUMMARY = "Object-Oriented Framework for C"
DESCRIPTION = "GLib is a general-purpose utility library, which provides many useful \
data types, macros, type conversions, string utilities, file utilities, \
a main loop abstraction, and so on. \
 \
The GObject library provides an object-oriented framework for C."
LICENSE = "LGPL-2.1-or-later"

PV = "2.88.3"

RPM_NAME = "typelib-1_0-GLib-2_0-2.88.3-1.1.aarch64.rpm"
RPM_HASH = "8b829f2338ba1cce5921a7f08f4cf21f5aa414e5d223bb27a036364a94095477b5b3c125228e591ddf978c35978ca6240f4be4c0b3353954e3a46459df070b75"

RPROVIDES:${PN} += "typelib-1-0-GLib-2-0 \
typelib-GLib"

RDEPENDS:${PN} += "libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
