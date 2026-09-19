SUMMARY = "Haskell css-text profiling library"
DESCRIPTION = "This package provides the Haskell css-text profiling library."
LICENSE = "MIT"

PV = "0.1.3.0"

RPM_NAME = "ghc-css-text-prof-0.1.3.0-4.43.aarch64.rpm"
RPM_HASH = "49709ae6abd4cc37a0f33919cfa45709e69ac39333c77c3f6b5a537ed9d268b75c69cff3beeabdca7a7589c05cebdb71b1eb140f941007455fbf6ae05a48e7cb"

RPROVIDES:${PN} += "ghc-css-text-prof \
ghc-prof-css-text-0.1.3.0-H6znMdaU8xkJgIqMcqUC7W"

RDEPENDS:${PN} += "ghc-css-text-devel \
ghc-prof-attoparsec-0.14.4-IG7JFX7g1aObGVedAHYv7 \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-text-2.1.4-cf23"

inherit rpm
