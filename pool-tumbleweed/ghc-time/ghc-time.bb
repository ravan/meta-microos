SUMMARY = "Haskell time library"
DESCRIPTION = "This package provides the Haskell time library."
LICENSE = "BSD-3-Clause"

PV = "1.14"

RPM_NAME = "ghc-time-1.14-1.3.aarch64.rpm"
RPM_HASH = "19a9900dbf0964b4f0ade737fcd238443d5fa3429fb8b40edadfb1687ea47335ebbb56c89092032f088d5239395b0e71ae4fb528d568b4e9af916e44cbb4a010"

RPROVIDES:${PN} += "ghc-time \
libHStime-1.14-a7dc-ghc9.12.4.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-boot-th-9.12.4-0605-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
