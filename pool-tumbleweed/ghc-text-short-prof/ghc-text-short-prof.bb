SUMMARY = "Haskell text-short profiling library"
DESCRIPTION = "This package provides the Haskell text-short profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.6.1"

RPM_NAME = "ghc-text-short-prof-0.1.6.1-1.3.aarch64.rpm"
RPM_HASH = "8610e262648c396022cc78529e6fd759b3b614e12e6960b357d0774b3fa00f84e4ff5ed616221035edc4295bef659785a16f24b526b65f6e3fab93c03d5d2e10"

RPROVIDES:${PN} += "ghc-prof-text-short-0.1.6.1-K3gVAGEPLemvxyg6g1yq \
ghc-text-short-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.21.2.0-8844 \
ghc-prof-binary-0.8.9.3-9861 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-deepseq-1.5.1.0-1350 \
ghc-prof-ghc-prim-0.13.0-f55c \
ghc-prof-hashable-1.5.1.0-csiQUH7RkN8TUlZyJbFpr \
ghc-prof-template-haskell-2.23.0.0-358a \
ghc-prof-text-2.1.4-cf23 \
ghc-text-short-devel"

inherit rpm
