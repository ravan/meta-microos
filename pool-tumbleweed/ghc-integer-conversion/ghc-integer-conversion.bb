SUMMARY = "Conversion from strings to Integer"
DESCRIPTION = "The naive 'foldl' (acc d -> acc * 10 + d) 0' is expensive (quadratic!) for \
large 'Integer's. This package provides sub-quadratic implementation."
LICENSE = "BSD-3-Clause"

PV = "0.1.1"

RPM_NAME = "ghc-integer-conversion-0.1.1-3.2.aarch64.rpm"
RPM_HASH = "4aa8186282e3e06c01463aa32adfd441b17f06bdfeb025905fe0fa46c07eb3773b7e8a97274fce5dd48ee0f2e757a3f2d4a5e6c6db3adcd602fc1e8779078a73"

RPROVIDES:${PN} += "ghc-integer-conversion \
libHSinteger-conversion-0.1.1-HaWNFfmKaxu3271U3IJ8uO-ghc9.12.4.so"

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
libHSprimitive-0.9.1.0-Ez30Vu7tivmF28X1123Css-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libHStext-2.1.4-cf23-ghc9.12.4.so \
libHStransformers-0.6.3.0-4709-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
