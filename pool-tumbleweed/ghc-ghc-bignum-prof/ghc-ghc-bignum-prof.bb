SUMMARY = "Haskell ghc-bignum profiling library"
DESCRIPTION = "This package provides the Haskell ghc-bignum profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.3"

RPM_NAME = "ghc-ghc-bignum-prof-1.3-1.3.aarch64.rpm"
RPM_HASH = "46707f6f79221461361adf01b280313ed9f0676779ce09a9f61c193264fd4d6ff76153485aecb14ac011314304fece386be6cdc125c434bc00ca57c7987720c6"

RPROVIDES:${PN} += "ghc-ghc-bignum-prof \
ghc-prof-ghc-bignum-1.3-03b0 \
libHSghc-bignum-1.3-03b0-p-ghc9.12.4.so"

RDEPENDS:${PN} += "ghc-ghc-bignum-devel \
ghc-prof-ghc-prim-0.13.0-f55c \
libHSghc-prim-0.13.0-f55c-p-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
