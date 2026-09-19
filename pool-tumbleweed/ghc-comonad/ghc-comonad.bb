SUMMARY = "Comonads"
DESCRIPTION = "Comonads."
LICENSE = "BSD-2-Clause"

PV = "5.0.10"

RPM_NAME = "ghc-comonad-5.0.10-1.3.aarch64.rpm"
RPM_HASH = "d7723e77da61b4c02adf97dede793d8a6d9796b791626e8c315e39f95355d9b73a4a0ee0097b5bdf1c278b83036965f70dfa59fe09874e22a15b76dc901bf454"

RPROVIDES:${PN} += "ghc-comonad \
libHScomonad-5.0.10-Adp50yscRn74SK6wUdL7QP-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSarray-0.5.8.0-2a42-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHScontainers-0.7-d5e1-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSdistributive-0.6.3-9lg1Hxwh2KlJVxh3zQCgyL-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-boot-th-9.12.4-0605-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHSindexed-traversable-0.1.5-JylwuAInS9n4ImeZ4JChDW-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libHStagged-0.8.10-H6Ef5dd4ktu4CIJjtjtwM7-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libHStransformers-0.6.3.0-4709-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
