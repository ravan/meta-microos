SUMMARY = "Secure Reliable Transport (SRT) library"
DESCRIPTION = "This package contains a shared system library for Secure Reliable \
Transport (SRT)."
LICENSE = "MPL-2.0"

PV = "1.5.7"

RPM_NAME = "libsrt1_5-1.5.7-1.1.aarch64.rpm"
RPM_HASH = "3aca417efdb9cf8950b896352c6d72cd731f32e2185282a32a823098f38cdb19eac489bc9b0e8f6db5ea9f9b79faada83ce6035b66f10aa24bf5400cf28f3533"

RPROVIDES:${PN} += "libsrt.so.1.5 \
libsrt1-5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
