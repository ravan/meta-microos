SUMMARY = "Haskell typst-symbols profiling library"
DESCRIPTION = "This package provides the Haskell typst-symbols profiling library."
LICENSE = "MIT"

PV = "0.2"

RPM_NAME = "ghc-typst-symbols-prof-0.2-1.2.aarch64.rpm"
RPM_HASH = "2c6e71124e2c8ffc6ab66c442cea14ba2c87fd2fbbea3d5f1bcf3654bb1745262e8f3f730756dfe2c74d3ef7c070b6ae52401254d6272163dc769c11fcf10add"

RPROVIDES:${PN} += "ghc-prof-typst-symbols-0.2-DAnODvBkUY47mTgQn4NVCA \
ghc-typst-symbols-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.21.2.0-8844 \
ghc-prof-text-2.1.4-cf23 \
ghc-typst-symbols-devel"

inherit rpm
