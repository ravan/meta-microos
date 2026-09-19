SUMMARY = "Haskell pretty library"
DESCRIPTION = "This package provides the Haskell pretty library."
LICENSE = "BSD-3-Clause"

PV = "1.1.3.6"

RPM_NAME = "ghc-pretty-1.1.3.6-1.3.aarch64.rpm"
RPM_HASH = "67cc7282893588d5ddde7755338c4ec2502304ab64b7d4c9e09d5f49af76ae711137484a9a8493b64cfdda261dc69dc77bc6cf772033ee3a95a316605282e018"

RPROVIDES:${PN} += "ghc-pretty \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
