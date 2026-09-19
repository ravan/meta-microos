SUMMARY = "Lua module to work with version specifiers"
DESCRIPTION = "Wrapper for the Data.Version.Version Haskell type."
LICENSE = "MIT"

PV = "1.2.0.1"

RPM_NAME = "ghc-hslua-module-version-1.2.0.1-1.2.aarch64.rpm"
RPM_HASH = "5fed6a87b431a5132360f5f77e2d6f12c54d6cdad74920a2f0f385922c68c4984148cef7a71013346baa3bc616659794727725b3fd2835030b6cb775364d3cf2"

RPROVIDES:${PN} += "ghc-hslua-module-version \
libHShslua-module-version-1.2.0.1-7Ta1Mn5URCJ9Pe3cHjwQh-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSarray-0.5.8.0-2a42-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSbinary-0.8.9.3-9861-ghc9.12.4.so \
libHSbytestring-0.12.2.0-65be-ghc9.12.4.so \
libHScontainers-0.7-d5e1-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSexceptions-0.10.12-f655-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-boot-th-9.12.4-0605-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHShslua-core-2.3.2.1-GIcwwMIDhKVEx4MlcixfFr-ghc9.12.4.so \
libHShslua-marshalling-2.3.2-4wJit3DV8Bh1LNaOjZB33o-ghc9.12.4.so \
libHShslua-objectorientation-2.5.0-AcxldFWfxGy5q661VAPLGF-ghc9.12.4.so \
libHShslua-packaging-2.4.1-1RYRM22n0e3FXJMrP5sdLA-ghc9.12.4.so \
libHShslua-typing-0.2.0-HwVvWDb2JBKBM3T8rZUuAT-ghc9.12.4.so \
libHSlua-2.3.4-GxTlN73bN8C8KbBhVEtsew-ghc9.12.4.so \
libHSmtl-2.3.2-37ef-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libHSstm-2.5.3.1-6d74-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libHStext-2.1.4-cf23-ghc9.12.4.so \
libHStransformers-0.6.3.0-4709-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
