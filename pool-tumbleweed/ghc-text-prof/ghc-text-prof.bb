SUMMARY = "Haskell text profiling library"
DESCRIPTION = "This package provides the Haskell text profiling library."
LICENSE = "BSD-3-Clause"

PV = "2.1.4"

RPM_NAME = "ghc-text-prof-2.1.4-1.3.aarch64.rpm"
RPM_HASH = "e379412baac9e0c057d361bf2e4f77b570bcd62857bffa3c6dae5ec5cf5d82f2198edd7da6bc361f6dd9bf787aed7e7a5f69bf5b22009205868617ad55b83acf"

RPROVIDES:${PN} += "ghc-prof-text-2.1.4-cf23 \
ghc-text-prof \
libHStext-2.1.4-cf23-p-ghc9.12.4.so"

RDEPENDS:${PN} += "ghc-prof-array-0.5.8.0-2a42 \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-binary-0.8.9.3-9861 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-deepseq-1.5.1.0-1350 \
ghc-prof-ghc-prim-0.13.0-f55c \
ghc-prof-template-haskell-2.23.0.0-358a \
ghc-text-devel \
libHSarray-0.5.8.0-2a42-p-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-p-ghc9.12.4.so \
libHSbinary-0.8.9.3-9861-p-ghc9.12.4.so \
libHSbytestring-0.12.2.0-65be-p-ghc9.12.4.so \
libHScontainers-0.7-d5e1-p-ghc9.12.4.so \
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
