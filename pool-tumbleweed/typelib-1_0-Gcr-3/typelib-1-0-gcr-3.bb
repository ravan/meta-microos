SUMMARY = "Introspection bindings for gcr, a library for crypto UI related tasks"
DESCRIPTION = "GCR is a library for displaying certificates, and crypto UI, accessing \
key stores. \
 \
This package provides the GObject Introspection bindings for GCR."
LICENSE = "LGPL-2.1-or-later"

PV = "3.41.2"

RPM_NAME = "typelib-1_0-Gcr-3-3.41.2-5.4.aarch64.rpm"
RPM_HASH = "0ae49c02c6ccdddb3cfe435e9554f503db06ed4d0e9fc0328546998d092b38a52cb64c9b4dcae5ee4b66e5fc6f50b86da75d97b82848ca7fa7094f26ebdebdec"

RPROVIDES:${PN} += "typelib-1-0-Gcr-3 \
typelib-Gcr"

RDEPENDS:${PN} += "libgcr-base-3.so.1 \
typelib-1-0-Gck-1 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gck \
typelib-Gio"

inherit rpm
