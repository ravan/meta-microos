SUMMARY = "The GNU Compiler Collection JIT library"
DESCRIPTION = "Support for embedding GCC inside programs and libraries"
LICENSE = "GPL-3.0-or-later"

PV = "13.5.0+git10516"

RPM_NAME = "libgccjit0-gcc13-13.5.0+git10516-1.1.aarch64.rpm"
RPM_HASH = "6d7708f71e4c35688f05a78c526a50dbbda3128c992369b1aad496536fd133b2925e2dca746c068fbecb1ebe75ee04349938c01c2a0c3d9d420b5ecb359f4a86"

RPROVIDES:${PN} += "libgccjit.so.0 \
libgccjit0 \
libgccjit0-gcc13"

RDEPENDS:${PN} += "/sbin/ldconfig \
gcc13 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10 \
libisl.so.23 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm
