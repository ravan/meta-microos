SUMMARY = "Development files for libunbound"
DESCRIPTION = "Unbound is a validating, recursive, and caching DNS(SEC) resolver. \
 \
This package holds the development files to work with libunbound."
LICENSE = "BSD-3-Clause"

PV = "1.26.0"

RPM_NAME = "unbound-devel-1.26.0-2.1.aarch64.rpm"
RPM_HASH = "3404cd4214411825aadf40e58b10d49dd0886751befe480830151774b511731c28fbf2a48a28309919e4284f94001b3bdc6db564511f2731de3b6362d4700208"

RPROVIDES:${PN} += "libunbound-devel \
pkgconfig-libunbound \
unbound-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ldns-devel \
libunbound8 \
openssl-devel \
pkgconfig-libevent \
pkgconfig-python3"

inherit rpm
