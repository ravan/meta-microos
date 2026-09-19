SUMMARY = "Introspection bindings for the malcontent system library"
DESCRIPTION = "Libmalcontent implements parental controls support which can be \
used by applications to filter or limit the access of child \
accounts to inappropriate content."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.13.1"

RPM_NAME = "typelib-1_0-Malcontent-0-0.13.1-1.6.aarch64.rpm"
RPM_HASH = "b37bedcd82badbdb39a166b4eb991b3c1a60b09dcd04e91717ad3278190aa4aed6a7994cf3d49a6bcd8c137342231dbf14f5608584a733f16c8ea68749a0f27b"

RPROVIDES:${PN} += "typelib-1-0-Malcontent-0 \
typelib-Malcontent"

RDEPENDS:${PN} += "libmalcontent-0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio"

inherit rpm
