SUMMARY = "Introspection bindings for libical"
DESCRIPTION = "This package provides the gobject-introspection bindings for libical."
LICENSE = "LGPL-2.1-only | MPL-2.0"

PV = "3.0.20"

RPM_NAME = "typelib-1_0-ICal-3_0-3.0.20-1.8.aarch64.rpm"
RPM_HASH = "fa69f583da2a6af95dc0222008f468e78553b26dfd4ad4a35596bee69d9ba260cf18f539b1af2de9c0c8fd5783cb7398ab50046a9b6f3b6503c6727973481998"

RPROVIDES:${PN} += "typelib-1-0-ICal-3-0 \
typelib-ICal"

RDEPENDS:${PN} += "libical.so.3 \
typelib-GLib \
typelib-GObject"

inherit rpm
