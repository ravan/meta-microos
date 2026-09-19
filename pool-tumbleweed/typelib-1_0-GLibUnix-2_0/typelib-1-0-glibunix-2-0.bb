SUMMARY = "Object-Oriented Framework for C"
DESCRIPTION = "GLib is a general-purpose utility library, which provides many useful \
data types, macros, type conversions, string utilities, file utilities, \
a main loop abstraction, and so on. \
 \
The GObject library provides an object-oriented framework for C."
LICENSE = "LGPL-2.1-or-later"

PV = "2.88.3"

RPM_NAME = "typelib-1_0-GLibUnix-2_0-2.88.3-1.1.aarch64.rpm"
RPM_HASH = "62c5a9fb7b36a4bdbfa9a5ccd5df2e41cb1d70f360677423f3faca9f16a28df1d67ea1cd564d88d52128ada404a40433b1c134cfd5b20290519abde30fb15f22"

RPROVIDES:${PN} += "typelib-1-0-GLibUnix-2-0 \
typelib-GLibUnix"

RDEPENDS:${PN} += "libglib-2.0.so.0 \
libgobject-2.0.so.0 \
typelib-GLib"

inherit rpm
