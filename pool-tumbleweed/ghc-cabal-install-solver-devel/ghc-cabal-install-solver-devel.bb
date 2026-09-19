SUMMARY = "Haskell cabal-install-solver library development files"
DESCRIPTION = "This package provides the Haskell cabal-install-solver library development \
files."
LICENSE = "BSD-3-Clause"

PV = "3.14.1.0"

RPM_NAME = "ghc-cabal-install-solver-devel-3.14.1.0-2.3.aarch64.rpm"
RPM_HASH = "5c6b06c0fb47b33bb6f47365ebd63989b04159dd1d23da1d16a12ebe73af301f1f50e4e74eb0095e3fb02db5b33688e9c6106f2f5269b65230a28a4b9f9e95b3"

RPROVIDES:${PN} += "ghc-cabal-install-solver-devel \
ghc-devel-cabal-install-solver-3.14.1.0-FwXkmWLb7x8K0OTcy9OfwR"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-cabal-install-solver \
ghc-compiler \
ghc-devel-Cabal-3.14.2.0-f8f4 \
ghc-devel-Cabal-syntax-3.14.2.0-5c2f \
ghc-devel-array-0.5.8.0-2a42 \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-directory-1.3.10.1-b1d7 \
ghc-devel-edit-distance-0.2.2.1-JLsBE1yu1uvGNk4hnNxFMI \
ghc-devel-filepath-1.5.5.0-b25b \
ghc-devel-mtl-2.3.2-37ef \
ghc-devel-network-uri-2.6.4.2-BA29PoG9pX1EAcGKolsVh8 \
ghc-devel-pretty-1.1.3.6-b7fd \
ghc-devel-text-2.1.4-cf23 \
ghc-devel-transformers-0.6.3.0-4709"

inherit rpm
