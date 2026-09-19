SUMMARY = "Haskell text library"
DESCRIPTION = "This package provides the Haskell text library."
LICENSE = "BSD-3-Clause"

PV = "2.1.4"

RPM_NAME = "ghc-text-2.1.4-1.3.aarch64.rpm"
RPM_HASH = "9dea28f8fe36c8c256c31970002ab3f58a0d7e528af439232c07899ae3529b5875343076e1c65bf68520a2ad1a8d4ef85d826a7f07bf06fd6b1cdf09f29529c7"

RPROVIDES:${PN} += "ghc-text \
libHStext-2.1.4-cf23-ghc9.12.4.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
libHSarray-0.5.8.0-2a42-ghc9.12.4.so \
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
