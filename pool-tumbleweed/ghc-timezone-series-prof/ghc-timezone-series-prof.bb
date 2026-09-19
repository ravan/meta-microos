SUMMARY = "Haskell timezone-series profiling library"
DESCRIPTION = "This package provides the Haskell timezone-series profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.13"

RPM_NAME = "ghc-timezone-series-prof-0.1.13-4.3.aarch64.rpm"
RPM_HASH = "f3719ed09a6124e023a88a48e5b9543766c652bd2dcdc9c9cc2e584352cad9079737c06943b2c9ec30c24a26215d86fae8e06b43e5b04ec9909331843c10509d"

RPROVIDES:${PN} += "ghc-prof-timezone-series-0.1.13-B1H9AY16C4DSLWHEx9hhA \
ghc-timezone-series-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.21.2.0-8844 \
ghc-prof-deepseq-1.5.1.0-1350 \
ghc-prof-time-1.14-a7dc \
ghc-timezone-series-devel"

inherit rpm
