SUMMARY = "Haskell implementation of the Unicode Collation Algorithm"
DESCRIPTION = "This library provides a pure Haskell implementation of the Unicode Collation \
Algorithm described at <http://www.unicode.org/reports/tr10/>. It is not as \
fully-featured or as performant as 'text-icu', but it avoids a dependency on a \
large C library. Locale-specific tailorings are also provided."
LICENSE = "BSD-2-Clause"

PV = "0.1.3.7"

RPM_NAME = "ghc-unicode-collation-0.1.3.7-1.3.aarch64.rpm"
RPM_HASH = "25dc21f016dd5bdb3ddffa96db2767fd9b05620d80ac6db635f57f8db175a202bea5d1a2d5aad529a46fee2d5e9c81a27af5667d46c94bbdb981a0159a4b0b0e"

RPROVIDES:${PN} += "ghc-unicode-collation \
libHSunicode-collation-0.1.3.7-15abqneWG6p19BxNVdLS7C-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSarray-0.5.8.0-2a42-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSbinary-0.8.9.3-9861-ghc9.12.4.so \
libHSbytestring-0.12.2.0-65be-ghc9.12.4.so \
libHScontainers-0.7-d5e1-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-boot-th-9.12.4-0605-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHSmtl-2.3.2-37ef-ghc9.12.4.so \
libHSparsec-3.1.18.0-be05-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libHSprimitive-0.9.1.0-Ez30Vu7tivmF28X1123Css-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libHStext-2.1.4-cf23-ghc9.12.4.so \
libHSth-abstraction-0.7.2.0-LVMuWnluhDI5se4FHUInw7-ghc9.12.4.so \
libHSth-lift-0.8.7-C08bSURuEXt2IuYgZMzZEc-ghc9.12.4.so \
libHSth-lift-instances-0.1.20-A0nCC2bmuVRHGZj0nSUeyw-ghc9.12.4.so \
libHStransformers-0.6.3.0-4709-ghc9.12.4.so \
libHSvector-0.13.2.0-F8givqpU8HnLN0O3dVdeWE-ghc9.12.4.so \
libHSvector-stream-0.1.0.1-FXRnPnZDT7tJ4JCMEuh1XF-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
