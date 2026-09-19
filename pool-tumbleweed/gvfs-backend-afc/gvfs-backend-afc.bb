SUMMARY = "VFS functionality for GLib -- iPod / iPhone Support"
DESCRIPTION = "This package provides a gvfs backend that supports iPod / iPhone devices."
LICENSE = "LGPL-2.0-or-later"

PV = "1.60.3"

RPM_NAME = "gvfs-backend-afc-1.60.3-1.1.aarch64.rpm"
RPM_HASH = "174755a83b912cf86f49433b079790483c09a156c0c7af80f8f60742822c03faa7e8dab708f5455a5dfdb90ff6261937828241f3a7c98d5ec19db0ddc25a8189"

RPROVIDES:${PN} += "gvfs-backend-afc"

RDEPENDS:${PN} += "gvfs \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgvfscommon.so \
libgvfsdaemon.so \
libimobiledevice-1.0.so.6 \
libplist-2.0.so.4"

inherit rpm
