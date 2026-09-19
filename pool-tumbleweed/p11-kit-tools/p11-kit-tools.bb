SUMMARY = "Library to work with PKCS#11 modules -- Tools"
DESCRIPTION = "p11-kit provides a way to load and enumerate PKCS#11 modules, as well \
as a standard configuration setup for installing PKCS#11 modules in \
such a way that they're discoverable."
LICENSE = "BSD-3-Clause"

PV = "0.26.2"

RPM_NAME = "p11-kit-tools-0.26.2-1.6.aarch64.rpm"
RPM_HASH = "2275df062bf3df1044f64655237b5b3ddbaf25b7bd8fe1ce7c68415ad121f0b1536a87a4264d41f259f826d17d9fe1ccaa37199b6ee08b0ab3aa72f20a5a7a21"

RPROVIDES:${PN} += "p11-kit-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libp11-kit.so.0 \
libtasn1.so.6"

inherit rpm
