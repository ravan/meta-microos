SUMMARY = "Concise Binary Object Representation (CBOR)"
DESCRIPTION = "This package provides an efficient implementation of the Concise Binary Object \
Representation (CBOR), as specified by [RFC \
7049](https://tools.ietf.org/html/rfc7049). \
 \
If you are looking for a library for serialisation of Haskell values, have a \
look at the [serialise](/package/serialise) package, which is built upon this \
library. \
 \
An implementation of the standard bijection between CBOR and JSON is provided \
by the [cborg-json](/package/cborg-json) package. Also see \
[cbor-tool](/package/cbor-tool) for a convenient command-line utility for \
working with CBOR data. \
 \
This package was formerly known as 'binary-serialise-cbor'."
LICENSE = "BSD-3-Clause"

PV = "0.2.10.0"

RPM_NAME = "ghc-cborg-0.2.10.0-4.11.aarch64.rpm"
RPM_HASH = "89a81f3b1935c5a4feff5b89ee06768a0377adef21f2ba92ab462d60e2a6ac7f4a2bd3f128b83e8bd1b6425309b7127c03a93f39e393e665e1c97683e7005839"

RPROVIDES:${PN} += "ghc-cborg \
libHScborg-0.2.10.0-64S0XwCJRqFCXzW08346EZ-ghc9.12.4.so"

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
libHShalf-0.3.3-7uW8H7RguCn8iNkagLajaD-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libHSprimitive-0.9.1.0-Ez30Vu7tivmF28X1123Css-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libHStext-2.1.4-cf23-ghc9.12.4.so \
libHStransformers-0.6.3.0-4709-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
