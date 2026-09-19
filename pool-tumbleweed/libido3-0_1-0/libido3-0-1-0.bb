SUMMARY = "Shared library providing extra GTK+ menu items in system indicators"
DESCRIPTION = "Shared library providing extra GTK+ menu items for display in \
system indicators. \
 \
This package contains shared libraries."
LICENSE = "GPL-3.0-only & LGPL-3.0-only & LGPL-2.1-only"

PV = "13.10.0+bzr20161028"

RPM_NAME = "libido3-0_1-0-13.10.0+bzr20161028-4.10.aarch64.rpm"
RPM_HASH = "4be3ebf9387c480e0063fce02ac5113e10ecd774f378bf865129647f6a8481ec246e2247bb1dccadcee92a5fb22b9a8e291c6b8e81e0bdbba4dde38dcfbfee82"

RPROVIDES:${PN} += "libido3-0-1-0 \
libido3-0.1.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0"

inherit rpm
