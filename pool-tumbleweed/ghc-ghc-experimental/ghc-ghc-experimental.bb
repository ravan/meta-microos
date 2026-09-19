SUMMARY = "Haskell ghc-experimental library"
DESCRIPTION = "This package provides the Haskell ghc-experimental library."
LICENSE = "BSD-3-Clause"

PV = "9.1204.0"

RPM_NAME = "ghc-ghc-experimental-9.1204.0-1.3.aarch64.rpm"
RPM_HASH = "0cdf746845bc47b9319a3bc3578bfd67a1a54657f4d06fc98c7c0fa40278db19188c45eab0a2a4ae6c51ccf3461ab542d3a592603cc7c31d3182331f3e66c17f"

RPROVIDES:${PN} += "ghc-ghc-experimental \
libHSghc-experimental-9.1204.0-a6a5-ghc9.12.4.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
