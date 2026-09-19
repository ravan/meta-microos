SUMMARY = "Haskell template-haskell profiling library"
DESCRIPTION = "This package provides the Haskell template-haskell profiling library."
LICENSE = "BSD-3-Clause"

PV = "2.23.0.0"

RPM_NAME = "ghc-template-haskell-prof-2.23.0.0-1.3.aarch64.rpm"
RPM_HASH = "ee9574e7f263c6744481c7d62381ff8ab451dc9bf7aeb0ea7364a4e44d7acc7df8c81644b96a93bce42e40789b415f6e5cb491a4340cdea4d9d3844792b97221"

RPROVIDES:${PN} += "ghc-prof-template-haskell-2.23.0.0-358a \
ghc-template-haskell-prof \
libHStemplate-haskell-2.23.0.0-358a-p-ghc9.12.4.so"

RDEPENDS:${PN} += "ghc-prof-base-4.21.2.0-8844 \
ghc-prof-ghc-boot-th-9.12.4-0605 \
ghc-prof-ghc-internal-9.1204.0-f1e1 \
ghc-template-haskell-devel \
libHSbase-4.21.2.0-8844-p-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-p-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-p-ghc9.12.4.so \
libHSghc-boot-th-9.12.4-0605-p-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-p-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-p-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-p-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
