SUMMARY = "Haskell vty library development files"
DESCRIPTION = "This package provides the Haskell vty library development files."
LICENSE = "BSD-3-Clause"

PV = "6.6"

RPM_NAME = "ghc-vty-devel-6.6-1.3.aarch64.rpm"
RPM_HASH = "7a15154de52eb827829899879fb3a7e1cf21d0f2b4ab4377c435dbc6d4da7730476df6542cfabaf26c5ebe57d2a3c871d7f6efea2e8e64f06c7753195c53ae3b"

RPROVIDES:${PN} += "ghc-devel-vty-6.6-EPyV4ZsVRx8EnXBLhcE4eO \
ghc-vty-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-binary-0.8.9.3-9861 \
ghc-devel-blaze-builder-0.4.4.1-DHhu3j9nndC9LUZIrPJCEG \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-deepseq-1.5.1.0-1350 \
ghc-devel-directory-1.3.10.1-b1d7 \
ghc-devel-filepath-1.5.5.0-b25b \
ghc-devel-microlens-0.5.0.0-K1fQqqDyjwS5maOWIXQxx3 \
ghc-devel-microlens-mtl-0.2.1.1-8JUCbV1SpIrJP4FZoU0oV5 \
ghc-devel-mtl-2.3.2-37ef \
ghc-devel-parsec-3.1.18.0-be05 \
ghc-devel-stm-2.5.3.1-6d74 \
ghc-devel-text-2.1.4-cf23 \
ghc-devel-utf8-string-1.0.2-FCJm07Id8m53KWoTjjdHEG \
ghc-devel-vector-0.13.2.0-F8givqpU8HnLN0O3dVdeWE \
ghc-vty"

inherit rpm
