SUMMARY = "Haskell Cabal library development files"
DESCRIPTION = "This package provides the Haskell Cabal library development files."
LICENSE = "BSD-3-Clause"

PV = "3.14.2.0"

RPM_NAME = "ghc-Cabal-devel-3.14.2.0-1.3.aarch64.rpm"
RPM_HASH = "2c4c3738096d4e4e02824cf4afdcd5af6fe357cbbb8792769c53452b4e6677e7a07ab28faf49a3251c72ad1215898259020e4ade0a9b30ff8f542aa307c6e24d"

RPROVIDES:${PN} += "ghc-Cabal-devel \
ghc-Cabal-static \
ghc-devel-Cabal-3.14.2.0-f8f4"

RDEPENDS:${PN} += "ghc-Cabal \
ghc-compiler \
ghc-devel-Cabal-syntax-3.14.2.0-5c2f \
ghc-devel-array-0.5.8.0-2a42 \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-deepseq-1.5.1.0-1350 \
ghc-devel-directory-1.3.10.1-b1d7 \
ghc-devel-filepath-1.5.5.0-b25b \
ghc-devel-mtl-2.3.2-37ef \
ghc-devel-parsec-3.1.18.0-be05 \
ghc-devel-pretty-1.1.3.6-b7fd \
ghc-devel-process-1.6.26.1-905d \
ghc-devel-time-1.14-a7dc \
ghc-devel-transformers-0.6.3.0-4709 \
ghc-devel-unix-2.8.8.0-178a"

inherit rpm
