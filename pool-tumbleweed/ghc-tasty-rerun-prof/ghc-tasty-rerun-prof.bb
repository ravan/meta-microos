SUMMARY = "Haskell tasty-rerun profiling library"
DESCRIPTION = "This package provides the Haskell tasty-rerun profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.1.20"

RPM_NAME = "ghc-tasty-rerun-prof-1.1.20-3.7.aarch64.rpm"
RPM_HASH = "ad207a5ddfa3b15a218a4a103621ba68a5ee7444d4168779560964f1f25510e3a597488c7363004d1ba9db6ee4704fc52392497831c5b25be160f88f1e02c049"

RPROVIDES:${PN} += "ghc-prof-tasty-rerun-1.1.20-ApQVGOIA4TkE6635pNBbel \
ghc-tasty-rerun-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.21.2.0-8844 \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-filepath-1.5.5.0-b25b \
ghc-prof-mtl-2.3.2-37ef \
ghc-prof-optparse-applicative-0.19.0.0-GyrRSLDSSh1GQCxnTYbnDq \
ghc-prof-split-0.2.5-DF0qBqNymX3Hv5Ta0307xc \
ghc-prof-stm-2.5.3.1-6d74 \
ghc-prof-tagged-0.8.10-H6Ef5dd4ktu4CIJjtjtwM7 \
ghc-prof-tasty-1.5.4-1HxvBgEXkE5Beb2ChlE06d \
ghc-prof-transformers-0.6.3.0-4709 \
ghc-tasty-rerun-devel"

inherit rpm
