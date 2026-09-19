SUMMARY = "Introspection bindings for the GObject Data Mapper"
DESCRIPTION = "This is a DataMapper for GObject. \
 \
This package provides the GObject Introspection bindings for gom."
LICENSE = "LGPL-2.1-or-later"

PV = "0.5.6"

RPM_NAME = "typelib-1_0-Gom-1_0-0.5.6-1.3.aarch64.rpm"
RPM_HASH = "63796fc48c6e5a69f85d23fda629eef9bb8c6150b3748bf7f81a8f65a1186d478ccf705ff98219ca37589e49de3274fed6cd1796011ce45947f50a5b4eca5579"

RPROVIDES:${PN} += "typelib-1-0-Gom-1-0 \
typelib-Gom"

RDEPENDS:${PN} += "libgom-1.0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio"

inherit rpm
