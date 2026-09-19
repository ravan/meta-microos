SUMMARY = "Manipulating Haskell source: abstract syntax, lexer, parser, and pretty-printer"
DESCRIPTION = "Haskell-Source with Extensions (HSE, haskell-src-exts) is a standalone parser \
for Haskell. In addition to standard Haskell, all extensions implemented in GHC \
are supported. \
 \
Apart from these standard extensions, it also handles regular patterns as per \
the HaRP extension as well as HSX-style embedded XML syntax."
LICENSE = "BSD-3-Clause"

PV = "1.23.1"

RPM_NAME = "ghc-haskell-src-exts-1.23.1-1.14.aarch64.rpm"
RPM_HASH = "6b1c78728ac4e6eff8ca38bd272faef25eba5b24f52a648b2c1ccf4d3e3ed8f14e42210821c553062c094ff761e23a0080c288aba2de6fa4730e12dff2f95ba7"

RPROVIDES:${PN} += "ghc-haskell-src-exts \
libHShaskell-src-exts-1.23.1-2QXJ6YmpNBDADgPssiT27j-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSarray-0.5.8.0-2a42-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
