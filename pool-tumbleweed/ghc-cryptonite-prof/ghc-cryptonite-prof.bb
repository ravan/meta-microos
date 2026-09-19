SUMMARY = "Haskell cryptonite profiling library"
DESCRIPTION = "This package provides the Haskell cryptonite profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.30"

RPM_NAME = "ghc-cryptonite-prof-0.30-2.36.aarch64.rpm"
RPM_HASH = "bad6742e588ef714d63120065bc76d00085c9c97aeb93875f12da5b92d26f758637192abec3299a988cb91c92aaa1a659cae99a6096f04a21060342318e7ffdc"

RPROVIDES:${PN} += "ghc-cryptonite-prof \
ghc-prof-cryptonite-0.30-LDHPOjDfFNPE9tRl2y8VSO"

RDEPENDS:${PN} += "ghc-cryptonite-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-basement-0.0.16-EFfarL5MHPIHNlTrgpSdN2 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-deepseq-1.5.1.0-1350 \
ghc-prof-ghc-prim-0.13.0-f55c \
ghc-prof-integer-gmp-1.1-09fd \
ghc-prof-memory-0.18.0-4OCVGiXkS6t9StTfiwlZlu"

inherit rpm
