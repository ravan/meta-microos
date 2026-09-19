SUMMARY = "Tumbler Library"
DESCRIPTION = "This package provides the shared library component of tumbler."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "4.20.2"

RPM_NAME = "libtumbler-1-0-4.20.2-1.1.aarch64.rpm"
RPM_HASH = "1fd6df0dd67a0fd1274798cb568d3917f1130026a84db16b0f32a65f10509c0c061c82f0bb6bb21460c604476ebd80b49c5ab490e8434b169e31d35f2cc557c4"

RPROVIDES:${PN} += "libtumbler-1-0 \
libtumbler-1.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libxfce4util.so.7"

inherit rpm
