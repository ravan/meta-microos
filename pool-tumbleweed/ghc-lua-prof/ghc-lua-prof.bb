SUMMARY = "Haskell lua profiling library"
DESCRIPTION = "This package provides the Haskell lua profiling library."
LICENSE = "MIT"

PV = "2.3.4"

RPM_NAME = "ghc-lua-prof-2.3.4-1.8.aarch64.rpm"
RPM_HASH = "7d86503735b160d63626f532ffa95df18df95b1330ede9c5918708dad6880ebabd97ca877b45bbd57bdd0ba4ee73a5436587f390477ae88238984980e660b6de"

RPROVIDES:${PN} += "ghc-lua-prof \
ghc-prof-lua-2.3.4-GxTlN73bN8C8KbBhVEtsew"

RDEPENDS:${PN} += "ghc-lua-devel \
ghc-prof-base-4.21.2.0-8844"

inherit rpm
