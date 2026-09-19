SUMMARY = "Haskell split profiling library"
DESCRIPTION = "This package provides the Haskell split profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.2.5"

RPM_NAME = "ghc-split-prof-0.2.5-1.16.aarch64.rpm"
RPM_HASH = "abd02a3e3079c908eda121f6b708b5de0d22f7d733833e38048acf1e4d7bd5108135b2a22c9d01412c66aa6fac14c353f181606788dd1d26fa1c751f208e3d57"

RPROVIDES:${PN} += "ghc-prof-split-0.2.5-DF0qBqNymX3Hv5Ta0307xc \
ghc-split-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.21.2.0-8844 \
ghc-split-devel"

inherit rpm
