SUMMARY = "Profunctors"
DESCRIPTION = "Profunctors."
LICENSE = "BSD-3-Clause"

PV = "5.6.3"

RPM_NAME = "ghc-profunctors-5.6.3-1.11.aarch64.rpm"
RPM_HASH = "b9a2897229207503e06e978eaa7136df83c356c52f8d7a7b4e4f34737f74215ede2b00d543b9dd108a4205e17fb5b3b132c19b06e0fd8050a8530e0a2539e85b"

RPROVIDES:${PN} += "ghc-profunctors \
libHSprofunctors-5.6.3-CPqBm5VgzT9DSAiXWxFcrG-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSStateVar-1.2.2-Fp8KJyjTxyjFvIxRBzfDbA-ghc9.12.4.so \
libHSarray-0.5.8.0-2a42-ghc9.12.4.so \
libHSassoc-1.1.1-7ZKlIzFkmc1FQCJcpfYrTi-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSbase-orphans-0.9.4-2vMgOxDXOniBrPCxqNGyGO-ghc9.12.4.so \
libHSbifunctors-5.6.3-9Dfko6C8LIIe8HG4zoeag-ghc9.12.4.so \
libHScomonad-5.0.10-Adp50yscRn74SK6wUdL7QP-ghc9.12.4.so \
libHScontainers-0.7-d5e1-ghc9.12.4.so \
libHScontravariant-1.5.6-7FVTzec2jegEwzkeRkQOi4-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSdistributive-0.6.3-9lg1Hxwh2KlJVxh3zQCgyL-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-boot-th-9.12.4-0605-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHSindexed-traversable-0.1.5-JylwuAInS9n4ImeZ4JChDW-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libHSstm-2.5.3.1-6d74-ghc9.12.4.so \
libHStagged-0.8.10-H6Ef5dd4ktu4CIJjtjtwM7-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libHSth-abstraction-0.7.2.0-LVMuWnluhDI5se4FHUInw7-ghc9.12.4.so \
libHStransformers-0.6.3.0-4709-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
