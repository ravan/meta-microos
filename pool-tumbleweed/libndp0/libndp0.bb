SUMMARY = "Libraries and header files for libndp development"
DESCRIPTION = "This package contains a library which provides a wrapper for IPv6 Neighbor \
Discovery Protocol."
LICENSE = "LGPL-2.1-or-later"

PV = "1.9"

RPM_NAME = "libndp0-1.9-1.2.aarch64.rpm"
RPM_HASH = "a7f86294ebe0d3675c5de07728e8268d86da4b30f7f837f0f06f6702ad8c6b1f0730779594f2faab48ef2187d571fe2b7d322b1429b63c8fadb48ec56ecac8c1"

RPROVIDES:${PN} += "libndp.so.0 \
libndp0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
