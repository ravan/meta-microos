SUMMARY = "Cryptographic Library for C++"
DESCRIPTION = "The Crypto++ library provides authenticated encryption, stream and \
block ciphers, block cipher operation modes, message authentication \
codes, hash functions, PKI crypto, key agreement schemes and elliptic \
curve crypto."
LICENSE = "BSL-1.0"

PV = "8.9.0"

RPM_NAME = "libcryptopp8_9_0-8.9.0-6.4.aarch64.rpm"
RPM_HASH = "43e46f892d51386523d725d3ff497914cb9634953b88d716f6fbf9ed5abd6a0a27b3db898641e72ff6c8678dccddc78478d4da46274cab4b8c25ac1bdfa5490b"

RPROVIDES:${PN} += "libcryptopp.so.8.9.0 \
libcryptopp8-9-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
