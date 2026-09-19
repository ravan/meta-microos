SUMMARY = "Haskell megaparsec library development files"
DESCRIPTION = "This package provides the Haskell megaparsec library development files."
LICENSE = "BSD-2-Clause"

PV = "9.7.1"

RPM_NAME = "ghc-megaparsec-devel-9.7.1-1.2.aarch64.rpm"
RPM_HASH = "d6fc6a0278c7f5eb1e1db755186ae22e187818a1987b471773c365c9388c62398ddef55f077387e83b3ccff3dedd02f9cf7f72ae792722e38471800efebfe705"

RPROVIDES:${PN} += "ghc-devel-megaparsec-9.7.1-3bWkE5RywYh6b8gn4lQrB6 \
ghc-megaparsec-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-array-0.5.8.0-2a42 \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-case-insensitive-1.2.1.0-8WhhA2fjmpX8lBECkgmLqC \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-deepseq-1.5.1.0-1350 \
ghc-devel-mtl-2.3.2-37ef \
ghc-devel-parser-combinators-1.3.1-L2vTYvTgTG7FdcDqlc42x9 \
ghc-devel-scientific-0.3.8.1-EfN6leGWc5k1t5YPK2dkVk \
ghc-devel-text-2.1.4-cf23 \
ghc-devel-transformers-0.6.3.0-4709 \
ghc-megaparsec"

inherit rpm
