SUMMARY = "Haskell silently profiling library"
DESCRIPTION = "This package provides the Haskell silently profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.2.5.4"

RPM_NAME = "ghc-silently-prof-1.2.5.4-1.15.aarch64.rpm"
RPM_HASH = "45a4e1b7b01d44d87270b40a6f1fe8fe8735bd86d9dabcd58102497fb8515388b2a96a5faba359ad9cb7b19ef76d1a22c60af5aac46d25ab4570626a67adc2d9"

RPROVIDES:${PN} += "ghc-prof-silently-1.2.5.4-54yCGOZ1hqDAcZZPz9a2Bu \
ghc-silently-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.21.2.0-8844 \
ghc-prof-deepseq-1.5.1.0-1350 \
ghc-prof-directory-1.3.10.1-b1d7 \
ghc-silently-devel"

inherit rpm
