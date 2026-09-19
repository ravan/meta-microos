SUMMARY = "LibJWT C Library"
DESCRIPTION = "LibJWT C Library - shared library"
LICENSE = "MPL-2.0"

PV = "1.18.3"

RPM_NAME = "libjwt2-1.18.3-2.3.aarch64.rpm"
RPM_HASH = "89d9fca4e74484c4dacc3807ea6ec0968ae3a902bc2a133ae64106280a4afe18f473c6f2f502b9a1cdf413b60c947e955171b879b59cf7404767732446e440d5"

RPROVIDES:${PN} += "libjwt.so.2 \
libjwt2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libjansson.so.4"

inherit rpm
