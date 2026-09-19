SUMMARY = "Haskell megaparsec profiling library"
DESCRIPTION = "This package provides the Haskell megaparsec profiling library."
LICENSE = "BSD-2-Clause"

PV = "9.7.1"

RPM_NAME = "ghc-megaparsec-prof-9.7.1-1.2.aarch64.rpm"
RPM_HASH = "c98d95e2ff829d65c9af1b54daa33741bab393efe4d9a94b9ef5bd4e1aba486ac3e509fe782118c49fe6b10d520988a955f75ef2b67a8984e0a9caae8f0a8e54"

RPROVIDES:${PN} += "ghc-megaparsec-prof \
ghc-prof-megaparsec-9.7.1-3bWkE5RywYh6b8gn4lQrB6"

RDEPENDS:${PN} += "ghc-megaparsec-devel \
ghc-prof-array-0.5.8.0-2a42 \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-case-insensitive-1.2.1.0-8WhhA2fjmpX8lBECkgmLqC \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-deepseq-1.5.1.0-1350 \
ghc-prof-mtl-2.3.2-37ef \
ghc-prof-parser-combinators-1.3.1-L2vTYvTgTG7FdcDqlc42x9 \
ghc-prof-scientific-0.3.8.1-EfN6leGWc5k1t5YPK2dkVk \
ghc-prof-text-2.1.4-cf23 \
ghc-prof-transformers-0.6.3.0-4709"

inherit rpm
