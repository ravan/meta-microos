SUMMARY = "Haskell pretty profiling library"
DESCRIPTION = "This package provides the Haskell pretty profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.1.3.6"

RPM_NAME = "ghc-pretty-prof-1.1.3.6-1.3.aarch64.rpm"
RPM_HASH = "43edd07d737d422dec6eea0ad5703f3aeecea9e2a09f08d28702bab22f9d966d22b8b4fd51b270cd43c84867915df3e7fa5dd48d770362004589af589a1205de"

RPROVIDES:${PN} += "ghc-pretty-prof \
ghc-prof-pretty-1.1.3.6-b7fd \
libHSpretty-1.1.3.6-b7fd-p-ghc9.12.4.so"

RDEPENDS:${PN} += "ghc-pretty-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-deepseq-1.5.1.0-1350 \
ghc-prof-ghc-prim-0.13.0-f55c \
libHSbase-4.21.2.0-8844-p-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-p-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-p-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-p-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-p-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
