SUMMARY = "Haskell vty profiling library"
DESCRIPTION = "This package provides the Haskell vty profiling library."
LICENSE = "BSD-3-Clause"

PV = "6.6"

RPM_NAME = "ghc-vty-prof-6.6-1.3.aarch64.rpm"
RPM_HASH = "59ea57affa5d2b0c5781226c47d640e9b92d781f21f3c783e05953371b212f3b605ae0d540d3c6b10d04f87500660b0d60a9becb0f844e097530454a57ca3d88"

RPROVIDES:${PN} += "ghc-prof-vty-6.6-EPyV4ZsVRx8EnXBLhcE4eO \
ghc-vty-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.21.2.0-8844 \
ghc-prof-binary-0.8.9.3-9861 \
ghc-prof-blaze-builder-0.4.4.1-DHhu3j9nndC9LUZIrPJCEG \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-deepseq-1.5.1.0-1350 \
ghc-prof-directory-1.3.10.1-b1d7 \
ghc-prof-filepath-1.5.5.0-b25b \
ghc-prof-microlens-0.5.0.0-K1fQqqDyjwS5maOWIXQxx3 \
ghc-prof-microlens-mtl-0.2.1.1-8JUCbV1SpIrJP4FZoU0oV5 \
ghc-prof-mtl-2.3.2-37ef \
ghc-prof-parsec-3.1.18.0-be05 \
ghc-prof-stm-2.5.3.1-6d74 \
ghc-prof-text-2.1.4-cf23 \
ghc-prof-utf8-string-1.0.2-FCJm07Id8m53KWoTjjdHEG \
ghc-prof-vector-0.13.2.0-F8givqpU8HnLN0O3dVdeWE \
ghc-vty-devel"

inherit rpm
