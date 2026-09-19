SUMMARY = "Haskell text-zipper profiling library"
DESCRIPTION = "This package provides the Haskell text-zipper profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.13"

RPM_NAME = "ghc-text-zipper-prof-0.13-1.28.aarch64.rpm"
RPM_HASH = "b1d33a14a94ac3587404d2ee4d6dbacc2cd85c1f2382d28fbbce39eca7a9a963cd5f06cfe2f9caa72a6dcde3ea30f907c9554fc6fe8b0c35099ab5e6090f1ca1"

RPROVIDES:${PN} += "ghc-prof-text-zipper-0.13-HJrIfnTzHLAGK5wSCeeQus \
ghc-text-zipper-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.21.2.0-8844 \
ghc-prof-deepseq-1.5.1.0-1350 \
ghc-prof-text-2.1.4-cf23 \
ghc-prof-vector-0.13.2.0-F8givqpU8HnLN0O3dVdeWE \
ghc-text-zipper-devel"

inherit rpm
