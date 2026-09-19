SUMMARY = "Development files for olm"
DESCRIPTION = "An implementation of the Double Ratchet cryptographic ratchet \
in C and C++, including an implementation of the Megolm cryptographic ratchet. \
Development files for olm"
LICENSE = "Apache-2.0"

PV = "3.2.16"

RPM_NAME = "olm-devel-3.2.16-2.4.aarch64.rpm"
RPM_HASH = "3f87155efb4bd7834ae8279cb0f7fae8a2fb3ed1a0cf9a63fb424dc2696309159159532c9406d33feff5d55505c6d398b3278bcb02ab810b19c0bcdd8ff157d9"

RPROVIDES:${PN} += "cmake-Olm \
olm-devel \
pkgconfig-olm"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libolm3"

inherit rpm
