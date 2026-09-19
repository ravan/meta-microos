SUMMARY = "Haskell fgl profiling library"
DESCRIPTION = "This package provides the Haskell fgl profiling library."
LICENSE = "BSD-3-Clause"

PV = "5.8.3.1"

RPM_NAME = "ghc-fgl-prof-5.8.3.1-1.3.aarch64.rpm"
RPM_HASH = "2ad78bf24f1da8389a6eccea4dd51b593df618847b2f77a16242b7c2ffc8313c8e70f4b68c031f28e32d0c8bba634f9adbcf2d292a5382ca9e29824519e6811d"

RPROVIDES:${PN} += "ghc-fgl-prof \
ghc-prof-fgl-5.8.3.1-7WeyqbkdcX2Klu3tCAsWkr"

RDEPENDS:${PN} += "ghc-fgl-devel \
ghc-prof-array-0.5.8.0-2a42 \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-deepseq-1.5.1.0-1350 \
ghc-prof-transformers-0.6.3.0-4709"

inherit rpm
