SUMMARY = "Haskell vty-unix library development files"
DESCRIPTION = "This package provides the Haskell vty-unix library development files."
LICENSE = "BSD-3-Clause"

PV = "0.3.0.0"

RPM_NAME = "ghc-vty-unix-devel-0.3.0.0-1.3.aarch64.rpm"
RPM_HASH = "82c3c0dd12af9aa067e286d65d01142346312dfb8116518372df4d232bcf183ec6f694fdebeec3afb5214894d23829f200d51e694f823cb81c73e5273b207501"

RPROVIDES:${PN} += "ghc-devel-vty-unix-0.3.0.0-BdEZXN0VRxZI5S5J9qgVGK \
ghc-vty-unix-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-blaze-builder-0.4.4.1-DHhu3j9nndC9LUZIrPJCEG \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-deepseq-1.5.1.0-1350 \
ghc-devel-microlens-0.5.0.0-K1fQqqDyjwS5maOWIXQxx3 \
ghc-devel-microlens-mtl-0.2.1.1-8JUCbV1SpIrJP4FZoU0oV5 \
ghc-devel-microlens-th-0.4.3.18-5y491C8iAr58VYbwqIS2QN \
ghc-devel-mtl-2.3.2-37ef \
ghc-devel-parsec-3.1.18.0-be05 \
ghc-devel-stm-2.5.3.1-6d74 \
ghc-devel-terminfo-0.4.1.7-3afa \
ghc-devel-transformers-0.6.3.0-4709 \
ghc-devel-unix-2.8.8.0-178a \
ghc-devel-utf8-string-1.0.2-FCJm07Id8m53KWoTjjdHEG \
ghc-devel-vector-0.13.2.0-F8givqpU8HnLN0O3dVdeWE \
ghc-devel-vty-6.6-EPyV4ZsVRx8EnXBLhcE4eO \
ghc-vty-unix"

inherit rpm
