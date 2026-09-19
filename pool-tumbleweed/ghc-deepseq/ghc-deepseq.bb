SUMMARY = "Haskell deepseq library"
DESCRIPTION = "This package provides the Haskell deepseq library."
LICENSE = "BSD-3-Clause"

PV = "1.5.1.0"

RPM_NAME = "ghc-deepseq-1.5.1.0-1.3.aarch64.rpm"
RPM_HASH = "d9028d2c638b48d7e877b5c443ed82a3b2917d032aad2d6c56baa31a22327f2198e4598c577433e8b717ae6450388210f3105507743f7554605d93ed8d25598a"

RPROVIDES:${PN} += "ghc-deepseq \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
