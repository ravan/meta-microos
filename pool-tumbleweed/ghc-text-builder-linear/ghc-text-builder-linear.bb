SUMMARY = "Builder for Text and ByteString based on linear types"
DESCRIPTION = "Strict Text and ByteString builder, which hides mutable buffer behind linear \
types and takes amortized linear time."
LICENSE = "BSD-3-Clause"

PV = "0.1.3"

RPM_NAME = "ghc-text-builder-linear-0.1.3-1.20.aarch64.rpm"
RPM_HASH = "31a219296757abe6a103f645e2541ce70c550beef401fc1850571b4bedeec03917d7f87a6f8f0516083d4932cf1684f9c6d2a411bc6b2c948f9915af2fdc065b"

RPROVIDES:${PN} += "ghc-text-builder-linear \
libHStext-builder-linear-0.1.3-2ecVyAm1DTtJbSvV9ASpSh-ghc9.12.4.so"

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
libHSquote-quot-0.2.1.0-8ke8gm9O7CFLkwYR1NwZbK-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libHStext-2.1.4-cf23-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
