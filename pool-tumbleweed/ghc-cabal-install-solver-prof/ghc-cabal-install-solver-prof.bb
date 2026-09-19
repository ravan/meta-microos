SUMMARY = "Haskell cabal-install-solver profiling library"
DESCRIPTION = "This package provides the Haskell cabal-install-solver profiling library."
LICENSE = "BSD-3-Clause"

PV = "3.14.1.0"

RPM_NAME = "ghc-cabal-install-solver-prof-3.14.1.0-2.3.aarch64.rpm"
RPM_HASH = "fd4ca420d6ea8f3c9ce0f23bc60ce0cc2917b3aa5c2f11e2284d1631282556785af86601e90fe590a3b9325711f62a9a4742abbd2ad966182b9ac1d760dbf250"

RPROVIDES:${PN} += "ghc-cabal-install-solver-prof \
ghc-prof-cabal-install-solver-3.14.1.0-FwXkmWLb7x8K0OTcy9OfwR"

RDEPENDS:${PN} += "ghc-cabal-install-solver-devel \
ghc-prof-Cabal-3.14.2.0-f8f4 \
ghc-prof-Cabal-syntax-3.14.2.0-5c2f \
ghc-prof-array-0.5.8.0-2a42 \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-directory-1.3.10.1-b1d7 \
ghc-prof-edit-distance-0.2.2.1-JLsBE1yu1uvGNk4hnNxFMI \
ghc-prof-filepath-1.5.5.0-b25b \
ghc-prof-mtl-2.3.2-37ef \
ghc-prof-network-uri-2.6.4.2-BA29PoG9pX1EAcGKolsVh8 \
ghc-prof-pretty-1.1.3.6-b7fd \
ghc-prof-text-2.1.4-cf23 \
ghc-prof-transformers-0.6.3.0-4709"

inherit rpm
