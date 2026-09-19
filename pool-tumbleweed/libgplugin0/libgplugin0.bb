SUMMARY = "Library of gplugin"
DESCRIPTION = "Library of gplugin."
LICENSE = "LGPL-2.0-or-later"

PV = "0.44.2"

RPM_NAME = "libgplugin0-0.44.2-2.4.aarch64.rpm"
RPM_HASH = "fc6d209d7b92a945f235ebba3b1403627936961ddc5851ee106ee45eedbe2264d6e1a8095c5120437629f5d69c6e10265b257c41f96a92ee7948fbef7a1f1cda"

RPROVIDES:${PN} += "libgplugin.so.0 \
libgplugin0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
