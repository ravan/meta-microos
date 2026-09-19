SUMMARY = "Haskell bytestring library development files"
DESCRIPTION = "This package provides the Haskell bytestring library development files."
LICENSE = "BSD-3-Clause"

PV = "0.12.2.0"

RPM_NAME = "ghc-bytestring-devel-0.12.2.0-1.3.aarch64.rpm"
RPM_HASH = "fe1481446ca34c19512ae84bdc0aa0be2f3e819c4a660b090113fc8978f5ebf7e8f1163b53cc1d643e76cf8313d8edac8c2d23ea6afa9b997e157102f648d478"

RPROVIDES:${PN} += "ghc-bytestring-devel \
ghc-bytestring-static \
ghc-devel-bytestring-0.12.2.0-65be"

RDEPENDS:${PN} += "ghc-bytestring \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-deepseq-1.5.1.0-1350 \
ghc-devel-ghc-prim-0.13.0-f55c \
ghc-devel-template-haskell-2.23.0.0-358a"

inherit rpm
