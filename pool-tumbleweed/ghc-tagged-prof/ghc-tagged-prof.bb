SUMMARY = "Haskell tagged profiling library"
DESCRIPTION = "This package provides the Haskell tagged profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.8.10"

RPM_NAME = "ghc-tagged-prof-0.8.10-2.3.aarch64.rpm"
RPM_HASH = "9d4596c1b1de03cc7dd81a3de97e87c8de6c01521c701811806275c94aa6b0132ef91ff552c65f071600aa84be9dec5e984984859c63026deba139d82ca034b7"

RPROVIDES:${PN} += "ghc-prof-tagged-0.8.10-H6Ef5dd4ktu4CIJjtjtwM7 \
ghc-tagged-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.21.2.0-8844 \
ghc-prof-deepseq-1.5.1.0-1350 \
ghc-prof-template-haskell-2.23.0.0-358a \
ghc-tagged-devel"

inherit rpm
