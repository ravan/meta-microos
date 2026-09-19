SUMMARY = "Automatic archives creating and extracting library"
DESCRIPTION = "gnome-autoar provides functions, widgets, and gschemas for GNOME applications which want \
to use archives as a method to transfer directories over the Internet."
LICENSE = "LGPL-2.0-or-later"

PV = "0.4.5"

RPM_NAME = "libgnome-autoar-0-0-0.4.5-3.4.aarch64.rpm"
RPM_HASH = "a2b45f07bfa1a3a65fb84d3a584cac7efc5589fcff267294fc327fb232fba874e19f4a8c3b355d4a2ec4fe692f63e21e4a2c0037469d8a71dfe68470e7cb71d9"

RPROVIDES:${PN} += "libgnome-autoar-0-0 \
libgnome-autoar-0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libarchive.so.13 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
