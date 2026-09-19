SUMMARY = "Routines For a Integer Based Number Theoretic Applications"
DESCRIPTION = "LibTomMath provides highly optimized and portable routines for a vast \
majority of integer based number theoretic applications (including public \
key cryptography). LibTomMath is not a cryptographic toolkit itself but it \
can be used to write one [Used in LibTomCrypt for RSA, DH and ECC public key \
routines]."
LICENSE = "Unlicense"

PV = "1.3.0"

RPM_NAME = "libtommath1-1.3.0-1.9.aarch64.rpm"
RPM_HASH = "5601b8f3a1a36163abc47eaab3355a522ab8656d32d147fa4b310fbefc3badcf3bfe0857aa73ba80b53a03be795252d2fcf87dabfca6aa39626bfd20e05cb9e3"

RPROVIDES:${PN} += "libtommath.so.1 \
libtommath1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
