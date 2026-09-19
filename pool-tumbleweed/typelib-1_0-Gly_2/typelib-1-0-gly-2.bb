SUMMARY = "Introspection bindings for libglycin"
DESCRIPTION = "Sandboxed and extendable image decoding. \
 \
This package provides introspection bindings for libglycin"
LICENSE = "LGPL-2.1-or-later | MPL-2.0"

PV = "2.1.5"

RPM_NAME = "typelib-1_0-Gly_2-2.1.5-1.3.aarch64.rpm"
RPM_HASH = "273eed10da859e69278d5764f6d46ea635fce631a4097e65fc5ee03297337a6c749dc183649cd15cd1cc945eaa9e00219f9e8ca52eb24b55b4c17c0f275e0839"

RPROVIDES:${PN} += "typelib-1-0-Gly-2 \
typelib-Gly"

RDEPENDS:${PN} += "libglycin-2.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio"

inherit rpm
