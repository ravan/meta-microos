SUMMARY = "Haskell template-haskell library"
DESCRIPTION = "This package provides the Haskell template-haskell library."
LICENSE = "BSD-3-Clause"

PV = "2.23.0.0"

RPM_NAME = "ghc-template-haskell-2.23.0.0-1.3.aarch64.rpm"
RPM_HASH = "b25caa77bb67da15555859ed4387f7b3c7c67a94293c65423a246bcf4a6ce56415812f770f92576ae4fafb43eb3e62f9ab3c11edb298c85d1ac7c66b3fd083da"

RPROVIDES:${PN} += "ghc-template-haskell \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-boot-th-9.12.4-0605-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
