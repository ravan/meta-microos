SUMMARY = "Haskell time profiling library"
DESCRIPTION = "This package provides the Haskell time profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.14"

RPM_NAME = "ghc-time-prof-1.14-1.3.aarch64.rpm"
RPM_HASH = "85ab8cd818143b97fbded0834cee95e5959034981fc6743d599ffa2afb5fb22eddd9e0c98ead90004119408174592e2752af44599fc06257231b0c0955bcd31c"

RPROVIDES:${PN} += "ghc-prof-time-1.14-a7dc \
ghc-time-prof \
libHStime-1.14-a7dc-p-ghc9.12.4.so"

RDEPENDS:${PN} += "ghc-prof-base-4.21.2.0-8844 \
ghc-prof-deepseq-1.5.1.0-1350 \
ghc-prof-template-haskell-2.23.0.0-358a \
ghc-time-devel \
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
