SUMMARY = "Header files for Symmetrica, a library for group theory"
DESCRIPTION = "Symmetrica is a C library with routines for group theory. \
This package contains header files."
LICENSE = "MIT"

PV = "3.1.0"

RPM_NAME = "symmetrica-devel-3.1.0-1.6.aarch64.rpm"
RPM_HASH = "d9089d34cbb78da3493a944f5a7df6854e7dbb720de8f9931bbf2d7b3326e24e7a0d26c214501e9243fbb2dff5998b31fdba9b9e50e023c1e9f656b03d907055"

RPROVIDES:${PN} += "pkgconfig-symmetrica \
symmetrica-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsymmetrica3"

inherit rpm
