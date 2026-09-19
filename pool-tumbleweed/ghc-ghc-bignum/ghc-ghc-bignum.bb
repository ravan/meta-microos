SUMMARY = "Haskell ghc-bignum library"
DESCRIPTION = "This package provides the Haskell ghc-bignum library."
LICENSE = "BSD-3-Clause"

PV = "1.3"

RPM_NAME = "ghc-ghc-bignum-1.3-1.3.aarch64.rpm"
RPM_HASH = "af0925103ba7caa405275e3baba4d6e66691d7544c401af8a8e590da01882decf08bc653380e94a3136811b8642e48669c2233afd684c3526d531cf7149ce4e7"

RPROVIDES:${PN} += "ghc-ghc-bignum \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
