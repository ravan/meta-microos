SUMMARY = "Introspection bindings for gck, a GObject library to access PKCS#11 modules"
DESCRIPTION = "GCK is a library for accessing PKCS#11 modules like smart cards, in a \
(G)object oriented way. \
 \
This package provides the GObject Introspection bindings for GCK."
LICENSE = "LGPL-2.1-or-later"

PV = "3.41.2"

RPM_NAME = "typelib-1_0-Gck-1-3.41.2-5.4.aarch64.rpm"
RPM_HASH = "9b12d57e6cf81c68346146350d22de1d449ccc6a1c75a6fd782f7ef669cd53114d09ccdb6d8e841ba8cfca55de7525ccd047084e5f1715f1102d177fc868cca7"

RPROVIDES:${PN} += "typelib-1-0-Gck-1 \
typelib-Gck"

RDEPENDS:${PN} += "libgck-1.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio"

inherit rpm
