SUMMARY = "Lightweight package providing commonly useful parser combinators"
DESCRIPTION = "Lightweight package providing commonly useful parser combinators."
LICENSE = "BSD-3-Clause"

PV = "1.3.1"

RPM_NAME = "ghc-parser-combinators-1.3.1-1.2.aarch64.rpm"
RPM_HASH = "5995976f2fad24b523089b43057bf71ac1495d710a5a7b923009f5bc9cc17ec0c1c88d5eb95ed44388d3f8506327280163e9702bc29f4f387c1160f73fb436ec"

RPROVIDES:${PN} += "ghc-parser-combinators \
libHSparser-combinators-1.3.1-L2vTYvTgTG7FdcDqlc42x9-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
