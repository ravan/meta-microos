SUMMARY = "Haskell blaze-builder profiling library"
DESCRIPTION = "This package provides the Haskell blaze-builder profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.4.4.1"

RPM_NAME = "ghc-blaze-builder-prof-0.4.4.1-1.9.aarch64.rpm"
RPM_HASH = "dca22f740826886c90d7e1cf75c52b71d4bc14d5a89b7c45452a422ef613f095995b89e4cde98d39e7caa61d25e368f256184d7425cd3a0aff21c4fed8e7b97e"

RPROVIDES:${PN} += "ghc-blaze-builder-prof \
ghc-prof-blaze-builder-0.4.4.1-DHhu3j9nndC9LUZIrPJCEG"

RDEPENDS:${PN} += "ghc-blaze-builder-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-text-2.1.4-cf23"

inherit rpm
