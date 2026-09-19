SUMMARY = "Haskell crypton library development files"
DESCRIPTION = "This package provides the Haskell crypton library development files."
LICENSE = "BSD-3-Clause"

PV = "1.1.4"

RPM_NAME = "ghc-crypton-devel-1.1.4-1.3.aarch64.rpm"
RPM_HASH = "10e185c1231a840d91e2cecf666790666dc20bbd0a7f9138b5362d7b07db12d0186688db447d1850c2d36c11f09d5ce644b5b1234ee2926aa32ddc3cc2bd6163"

RPROVIDES:${PN} += "ghc-crypton-devel \
ghc-devel-crypton-1.1.4-CRp9zIWu5CJCaPWpwBhIPB"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-crypton \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-base16-1.0-GqCyVT5DfwtBcN8MC2i0Li \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-deepseq-1.5.1.0-1350 \
ghc-devel-integer-gmp-1.1-09fd \
ghc-devel-primitive-0.9.1.0-Ez30Vu7tivmF28X1123Css \
ghc-devel-ram-0.22.0-4Io46KcWliV5ncwh4lemlr \
ghc-devel-text-2.1.4-cf23"

inherit rpm
