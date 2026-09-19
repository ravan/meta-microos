SUMMARY = "Haskell exceptions profiling library"
DESCRIPTION = "This package provides the Haskell exceptions profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.10.12"

RPM_NAME = "ghc-exceptions-prof-0.10.12-1.3.aarch64.rpm"
RPM_HASH = "ede2c0f871d2cb3c984b923c9d50746a98e0d49fcc2a834db1d021f099f3b90adcd38544755866ce22e9760c062dbc426c5d2fc44f0cbd3d1afb6ccc51f2676e"

RPROVIDES:${PN} += "ghc-exceptions-prof \
ghc-prof-exceptions-0.10.12-f655 \
libHSexceptions-0.10.12-f655-p-ghc9.12.4.so"

RDEPENDS:${PN} += "ghc-exceptions-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-mtl-2.3.2-37ef \
ghc-prof-stm-2.5.3.1-6d74 \
ghc-prof-template-haskell-2.23.0.0-358a \
ghc-prof-transformers-0.6.3.0-4709 \
libHSarray-0.5.8.0-2a42-p-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-p-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-p-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-p-ghc9.12.4.so \
libHSghc-boot-th-9.12.4-0605-p-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-p-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-p-ghc9.12.4.so \
libHSmtl-2.3.2-37ef-p-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-p-ghc9.12.4.so \
libHSstm-2.5.3.1-6d74-p-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-p-ghc9.12.4.so \
libHStransformers-0.6.3.0-4709-p-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
