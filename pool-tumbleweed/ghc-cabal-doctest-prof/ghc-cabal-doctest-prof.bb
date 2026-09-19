SUMMARY = "Haskell cabal-doctest profiling library"
DESCRIPTION = "This package provides the Haskell cabal-doctest profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.0.12"

RPM_NAME = "ghc-cabal-doctest-prof-1.0.12-2.3.aarch64.rpm"
RPM_HASH = "070cadab0f4e6e844350df2f0e515a95475f20da614cc7edb8f20ce903e9ceee87baebde98f79dc6a9249ff026b1b72196ab07a069077813690d4227c9c5a20e"

RPROVIDES:${PN} += "ghc-cabal-doctest-prof \
ghc-prof-cabal-doctest-1.0.12-9BatbH3Akyg7qG3sD8QDn0"

RDEPENDS:${PN} += "ghc-cabal-doctest-devel \
ghc-prof-Cabal-3.14.2.0-f8f4 \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-directory-1.3.10.1-b1d7 \
ghc-prof-filepath-1.5.5.0-b25b"

inherit rpm
