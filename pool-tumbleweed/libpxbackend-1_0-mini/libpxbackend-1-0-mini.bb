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

RPM_NAME = "libpxbackend-1_0-mini-0.5.12-2.4.aarch64.rpm"
RPM_HASH = "7cbc8373aca681f02bdf4f8a7875217cba1a0a3cd7e734c66c927151dbfc9e6b6d45bb7ef218baf973b12f60b85607af22f176b2e01c1d4f2f76bb559a1da8f0"

RPROVIDES:${PN} += "libpxbackend-1-0-mini \
libpxbackend-1.0.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
this-is-only-for-build-envs"

inherit rpm
