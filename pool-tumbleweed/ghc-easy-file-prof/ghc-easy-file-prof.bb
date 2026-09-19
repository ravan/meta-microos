SUMMARY = "Haskell easy-file profiling library"
DESCRIPTION = "This package provides the Haskell easy-file profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.2.5"

RPM_NAME = "ghc-easy-file-prof-0.2.5-1.32.aarch64.rpm"
RPM_HASH = "c5878aa81e04031c9fc2802ed66c28266d2780930d331b9daf3c24984d2059a92ac8d5d3d8f5c315aa9273575818a3d569ec792528bb65832395d71d39d272ec"

RPROVIDES:${PN} += "ghc-easy-file-prof \
ghc-prof-easy-file-0.2.5-HaH29sPzevuLIcTD4Zvwg0"

RDEPENDS:${PN} += "ghc-easy-file-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-directory-1.3.10.1-b1d7 \
ghc-prof-filepath-1.5.5.0-b25b \
ghc-prof-time-1.14-a7dc \
ghc-prof-unix-2.8.8.0-178a"

inherit rpm
