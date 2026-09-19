SUMMARY = "Haskell ghc-internal profiling library"
DESCRIPTION = "This package provides the Haskell ghc-internal profiling library."
LICENSE = "BSD-3-Clause"

PV = "9.1204.0"

RPM_NAME = "ghc-ghc-internal-prof-9.1204.0-1.3.aarch64.rpm"
RPM_HASH = "459fd135c33cb52ccacdcfebb730713d2d94e72fd27b28033984c2b666de28a48d608893b01d785e061d43cd75ecee3d9685cda47c90635e805c1f175d812c8b"

RPROVIDES:${PN} += "ghc-ghc-internal-prof \
ghc-prof-ghc-internal-9.1204.0-f1e1 \
libHSghc-internal-9.1204.0-f1e1-p-ghc9.12.4.so"

RDEPENDS:${PN} += "ghc-ghc-internal-devel \
ghc-prof-ghc-bignum-1.3-03b0 \
ghc-prof-ghc-prim-0.13.0-f55c \
ghc-prof-rts-1.0.3 \
libHSghc-bignum-1.3-03b0-p-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-p-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
