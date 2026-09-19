SUMMARY = "Haskell terminfo library"
DESCRIPTION = "This package provides the Haskell terminfo library."
LICENSE = "BSD-3-Clause"

PV = "0.4.1.7"

RPM_NAME = "ghc-terminfo-0.4.1.7-1.3.aarch64.rpm"
RPM_HASH = "30f729662877699e06472d0d0e90d6c3599dc284dbee2e0da0cc1e7f22d5e29d40164c787d8268ddce8effe52cf2ff56772ac7dcb43ed14fae4baa28bbad4c6a"

RPROVIDES:${PN} += "ghc-terminfo \
libHSterminfo-0.4.1.7-3afa-ghc9.12.4.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libtinfo.so.6"

inherit rpm
