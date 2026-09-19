SUMMARY = "Haskell tasty profiling library"
DESCRIPTION = "This package provides the Haskell tasty profiling library."
LICENSE = "MIT"

PV = "1.5.4"

RPM_NAME = "ghc-tasty-prof-1.5.4-1.3.aarch64.rpm"
RPM_HASH = "bd4832d10d29d64c42a2a5b863dd934843746fc6f19d246bc64deeb8300a2d1f70734e292c1d86a5249fb518d68181bcdd2f9a05d36a94ea7a645ae265245653"

RPROVIDES:${PN} += "ghc-prof-tasty-1.5.4-1HxvBgEXkE5Beb2ChlE06d \
ghc-tasty-prof"

RDEPENDS:${PN} += "ghc-prof-ansi-terminal-1.1.5-KiVHPj6W9e81bxE9dBsVtZ \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-optparse-applicative-0.19.0.0-GyrRSLDSSh1GQCxnTYbnDq \
ghc-prof-stm-2.5.3.1-6d74 \
ghc-prof-tagged-0.8.10-H6Ef5dd4ktu4CIJjtjtwM7 \
ghc-prof-transformers-0.6.3.0-4709 \
ghc-prof-unix-2.8.8.0-178a \
ghc-tasty-devel"

inherit rpm
