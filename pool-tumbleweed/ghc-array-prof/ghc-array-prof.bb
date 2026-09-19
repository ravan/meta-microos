SUMMARY = "Haskell array profiling library"
DESCRIPTION = "This package provides the Haskell array profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.5.8.0"

RPM_NAME = "ghc-array-prof-0.5.8.0-1.3.aarch64.rpm"
RPM_HASH = "2152810bb895dce004773007ce0a1d1a2fc67251bce43bb0c431ebfc87651bb9a8a174e1cb9590a98789d36b29ca819f87bfcc326b13630e2b2f90056f2fa8a7"

RPROVIDES:${PN} += "ghc-array-prof \
ghc-prof-array-0.5.8.0-2a42 \
libHSarray-0.5.8.0-2a42-p-ghc9.12.4.so"

RDEPENDS:${PN} += "ghc-array-devel \
ghc-prof-base-4.21.2.0-8844 \
libHSbase-4.21.2.0-8844-p-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-p-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-p-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-p-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
