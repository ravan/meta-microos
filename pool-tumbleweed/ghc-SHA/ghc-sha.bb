SUMMARY = "Implementations of the SHA suite of message digest functions"
DESCRIPTION = "This library implements the SHA suite of message digest functions, according to \
NIST FIPS 180-2 (with the SHA-224 addendum), as well as the SHA-based HMAC \
routines. The functions have been tested against most of the NIST and RFC test \
vectors for the various functions. While some attention has been paid to \
performance, these do not presently reach the speed of well-tuned libraries, \
like OpenSSL."
LICENSE = "BSD-3-Clause"

PV = "1.6.4.4"

RPM_NAME = "ghc-SHA-1.6.4.4-8.23.aarch64.rpm"
RPM_HASH = "d39f302964d106384fe72dea87068c0704a52cec86230caa997542618c506621a0d1a4df4ecc4bd0d8b6dc715aac14e9ea13746b0ce3b61a0252f79d9f95385b"

RPROVIDES:${PN} += "ghc-SHA \
libHSSHA-1.6.4.4-F68cMQUf1qw5myCdTNffCM-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSarray-0.5.8.0-2a42-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSbinary-0.8.9.3-9861-ghc9.12.4.so \
libHSbytestring-0.12.2.0-65be-ghc9.12.4.so \
libHScontainers-0.7-d5e1-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-boot-th-9.12.4-0605-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
