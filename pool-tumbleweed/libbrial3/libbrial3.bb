SUMMARY = "The Polynomials over Boolean Rings Computer Algebra System library"
DESCRIPTION = "The core of PolyBoRi/BRiAl is a C++ library, which provides \
high-level data types for Boolean polynomials and monomials, exponent \
vectors, as well as for the underlying polynomial rings and subsets \
of the powerset of the Boolean variables. As a unique approach, \
binary decision diagrams are used as internal storage type for \
polynomial structures."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.15"

RPM_NAME = "libbrial3-1.2.15-2.1.aarch64.rpm"
RPM_HASH = "9449bc62b6a588ba3702a4db17b585ca621bf1db5243597ef3a61fb2348c40a33e3827639f9ed9a281af7bb55fb66c52b50ae0ef8473ec4fc3adbec74c535ad2"

RPROVIDES:${PN} += "libbrial-groebner.so.3 \
libbrial.so.3 \
libbrial3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libm4ri.so.2 \
libstdc++.so.6"

inherit rpm
