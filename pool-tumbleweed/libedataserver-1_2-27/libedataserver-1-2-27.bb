SUMMARY = "Evolution Data Server's Utilities Library"
DESCRIPTION = "Evolution Data Server provides a central location for your address book \
and calendar in the GNOME Desktop. \
 \
This package contains a shared system library."
LICENSE = "LGPL-2.0-only"

PV = "3.60.2"

RPM_NAME = "libedataserver-1_2-27-3.60.2-3.1.aarch64.rpm"
RPM_HASH = "3bc827d8f716485098a20d3cfd99066d1ba4e03bf5f5506b27d61c8dca3939725b6af286ae4b9586fb05796073f1afbe9c73125b608d14324e984a6f979ec474"

RPROVIDES:${PN} += "libedataserver-1-2-27 \
libedataserver-1.2.so.27"

RDEPENDS:${PN} += "/sbin/ldconfig \
evolution-data-server \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcamel-1.2.so.67 \
libedbus-private.so \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libicui18n.so.78 \
libicuuc.so.78 \
libjson-glib-1.0.so.0 \
libsecret-1.so.0 \
libsoup-3.0.so.0 \
libstdc++.so.6 \
libuuid.so.1 \
libxml2.so.16"

inherit rpm
