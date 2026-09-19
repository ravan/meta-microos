SUMMARY = "LightDM GObject-based Client Library"
DESCRIPTION = "A GObject-based library for LightDM clients to use to interface \
with LightDM."
LICENSE = "LGPL-2.0-only | LGPL-3.0-only"

PV = "1.32.0"

RPM_NAME = "liblightdm-gobject-1-0-1.32.0-9.4.aarch64.rpm"
RPM_HASH = "b31b5b2d94b23c9a0660a84f1738de20babdae9211918804728e37b477ec928f27ad9dc9a4b062456697c505f33a3cf889f9bddf62ef11e52e05554efd9d1ad0"

RPROVIDES:${PN} += "liblightdm-gobject-1-0 \
liblightdm-gobject-1.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libxklavier.so.16"

inherit rpm
