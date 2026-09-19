SUMMARY = "Monad morphisms"
DESCRIPTION = "This library provides monad morphism utilities, most commonly used for \
manipulating monad transformer stacks."
LICENSE = "BSD-3-Clause"

PV = "1.2.2"

RPM_NAME = "ghc-mmorph-1.2.2-1.3.aarch64.rpm"
RPM_HASH = "d9b5db661debff9420face675e2acfdb5da8eea775d389c55f55fc1d62a7bf429f39cd4aff130e304ff78bb4d5931d4ff53cc8ea4b2725dd221fb4747909a799"

RPROVIDES:${PN} += "ghc-mmorph \
libHSmmorph-1.2.2-8rdXPOqza0cFiQFk7Wz51h-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHSmtl-2.3.2-37ef-ghc9.12.4.so \
libHStransformers-0.6.3.0-4709-ghc9.12.4.so \
libHStransformers-compat-0.7.2-Je4epVh1rXP8zT22dFNkMW-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
