SUMMARY = "Haskell Cabal-syntax library development files"
DESCRIPTION = "This package provides the Haskell Cabal-syntax library development files."
LICENSE = "BSD-3-Clause"

PV = "3.14.2.0"

RPM_NAME = "ghc-Cabal-syntax-devel-3.14.2.0-1.3.aarch64.rpm"
RPM_HASH = "022f64f39f361806a867c78bf10a7250bc1c05d7c28556982d30c8136873fc9b6e3f996eac150922cb994a3bea192b3376a0929e7288b047be7fb840e84478e0"

RPROVIDES:${PN} += "ghc-Cabal-syntax-devel \
ghc-Cabal-syntax-static \
ghc-devel-Cabal-syntax-3.14.2.0-5c2f"

RDEPENDS:${PN} += "ghc-Cabal-syntax \
ghc-compiler \
ghc-devel-array-0.5.8.0-2a42 \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-binary-0.8.9.3-9861 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-deepseq-1.5.1.0-1350 \
ghc-devel-directory-1.3.10.1-b1d7 \
ghc-devel-filepath-1.5.5.0-b25b \
ghc-devel-mtl-2.3.2-37ef \
ghc-devel-parsec-3.1.18.0-be05 \
ghc-devel-pretty-1.1.3.6-b7fd \
ghc-devel-text-2.1.4-cf23 \
ghc-devel-time-1.14-a7dc \
ghc-devel-transformers-0.6.3.0-4709"

inherit rpm
