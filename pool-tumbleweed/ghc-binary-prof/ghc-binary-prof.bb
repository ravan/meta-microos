SUMMARY = "Haskell binary profiling library"
DESCRIPTION = "This package provides the Haskell binary profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.8.9.3"

RPM_NAME = "ghc-binary-prof-0.8.9.3-1.3.aarch64.rpm"
RPM_HASH = "95b4498a4a68f194887f3b3857c9a4b0235181ff03cd86cab30c31e400277786275ca0d9114719122d8dd459d1b71a45a935579365d028e78d6583dd5ce3b6ad"

RPROVIDES:${PN} += "ghc-binary-prof \
ghc-prof-binary-0.8.9.3-9861 \
libHSbinary-0.8.9.3-9861-p-ghc9.12.4.so"

RDEPENDS:${PN} += "ghc-binary-devel \
ghc-prof-array-0.5.8.0-2a42 \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-containers-0.7-d5e1 \
libHSarray-0.5.8.0-2a42-p-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-p-ghc9.12.4.so \
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
