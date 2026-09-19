SUMMARY = "Haskell ghc-compact profiling library"
DESCRIPTION = "This package provides the Haskell ghc-compact profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.0.0"

RPM_NAME = "ghc-ghc-compact-prof-0.1.0.0-1.3.aarch64.rpm"
RPM_HASH = "294cbdd9c774406f380d7504f67314667a93a68e13f2c4c813255c03897bf7328ffad24c75cbbce98cee94e89acd8c2b2f31d11ff912f2f5e824f1ac3896ddc7"

RPROVIDES:${PN} += "ghc-ghc-compact-prof \
ghc-prof-ghc-compact-0.1.0.0-bdec \
libHSghc-compact-0.1.0.0-bdec-p-ghc9.12.4.so"

RDEPENDS:${PN} += "ghc-ghc-compact-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-ghc-prim-0.13.0-f55c \
libHSbase-4.21.2.0-8844-p-ghc9.12.4.so \
libHSbytestring-0.12.2.0-65be-p-ghc9.12.4.so \
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
