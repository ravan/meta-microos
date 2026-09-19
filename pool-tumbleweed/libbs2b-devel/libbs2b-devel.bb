SUMMARY = "Development files for libbs2b"
DESCRIPTION = "Headers and libraries to program against libbs2b."
LICENSE = "MIT"

PV = "3.1.0"

RPM_NAME = "libbs2b-devel-3.1.0-14.11.aarch64.rpm"
RPM_HASH = "6a52d6bb71c56bce36e356cc3f3323d12373e0d6b2a72eac82c5e6b934cb708100454cc1ae57130b86257597614f04fcb0906f30706c99de0743c3423a8d9c2f"

RPROVIDES:${PN} += "libbs2b-devel \
pkgconfig-libbs2b"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbs2b0"

inherit rpm
