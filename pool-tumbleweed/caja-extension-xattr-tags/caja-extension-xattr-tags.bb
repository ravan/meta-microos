SUMMARY = "See tags stored on xattrs"
DESCRIPTION = "Caja-xattr-tags allows one to see tags stored on xattrs."
LICENSE = "GPL-2.0-or-later"

PV = "1.28.0"

RPM_NAME = "caja-extension-xattr-tags-1.28.0-2.11.aarch64.rpm"
RPM_HASH = "9829b5f406b365b96b551e599c27ba6712079506a0c3b8b109171ffc8189cd1847c69629110be3601dd3e3de4a07f2fc7cded1ecf3a89f5d74b54577d462b5ef"

RPROVIDES:${PN} += "caja-extension-xattr-tags \
libcaja-xattr-tags.so"

RDEPENDS:${PN} += "caja \
libc.so.6 \
libcaja-extension.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
