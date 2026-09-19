SUMMARY = "Haskell ghc-heap library"
DESCRIPTION = "This package provides the Haskell ghc-heap library."
LICENSE = "BSD-3-Clause"

PV = "9.12.4"

RPM_NAME = "ghc-ghc-heap-9.12.4-1.3.aarch64.rpm"
RPM_HASH = "3315e11b973bdcf9ca70d1388a571f54f4eae9659117903eb0294ac68f373b5b36a8f84bf4f7b4b20fa7ba9153d08623747d1eb0d07d3f7f03c61ac1eb8607d4"

RPROVIDES:${PN} += "ghc-ghc-heap \
libHSghc-heap-9.12.4-167c-ghc9.12.4.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
libHSarray-0.5.8.0-2a42-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
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
