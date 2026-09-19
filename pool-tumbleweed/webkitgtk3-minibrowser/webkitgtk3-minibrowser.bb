SUMMARY = "MiniBrowser from WebKit"
DESCRIPTION = "A small test browswer from webkit, useful for testing features."
LICENSE = "BSD-3-Clause & LGPL-2.0-or-later"

PV = "2.52.6"

RPM_NAME = "webkitgtk3-minibrowser-2.52.6-1.2.aarch64.rpm"
RPM_HASH = "f53fd09de89204806fb7d58fc818da87c03c60f811942a8541959218d84b11dec181231c0aa6f28c2fe6e7770cf770ec309e79adab5d2a83b9cd43766dd00777"

RPROVIDES:${PN} += "webkitgtk3-minibrowser"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstreamer-1.0.so.0 \
libgtk-3.so.0 \
libjavascriptcoregtk-4.1.so.0 \
libwebkit2gtk-4.1.so.0"

inherit rpm
