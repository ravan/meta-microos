SUMMARY = "Haskell stm library"
DESCRIPTION = "This package provides the Haskell stm library."
LICENSE = "BSD-3-Clause"

PV = "2.5.3.1"

RPM_NAME = "ghc-stm-2.5.3.1-1.3.aarch64.rpm"
RPM_HASH = "541c320a40fdb771dcd246a27ffaec38f4c1d689c535896508062a4c09bf8995592af6a943ebd54d04a5442665e5ac475167ea4896a30ca68186f105bc68cb4b"

RPROVIDES:${PN} += "ghc-stm \
libHSstm-2.5.3.1-6d74-ghc9.12.4.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
libHSarray-0.5.8.0-2a42-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
