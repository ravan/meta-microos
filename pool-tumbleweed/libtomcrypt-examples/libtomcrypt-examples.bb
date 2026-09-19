SUMMARY = "Example Files for LibTomCrypt"
DESCRIPTION = "LibTomCrypt is a fairly comprehensive, modular and portable cryptographic \
toolkit that provides developers with a vast array of well known published \
block ciphers, one-way hash functions, chaining modes, pseudo-random \
numbergenerators, public key cryptography and a plethora of other routines. \
 \
This package contains example *.c files showing how to use TomCrypt library."
LICENSE = "SUSE-Public-Domain"

PV = "1.18.2"

RPM_NAME = "libtomcrypt-examples-1.18.2-3.12.aarch64.rpm"
RPM_HASH = "c41d52801377115bd5db7a75878b62c9c977a7a775f975957ad72792eaf5204c4c083c354620ef80c1c36681d064faf85f5d91738077bed4c3c314091a08704e"

RPROVIDES:${PN} += "libtomcrypt-examples"

RDEPENDS:${PN} += "libtomcrypt-devel"

inherit rpm
