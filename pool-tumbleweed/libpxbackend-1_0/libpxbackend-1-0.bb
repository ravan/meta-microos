SUMMARY = "Backend library for libproxy, handles plugin loading"
DESCRIPTION = "libproxy is a library that provides automatic proxy configuration \
management. \
 \
Proxy autoconfiguration (PAC) requires JavaScript (which most \
applications do not have), and determing the PAC script location \
requires a WPAD protocol implementation, which complicates proxy \
support. libproxy exists to abstract this issue and provides \
an answer how to reach a certain network resource."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.5.12"

RPM_NAME = "libpxbackend-1_0-0.5.12-2.4.aarch64.rpm"
RPM_HASH = "323cf769d808deb9757ac722ff4394965bf8edd7b8c27f491402e6c816b2b75c1f5a9052c326f06ac9f2fbb737eadd2ded8419b26313c8accd258befd1fb00fa"

RPROVIDES:${PN} += "libpxbackend-1-0 \
libpxbackend-1.0.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libduktape.so.207 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
