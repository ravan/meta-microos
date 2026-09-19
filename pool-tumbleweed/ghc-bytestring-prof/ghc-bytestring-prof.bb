SUMMARY = "Haskell bytestring profiling library"
DESCRIPTION = "This package provides the Haskell bytestring profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.12.2.0"

RPM_NAME = "ghc-bytestring-prof-0.12.2.0-1.3.aarch64.rpm"
RPM_HASH = "8f203d400d942dd4c6fb0098986ac588caeeec970cd34eb8d5cf0e5b9f65cfbc17f32353d1ecd1efafaa3ed7295d356306d6c1b4c9ab0a9d3052437dd22fa002"

RPROVIDES:${PN} += "ghc-bytestring-prof \
ghc-prof-bytestring-0.12.2.0-65be \
libHSbytestring-0.12.2.0-65be-p-ghc9.12.4.so"

RDEPENDS:${PN} += "ghc-bytestring-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-deepseq-1.5.1.0-1350 \
ghc-prof-ghc-prim-0.13.0-f55c \
ghc-prof-template-haskell-2.23.0.0-358a \
libHSbase-4.21.2.0-8844-p-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-p-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-p-ghc9.12.4.so \
libHSghc-boot-th-9.12.4-0605-p-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-p-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-p-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-p-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-p-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
