SUMMARY = "Introspection bindings for the AppStream abstraction library"
DESCRIPTION = "This library provides GObjects and helper methods to read and write \
AppStream metadata. It also provides a DOM implementation to edit \
nodes and convert to and from the standardized XML representation."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.4"

RPM_NAME = "typelib-1_0-AppStreamGlib-1_0-0.8.4-1.1.aarch64.rpm"
RPM_HASH = "cd8fb8c9565dac7586acb2d0a21d5c7935d20824d8411d89cc026bd1ac5442b187c9ae53bd6296afb778cf6cf142cc231e2331f08411cc39c0c2c5e2f680aa3b"

RPROVIDES:${PN} += "typelib-1-0-AppStreamGlib-1-0 \
typelib-AppStreamGlib"

RDEPENDS:${PN} += "libappstream-glib.so.8 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-GdkPixbuf \
typelib-Gio"

inherit rpm
