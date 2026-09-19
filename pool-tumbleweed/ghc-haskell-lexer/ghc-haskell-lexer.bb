SUMMARY = "A fully compliant Haskell 98 lexer"
DESCRIPTION = "A fully compliant Haskell 98 lexer."
LICENSE = "MIT"

PV = "1.2.1"

RPM_NAME = "ghc-haskell-lexer-1.2.1-1.6.aarch64.rpm"
RPM_HASH = "8b98e14fab07893de25ecbe5333be04b7a376d6e374a1d1baade054c7a77fb9b47561fdab73aba467d5bc09f32de640f2d1b27be10b7c81713bcf5a2a1911ad7"

RPROVIDES:${PN} += "ghc-haskell-lexer \
libHShaskell-lexer-1.2.1-4PpJ3cUTICwEJqFuz43JwQ-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
