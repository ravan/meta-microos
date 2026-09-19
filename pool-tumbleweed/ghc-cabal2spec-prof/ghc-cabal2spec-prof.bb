SUMMARY = "Haskell cabal2spec profiling library"
DESCRIPTION = "This package provides the Haskell cabal2spec profiling library."
LICENSE = "GPL-3.0-or-later"

PV = "2.8.0"

RPM_NAME = "ghc-cabal2spec-prof-2.8.0-1.9.aarch64.rpm"
RPM_HASH = "d9b923cc74f552f1cd9f4611ecf053bb41801cb9b9bf446672ced2f29893baff5ac7f12eb1dfc345638e897405c82c1a42a6e3291c90d172349f74c8acac4a6b"

RPROVIDES:${PN} += "ghc-cabal2spec-prof \
ghc-prof-cabal2spec-2.8.0-31lc3MkVLh81em4v4LNKxo"

RDEPENDS:${PN} += "ghc-cabal2spec-devel \
ghc-prof-Cabal-3.14.2.0-f8f4 \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-filepath-1.5.5.0-b25b \
ghc-prof-time-1.14-a7dc"

inherit rpm
