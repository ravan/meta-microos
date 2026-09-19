SUMMARY = "Library for multiplication over the GF(2) field"
DESCRIPTION = "gf2x is a library for multiplication of polynomials over the \
GF(2) binary field."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.0"

RPM_NAME = "libgf2x3-1.3.0-3.9.aarch64.rpm"
RPM_HASH = "95d1a75cb062bbe7f4163775f047d33b1485a0d1d422315740d706dd1af5d3d69780c51daa06c1d353e5447eb5ff96a01085f762d72f092fd778c02be7339600"

RPROVIDES:${PN} += "libgf2x-fft.so.3 \
libgf2x.so.3 \
libgf2x3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
