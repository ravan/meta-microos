SUMMARY = "Introspection bindings for gck, a GObject library to access PKCS#11 modules"
DESCRIPTION = "GCK is a library for accessing PKCS#11 modules like smart cards, in a \
(G)object oriented way. \
 \
This package provides the GObject Introspection bindings for GCK."
LICENSE = "LGPL-2.1-or-later"

PV = "4.4.0.1"

RPM_NAME = "typelib-1_0-Gck-2-4.4.0.1-3.3.aarch64.rpm"
RPM_HASH = "a13c663ca547382832db5e059409082a5f9f8915f32f44f702a948d480a4367faeea74ba530b030e7736666332ae981738f6b8962aefe45e9d710b3f655c32f9"

RPROVIDES:${PN} += "typelib-1-0-Gck-2 \
typelib-Gck"

RDEPENDS:${PN} += "libgck-2.so.2 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio"

inherit rpm
