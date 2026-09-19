SUMMARY = "Library for rendering XPS documents -- Introspection bindings"
DESCRIPTION = "libgxps is a GObject based library for handling and rendering XPS \
documents. \
 \
This package provides the GObject Introspection bindings for libgxps."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.2+5"

RPM_NAME = "typelib-1_0-GXPS-0_1-0.3.2+5-1.13.aarch64.rpm"
RPM_HASH = "683ded487223074192c9244c30e7b961ff7d309ef2627e59525bdd121c74e81eec61c7ad27630355510dff8171b126eb3b7d065838c166cfa15c567f84f58705"

RPROVIDES:${PN} += "typelib-1-0-GXPS-0-1 \
typelib-GXPS"

RDEPENDS:${PN} += "libgxps.so.2 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio \
typelib-cairo"

inherit rpm
