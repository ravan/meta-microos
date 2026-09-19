SUMMARY = "Haskell memory profiling library"
DESCRIPTION = "This package provides the Haskell memory profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.18.0"

RPM_NAME = "ghc-memory-prof-0.18.0-3.14.aarch64.rpm"
RPM_HASH = "74785482b37ce240e22f2eafb657e46705610fd4a5ad743d931eddee45ff46822ae0666ba0d2326e004c33883f1e042aad35224d50ef200631b5c82512e87b59"

RPROVIDES:${PN} += "ghc-memory-prof \
ghc-prof-memory-0.18.0-4OCVGiXkS6t9StTfiwlZlu"

RDEPENDS:${PN} += "ghc-memory-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-basement-0.0.16-EFfarL5MHPIHNlTrgpSdN2 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-deepseq-1.5.1.0-1350 \
ghc-prof-ghc-prim-0.13.0-f55c"

inherit rpm
