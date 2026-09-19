SUMMARY = "HTTP client/server library for GNOME -- Introspection bindings"
DESCRIPTION = "Libsoup is an HTTP client/server library for GNOME. It uses GObjects \
and the glib main loop, to integrate well with GNOME applications. \
 \
This package provides the GObject Introspection bindings for libsoup."
LICENSE = "LGPL-2.1-or-later"

PV = "3.6.6"

RPM_NAME = "typelib-1_0-Soup-3_0-3.6.6-8.1.aarch64.rpm"
RPM_HASH = "d971a65ae0c798c47d2e061afd848b776cdb8ce6c6690c88a09b2e634fa9dcc3b8db1c5f79183e66ee2b0db4d99a9999f6557fc42b82c76551fd2248698b99a7"

RPROVIDES:${PN} += "typelib-1-0-Soup-3-0 \
typelib-Soup"

RDEPENDS:${PN} += "libsoup-3.0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio"

inherit rpm
