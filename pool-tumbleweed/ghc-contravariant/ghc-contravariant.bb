SUMMARY = "Contravariant functors"
DESCRIPTION = "Contravariant functors."
LICENSE = "BSD-3-Clause"

PV = "1.5.6"

RPM_NAME = "ghc-contravariant-1.5.6-1.3.aarch64.rpm"
RPM_HASH = "3cf285a9effafc79e40868278c687fb3c661aafcd62e097e5dc0315b878feefa0b96e2ab9c2bdca71dbcb3065a2878b31c5f7d79423fef7ab8f653b9dfb2e50b"

RPROVIDES:${PN} += "ghc-contravariant \
libHScontravariant-1.5.6-7FVTzec2jegEwzkeRkQOi4-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSStateVar-1.2.2-Fp8KJyjTxyjFvIxRBzfDbA-ghc9.12.4.so \
libHSarray-0.5.8.0-2a42-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHSstm-2.5.3.1-6d74-ghc9.12.4.so \
libHStransformers-0.6.3.0-4709-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
