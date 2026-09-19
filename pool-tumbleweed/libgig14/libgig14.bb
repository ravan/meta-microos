SUMMARY = "Library for loading Gigasampler and DLS Level 1/2 files"
DESCRIPTION = "C++ library for loading Gigasampler and DLS Level 1/2 files."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.0"

RPM_NAME = "libgig14-4.6.0-1.1.aarch64.rpm"
RPM_HASH = "ce9edb85061bfe8f205d80739bcbc38dd5659309c58c2a076a9d833d8a7d160f3258024aac277b2e9ea0b10f03c58a4273327087e621e3a8ceb3c3b005547820"

RPROVIDES:${PN} += "config-libgig14 \
libgig.so.14 \
libgig14"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libuuid.so.1"

inherit rpm
