SUMMARY = "Haskell ghc-boot-th library"
DESCRIPTION = "This package provides the Haskell ghc-boot-th library."
LICENSE = "BSD-3-Clause"

PV = "9.12.4"

RPM_NAME = "ghc-ghc-boot-th-9.12.4-1.3.aarch64.rpm"
RPM_HASH = "7f9764107190bdc2fdc067f19310f249ca6c8c78f745fc9f2420faf456981b4fd400735371e978f80396d4a991b638b056e46718257ef68c280eaab65819490b"

RPROVIDES:${PN} += "ghc-ghc-boot-th \
libHSghc-boot-th-9.12.4-0605-ghc9.12.4.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
