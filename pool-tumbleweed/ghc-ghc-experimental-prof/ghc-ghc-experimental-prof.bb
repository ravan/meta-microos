SUMMARY = "Haskell ghc-experimental profiling library"
DESCRIPTION = "This package provides the Haskell ghc-experimental profiling library."
LICENSE = "BSD-3-Clause"

PV = "9.1204.0"

RPM_NAME = "ghc-ghc-experimental-prof-9.1204.0-1.3.aarch64.rpm"
RPM_HASH = "58a518b8c7061ebe0ec419dd83ed44782b83ebe0bf303fe16d95306656671d1923de6b657447e9304da39671e6a0ca242f62ba314dd39d18a2d0449e6c880832"

RPROVIDES:${PN} += "ghc-ghc-experimental-prof \
ghc-prof-ghc-experimental-9.1204.0-a6a5 \
libHSghc-experimental-9.1204.0-a6a5-p-ghc9.12.4.so"

RDEPENDS:${PN} += "ghc-ghc-experimental-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-ghc-internal-9.1204.0-f1e1 \
ghc-prof-ghc-prim-0.13.0-f55c \
libHSbase-4.21.2.0-8844-p-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-p-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-p-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-p-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
