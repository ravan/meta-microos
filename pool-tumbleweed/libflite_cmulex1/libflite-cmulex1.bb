SUMMARY = "Small, fast speech synthesis engine (libraries)"
LICENSE = "BSD-3-Clause-Modification"

PV = "2.2"

RPM_NAME = "libflite_cmulex1-2.2-1.13.aarch64.rpm"
RPM_HASH = "f8d558175c60b1125303d2d21657d0fef29b8e3b21eef36d2ecad7312976ac8c1e1abe3fa86b590a407f8fb9a3584a26c32222a18c1d6e0918ed4f725766cd55"

RPROVIDES:${PN} += "libflite-cmulex.so.1 \
libflite-cmulex1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libflite.so.1"

inherit rpm
