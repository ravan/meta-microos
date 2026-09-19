SUMMARY = "Introspection bindings for gcr, a library for crypto UI related tasks"
DESCRIPTION = "GCR is a library for displaying certificates, and crypto UI, accessing \
key stores. \
 \
This package provides the GObject Introspection bindings for GCR."
LICENSE = "LGPL-2.1-or-later"

PV = "4.4.0.1"

RPM_NAME = "typelib-1_0-Gcr-4-4.4.0.1-3.3.aarch64.rpm"
RPM_HASH = "8a554e563ec32d292e6cf2bb692ca6d6534b32c732fe7f80e2476a92333f8922955280c5d79a113ced90f7e9ac3a16200e7f563290e0ae15542de0a358b3fdb0"

RPROVIDES:${PN} += "typelib-1-0-Gcr-4 \
typelib-Gcr"

RDEPENDS:${PN} += "libgcr-4.so.4 \
typelib-1-0-Gck-2 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gck \
typelib-Gio"

inherit rpm
