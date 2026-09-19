SUMMARY = "Collection Haskell 98 bifunctors, bifoldables and bitraversables"
DESCRIPTION = "Bifunctor, bifoldable, and bitraversable instances for Haskell 98."
LICENSE = "BSD-2-Clause"

PV = "5.6.3"

RPM_NAME = "ghc-bifunctors-5.6.3-1.3.aarch64.rpm"
RPM_HASH = "4b2df79fb37540368b78a6ae9c93919fa9bc363ba56e5793253ebeb114d28cf836b0984b8f45b800c8f2fb00cc2e404841be68294274fd0a6c2b1f14ec2c6cc8"

RPROVIDES:${PN} += "ghc-bifunctors \
libHSbifunctors-5.6.3-9Dfko6C8LIIe8HG4zoeag-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSarray-0.5.8.0-2a42-ghc9.12.4.so \
libHSassoc-1.1.1-7ZKlIzFkmc1FQCJcpfYrTi-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHScomonad-5.0.10-Adp50yscRn74SK6wUdL7QP-ghc9.12.4.so \
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
libHSth-abstraction-0.7.2.0-LVMuWnluhDI5se4FHUInw7-ghc9.12.4.so \
libHStransformers-0.6.3.0-4709-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
