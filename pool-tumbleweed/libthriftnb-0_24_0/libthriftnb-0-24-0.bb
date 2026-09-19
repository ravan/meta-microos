SUMMARY = "Thrift non-blocking server library"
DESCRIPTION = "Shared library providing the non-blocking server component of the \
Thrift software framework."
LICENSE = "Apache-2.0"

PV = "0.24.0"

RPM_NAME = "libthriftnb-0_24_0-0.24.0-2.1.aarch64.rpm"
RPM_HASH = "249071cc6f5325dea59582fb86235a0d2740fdfcfb3c4b4caf316cae2865bf3485bf58fbf4f2d9ad26b44b48e2fd8aca7d2cbc821cc52de78f1349a71cac132b"

RPROVIDES:${PN} += "libthriftnb-0-24-0 \
libthriftnb-0.24.0.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
