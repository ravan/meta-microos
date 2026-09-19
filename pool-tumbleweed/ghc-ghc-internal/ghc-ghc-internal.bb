SUMMARY = "Haskell ghc-internal library"
DESCRIPTION = "This package provides the Haskell ghc-internal library."
LICENSE = "BSD-3-Clause"

PV = "9.1204.0"

RPM_NAME = "ghc-ghc-internal-9.1204.0-1.3.aarch64.rpm"
RPM_HASH = "9af38ed8f96cc2cc51a61d7309f2dff74de3e59405b45b22015d9a893d92f532c896857e427db0654e85185c7c2800d0148eea82505c74af8d65cfb165c6c750"

RPROVIDES:${PN} += "ghc-ghc-internal \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
