SUMMARY = "Shared library part of faad2"
DESCRIPTION = "FAAD2 is a HE, LC, MAIN and LTP profile, MPEG2 and MPEG-4 AAC decoder. \
FAAD2 includes code for SBR (HE AAC) decoding."
LICENSE = "GPL-2.0-or-later"

PV = "2.11.3"

RPM_NAME = "libfaad2-2.11.3-1.1.aarch64.rpm"
RPM_HASH = "a1b32f0eef4615a2935dfc023d79254754bdf7101a4f0bdc6083544ba448051e4b0d63c6f6eae82b1fc975432fe936483643b1bd4ff1d250f90a9d5b205e657b"

RPROVIDES:${PN} += "libfaad.so.2 \
libfaad2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
