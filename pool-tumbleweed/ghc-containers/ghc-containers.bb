SUMMARY = "Haskell containers library"
DESCRIPTION = "This package provides the Haskell containers library."
LICENSE = "BSD-3-Clause"

PV = "0.7"

RPM_NAME = "ghc-containers-0.7-1.3.aarch64.rpm"
RPM_HASH = "58bf330166083960d2508eb6766893387a3a2b065d4cf2fba2f1c5fa6dde0abd815223463200119a9c4375f47f504fcd5d5ccadfed199b16cac174bdc0b21990"

RPROVIDES:${PN} += "ghc-containers \
libHScontainers-0.7-d5e1-ghc9.12.4.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
libHSarray-0.5.8.0-2a42-ghc9.12.4.so \
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
