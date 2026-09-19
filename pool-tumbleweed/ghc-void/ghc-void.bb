SUMMARY = "A Haskell 98 logically uninhabited data type"
DESCRIPTION = "A Haskell 98 logically uninhabited data type, used to indicate that a given \
term should not exist."
LICENSE = "BSD-3-Clause"

PV = "0.7.4"

RPM_NAME = "ghc-void-0.7.4-1.7.aarch64.rpm"
RPM_HASH = "59c1ddcaf2395619671ed2555aed169ad738ca28f567b9ad4cff75edfc49fc814a0f3011a7a5f057180df6e9879074136fd7310cf75848ba5334a8d49216f81c"

RPROVIDES:${PN} += "ghc-void \
libHSvoid-0.7.4-18r3xgdXbMHk4AqCF5SgT-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
