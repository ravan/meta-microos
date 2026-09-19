SUMMARY = "Haskell containers profiling library"
DESCRIPTION = "This package provides the Haskell containers profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.7"

RPM_NAME = "ghc-containers-prof-0.7-1.3.aarch64.rpm"
RPM_HASH = "acc13aab221c1c1434f354e5cc0328a8dc23713f30f596e95f7d75304cc6aeca5b46bba68e05546b8e1448160c08bf2bf1379c9a4551d6ac00e6904b170cddee"

RPROVIDES:${PN} += "ghc-containers-prof \
ghc-prof-containers-0.7-d5e1 \
libHScontainers-0.7-d5e1-p-ghc9.12.4.so"

RDEPENDS:${PN} += "ghc-containers-devel \
ghc-prof-array-0.5.8.0-2a42 \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-deepseq-1.5.1.0-1350 \
ghc-prof-template-haskell-2.23.0.0-358a \
libHSarray-0.5.8.0-2a42-p-ghc9.12.4.so \
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
