SUMMARY = "Haskell terminfo profiling library"
DESCRIPTION = "This package provides the Haskell terminfo profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.4.1.7"

RPM_NAME = "ghc-terminfo-prof-0.4.1.7-1.3.aarch64.rpm"
RPM_HASH = "4aa6f3bf7ba0550437832d99015e2aefa2270cde2d7f1e0fe71661f9b359d26aa64a7a8fd31977b6ae89cec598eadda7009a4162e2be92f43f24c79e20206a8d"

RPROVIDES:${PN} += "ghc-prof-terminfo-0.4.1.7-3afa \
ghc-terminfo-prof \
libHSterminfo-0.4.1.7-3afa-p-ghc9.12.4.so"

RDEPENDS:${PN} += "ghc-prof-base-4.21.2.0-8844 \
ghc-terminfo-devel \
libHSbase-4.21.2.0-8844-p-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-p-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-p-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-p-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libtinfo.so.6"

inherit rpm
