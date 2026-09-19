SUMMARY = "Object orientation tools for HsLua"
DESCRIPTION = "Expose Haskell objects to Lua with an object oriented interface."
LICENSE = "MIT"

PV = "2.5.0"

RPM_NAME = "ghc-hslua-objectorientation-2.5.0-1.3.aarch64.rpm"
RPM_HASH = "94cb8f24c785de37c036a2cc9e5727e38749a9982c99b0988d2da693222246cc734541d626d5468e13969ebfdbf507ea69ef57fd1da22c388cd029a4799ca449"

RPROVIDES:${PN} += "ghc-hslua-objectorientation \
libHShslua-objectorientation-2.5.0-AcxldFWfxGy5q661VAPLGF-ghc9.12.4.so"

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
