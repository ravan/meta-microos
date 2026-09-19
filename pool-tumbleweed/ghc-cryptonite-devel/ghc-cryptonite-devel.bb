SUMMARY = "Haskell cryptonite library development files"
DESCRIPTION = "This package provides the Haskell cryptonite library development files."
LICENSE = "BSD-3-Clause"

PV = "0.30"

RPM_NAME = "ghc-cryptonite-devel-0.30-2.36.aarch64.rpm"
RPM_HASH = "f426fa036946ebf999d8bc39a7799f2668520a784345cdf472d57200ad7e18223b8f6bbbfb17c40cdd75ff97d874841de88ba4a615591fa3393ba987fbd4ac9e"

RPROVIDES:${PN} += "ghc-cryptonite-devel \
ghc-devel-cryptonite-0.30-LDHPOjDfFNPE9tRl2y8VSO"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-cryptonite \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-basement-0.0.16-EFfarL5MHPIHNlTrgpSdN2 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-deepseq-1.5.1.0-1350 \
ghc-devel-ghc-prim-0.13.0-f55c \
ghc-devel-integer-gmp-1.1-09fd \
ghc-devel-memory-0.18.0-4OCVGiXkS6t9StTfiwlZlu \
glibc-devel"

inherit rpm
