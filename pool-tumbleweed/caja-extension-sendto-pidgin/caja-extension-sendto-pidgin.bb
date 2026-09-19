SUMMARY = "Pidgin integration for the Caja file manager"
DESCRIPTION = "This package provides Pidgin integration to the Caja file manager."
LICENSE = "GPL-2.0-or-later"

PV = "1.28.0"

RPM_NAME = "caja-extension-sendto-pidgin-1.28.0-2.11.aarch64.rpm"
RPM_HASH = "713cc66efa34bbf3c0be0f3c33a5bc7c25c21b464dc830779e6ce9760d211e22fa627f15d6785c8690bd2e31f47610e0191e6b91f7ea17013f4c4d5879eb2d36"

RPROVIDES:${PN} += "caja-extension-sendto-pidgin \
caja-sendto-pidgin \
libnstpidgin.so \
mate-file-manager-sendto-pidgin"

RDEPENDS:${PN} += "caja-extension-sendto \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-glib-1.so.2 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
pidgin"

inherit rpm
