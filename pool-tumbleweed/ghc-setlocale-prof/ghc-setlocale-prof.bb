SUMMARY = "Haskell setlocale profiling library"
DESCRIPTION = "This package provides the Haskell setlocale profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.0.0.10"

RPM_NAME = "ghc-setlocale-prof-1.0.0.10-8.5.aarch64.rpm"
RPM_HASH = "99d56718b6e02aff3acabf95a762365aaf92447897ad5e8742551a2929892cbb96269e236dd6f21cce5e481a2d1a36c901e536ca1e27b18ed1f8187d7b40194b"

RPROVIDES:${PN} += "ghc-prof-setlocale-1.0.0.10-1AxYf6FKOpjAmPtKjx6N4K \
ghc-setlocale-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.21.2.0-8844 \
ghc-setlocale-devel"

inherit rpm
