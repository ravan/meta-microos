SUMMARY = "Haskell tasty-rerun library development files"
DESCRIPTION = "This package provides the Haskell tasty-rerun library development files."
LICENSE = "BSD-3-Clause"

PV = "1.1.20"

RPM_NAME = "ghc-tasty-rerun-devel-1.1.20-3.7.aarch64.rpm"
RPM_HASH = "b54fe4f3c99c857fb9710dbd655e14a32ce23d0923c67f8b0239aa7e4ff114741271dc704460eda1d0ff7378d8eacf8850ed41e8f33f579049a1febb7a4a33b3"

RPROVIDES:${PN} += "ghc-devel-tasty-rerun-1.1.20-ApQVGOIA4TkE6635pNBbel \
ghc-tasty-rerun-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-filepath-1.5.5.0-b25b \
ghc-devel-mtl-2.3.2-37ef \
ghc-devel-optparse-applicative-0.19.0.0-GyrRSLDSSh1GQCxnTYbnDq \
ghc-devel-split-0.2.5-DF0qBqNymX3Hv5Ta0307xc \
ghc-devel-stm-2.5.3.1-6d74 \
ghc-devel-tagged-0.8.10-H6Ef5dd4ktu4CIJjtjtwM7 \
ghc-devel-tasty-1.5.4-1HxvBgEXkE5Beb2ChlE06d \
ghc-devel-transformers-0.6.3.0-4709 \
ghc-tasty-rerun"

inherit rpm
