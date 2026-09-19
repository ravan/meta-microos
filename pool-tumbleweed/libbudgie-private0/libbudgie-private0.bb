SUMMARY = "Private library for Budgie"
DESCRIPTION = "Private library for Budgie desktop to link against."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "10.10.0+13"

RPM_NAME = "libbudgie-private0-10.10.0+13-1.2.aarch64.rpm"
RPM_HASH = "55be85c88a90d31509c049473c7f77f6e10d95329679b6002ef36bb06837c450530055ba761aee5811da25c423639a1d672d29c971d44231a511c40379c0a704"

RPROVIDES:${PN} += "libbudgie-private.so.0 \
libbudgie-private0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbudgie-plugin.so.0 \
libc.so.6 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6"

inherit rpm
