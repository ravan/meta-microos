SUMMARY = "NCNN library"
DESCRIPTION = "The package contains the library for ncnn."
LICENSE = "BSD-2-Clause & BSD-3-Clause & Zlib"

PV = "20250916"

RPM_NAME = "libncnn1-20250916-1.12.aarch64.rpm"
RPM_HASH = "433f2f68c71b291417d7b0fad7735b7d695c993c28dfa24d0658290629c0e0c56da5873d8e292af379d82c77f898ecb38098388330627d8b6985a97ccdbb8ada"

RPROVIDES:${PN} += "libncnn.so.1 \
libncnn1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libglslang.so.16 \
libgomp.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
