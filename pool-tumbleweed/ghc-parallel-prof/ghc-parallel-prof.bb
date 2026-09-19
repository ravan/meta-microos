SUMMARY = "Haskell parallel profiling library"
DESCRIPTION = "This package provides the Haskell parallel profiling library."
LICENSE = "BSD-3-Clause"

PV = "3.2.2.0"

RPM_NAME = "ghc-parallel-prof-3.2.2.0-16.9.aarch64.rpm"
RPM_HASH = "3b90ce6305d76d8a25be2486d11eda2151196b16b893e9d2585bb55648697357333cdc0478b3fbc5002606ffff3bc975810fc4957cf1e47fdf884e2e6cc60006"

RPROVIDES:${PN} += "ghc-parallel-prof \
ghc-prof-parallel-3.2.2.0-DHmdQd1fQsJFTMvpGLTdNS"

RDEPENDS:${PN} += "ghc-parallel-devel \
ghc-prof-array-0.5.8.0-2a42 \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-deepseq-1.5.1.0-1350 \
ghc-prof-ghc-prim-0.13.0-f55c"

inherit rpm
