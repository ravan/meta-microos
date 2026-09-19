SUMMARY = "GNU Data Access (GDA) Library -- Introspection bindings"
DESCRIPTION = "GNU Data Access (GDA) is an attempt to provide uniform access to \
different kinds of data sources (databases, information servers, \
mail spools, etc). It is a complete architecture that provides \
everything needed to access data. \
 \
This package provides the GObject Introspection bindings for \
libgda."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "6.0.0"

RPM_NAME = "typelib-1_0-Gda-6_0-6.0.0-11.5.aarch64.rpm"
RPM_HASH = "c8d28b949973ad453dac4c492efa8e84101af8d88913e45430c0b0ed94b125c76dff0c449f4789b732ec7398051d385be395824d70227c9e13dd06b0cb51b0fe"

RPROVIDES:${PN} += "typelib-1-0-Gda-6-0 \
typelib-Gda"

RDEPENDS:${PN} += "libgda-6.0.so.6.0.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio \
typelib-libxml2"

inherit rpm
