SUMMARY = "Haskell bloomfilter profiling library"
DESCRIPTION = "This package provides the Haskell bloomfilter profiling library."
LICENSE = "BSD-3-Clause"

PV = "2.0.1.3"

RPM_NAME = "ghc-bloomfilter-prof-2.0.1.3-1.7.aarch64.rpm"
RPM_HASH = "ec0001fa33f2e5bdd083e0da40c329a0134254b706522943af9ff3f008cd4720c87533b825b1265dcbd7f0cf66942072afaa1d1bfd0bc78f9e0f8d829cdd44ca"

RPROVIDES:${PN} += "ghc-bloomfilter-prof \
ghc-prof-bloomfilter-2.0.1.3-6WqEF5kyWs0ITGKrOkkdRL"

RDEPENDS:${PN} += "ghc-bloomfilter-devel \
ghc-prof-array-0.5.8.0-2a42 \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-deepseq-1.5.1.0-1350"

inherit rpm
