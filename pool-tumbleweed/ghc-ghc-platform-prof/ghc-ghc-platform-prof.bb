SUMMARY = "Haskell ghc-platform profiling library"
DESCRIPTION = "This package provides the Haskell ghc-platform profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.0.0"

RPM_NAME = "ghc-ghc-platform-prof-0.1.0.0-1.3.aarch64.rpm"
RPM_HASH = "0e5b7fa829b41a92e9900b7143dc272fff2915ece8d8058a9473637d87532d4adf41c041dd14b256cbf91db87b180a104a635bb11ed1b1db1f971482e085faf0"

RPROVIDES:${PN} += "ghc-ghc-platform-prof \
ghc-prof-ghc-platform-0.1.0.0-ac24 \
libHSghc-platform-0.1.0.0-ac24-p-ghc9.12.4.so"

RDEPENDS:${PN} += "ghc-ghc-platform-devel \
ghc-prof-base-4.21.2.0-8844 \
libHSbase-4.21.2.0-8844-p-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-p-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-p-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-p-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
