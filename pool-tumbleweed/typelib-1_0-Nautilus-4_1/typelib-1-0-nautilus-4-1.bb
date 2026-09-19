SUMMARY = "File Manager for the GNOME Desktop -- Introspection bindings"
DESCRIPTION = "Nautilus is the file manager for the GNOME desktop. \
 \
This package provides the GObject Introspection bindings for the library \
used by nautilus extensions."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "50.3.1"

RPM_NAME = "typelib-1_0-Nautilus-4_1-50.3.1-1.1.aarch64.rpm"
RPM_HASH = "5395777adf980936d42e44d21e1577a345e3a6c8fe3bcbf2ab201762eea6f36ad6b724e78b998e5be5ded18e202e58731f21fe902c10f21dd8220912a3715780"

RPROVIDES:${PN} += "typelib-1-0-Nautilus-4-1 \
typelib-Nautilus"

RDEPENDS:${PN} += "libnautilus-extension.so.4 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio"

inherit rpm
