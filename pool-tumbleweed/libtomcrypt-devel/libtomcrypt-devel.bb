SUMMARY = "Development Files for LibTomCrypt"
DESCRIPTION = "LibTomCrypt is a fairly comprehensive, modular and portable cryptographic \
toolkit that provides developers with a vast array of well known published \
block ciphers, one-way hash functions, chaining modes, pseudo-random \
numbergenerators, public key cryptography and a plethora of other routines. \
 \
This package contains headers and other development files."
LICENSE = "SUSE-Public-Domain"

PV = "1.18.2"

RPM_NAME = "libtomcrypt-devel-1.18.2-3.12.aarch64.rpm"
RPM_HASH = "988ecbc6518a804df9dad24b3bc20e59d0ecdf06dde2518a28c5af4fc4c0a0db9b87707f25103b2c331c03671e00409f046ca091582ec4362293fa4540c61570"

RPROVIDES:${PN} += "libtomcrypt-devel \
pkgconfig-libtomcrypt"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libtomcrypt1"

inherit rpm
