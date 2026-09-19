SUMMARY = "Haskell haddock-library profiling library"
DESCRIPTION = "This package provides the Haskell haddock-library profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.11.0"

RPM_NAME = "ghc-haddock-library-prof-1.11.0-1.3.aarch64.rpm"
RPM_HASH = "818f7119463afd3e537d34ba0126abc12f2eea21cbfff8364d52e9b97b23a162dd4900d600212d535b486cce9d331670466cd60a89ccc3a1663e032fb453f573"

RPROVIDES:${PN} += "ghc-haddock-library-prof \
ghc-prof-haddock-library-1.11.0-799c \
libHShaddock-library-1.11.0-799c-p-ghc9.12.4.so"

RDEPENDS:${PN} += "ghc-haddock-library-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-parsec-3.1.18.0-be05 \
ghc-prof-text-2.1.4-cf23 \
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
libHSmtl-2.3.2-37ef-p-ghc9.12.4.so \
libHSparsec-3.1.18.0-be05-p-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-p-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-p-ghc9.12.4.so \
libHStext-2.1.4-cf23-p-ghc9.12.4.so \
libHStransformers-0.6.3.0-4709-p-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
