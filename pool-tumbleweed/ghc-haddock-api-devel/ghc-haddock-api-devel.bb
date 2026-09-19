SUMMARY = "Haskell haddock-api library development files"
DESCRIPTION = "This package provides the Haskell haddock-api library development files."
LICENSE = "BSD-3-Clause"

PV = "2.32.0"

RPM_NAME = "ghc-haddock-api-devel-2.32.0-1.3.aarch64.rpm"
RPM_HASH = "d56e42b30ddca163591c761f91c39db4e4c0331a922ae5a0c8e56e1b438ab7260a80c0703279fa8e1595aa607d0a88312ad0833cdc7643e3a699cce1ce68be0a"

RPROVIDES:${PN} += "ghc-devel-haddock-api-2.32.0-a85f \
ghc-haddock-api-devel \
ghc-haddock-api-static"

RDEPENDS:${PN} += "ghc-compiler \
ghc-devel-array-0.5.8.0-2a42 \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-deepseq-1.5.1.0-1350 \
ghc-devel-directory-1.3.10.1-b1d7 \
ghc-devel-exceptions-0.10.12-f655 \
ghc-devel-filepath-1.5.5.0-b25b \
ghc-devel-ghc-9.12.4-ced2 \
ghc-devel-ghc-boot-9.12.4-a5b3 \
ghc-devel-haddock-library-1.11.0-799c \
ghc-devel-mtl-2.3.2-37ef \
ghc-devel-parsec-3.1.18.0-be05 \
ghc-devel-transformers-0.6.3.0-4709 \
ghc-devel-unix-2.8.8.0-178a \
ghc-devel-xhtml-3000.2.2.1-fadd \
ghc-haddock-api"

inherit rpm
