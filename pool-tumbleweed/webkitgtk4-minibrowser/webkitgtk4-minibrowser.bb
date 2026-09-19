SUMMARY = "MiniBrowser from WebKit"
DESCRIPTION = "A small test browswer from webkit, useful for testing features."
LICENSE = "BSD-3-Clause & LGPL-2.0-or-later"

PV = "2.52.6"

RPM_NAME = "webkitgtk4-minibrowser-2.52.6-1.2.aarch64.rpm"
RPM_HASH = "0b56878e92de8a2ec87abf3394693c79427330de796a2306d1a8b080de4e2039ffad2402af8b861b6f06a124b7f05c14ff1d34eb211d42b60970938980945509"

RPROVIDES:${PN} += "webkitgtk4-minibrowser"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbacktrace.so.0 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstreamer-1.0.so.0 \
libgtk-4.so.1 \
libicui18n.so.78 \
libicuuc.so.78 \
libjavascriptcoregtk-6.0.so.1 \
libsoup-3.0.so.0 \
libstdc++.so.6 \
libsystemd.so.0 \
libwebkitgtk-6.0.so.4"

inherit rpm
