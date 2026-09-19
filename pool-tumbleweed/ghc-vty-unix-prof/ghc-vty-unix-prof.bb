SUMMARY = "Haskell vty-unix profiling library"
DESCRIPTION = "This package provides the Haskell vty-unix profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.3.0.0"

RPM_NAME = "ghc-vty-unix-prof-0.3.0.0-1.3.aarch64.rpm"
RPM_HASH = "cb11ad6f9e91a8dbd1fbcc4eafd32bb33ba035f70acd6d38d1f67c478e3de37f418e49eed074d53a74c926250efe700ca38ba6400265d845b58824b29e6e6b83"

RPROVIDES:${PN} += "ghc-prof-vty-unix-0.3.0.0-BdEZXN0VRxZI5S5J9qgVGK \
ghc-vty-unix-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.21.2.0-8844 \
ghc-prof-blaze-builder-0.4.4.1-DHhu3j9nndC9LUZIrPJCEG \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-deepseq-1.5.1.0-1350 \
ghc-prof-microlens-0.5.0.0-K1fQqqDyjwS5maOWIXQxx3 \
ghc-prof-microlens-mtl-0.2.1.1-8JUCbV1SpIrJP4FZoU0oV5 \
ghc-prof-microlens-th-0.4.3.18-5y491C8iAr58VYbwqIS2QN \
ghc-prof-mtl-2.3.2-37ef \
ghc-prof-parsec-3.1.18.0-be05 \
ghc-prof-stm-2.5.3.1-6d74 \
ghc-prof-terminfo-0.4.1.7-3afa \
ghc-prof-transformers-0.6.3.0-4709 \
ghc-prof-unix-2.8.8.0-178a \
ghc-prof-utf8-string-1.0.2-FCJm07Id8m53KWoTjjdHEG \
ghc-prof-vector-0.13.2.0-F8givqpU8HnLN0O3dVdeWE \
ghc-prof-vty-6.6-EPyV4ZsVRx8EnXBLhcE4eO \
ghc-vty-unix-devel"

inherit rpm
