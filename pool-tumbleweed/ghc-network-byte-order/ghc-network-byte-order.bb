SUMMARY = "Network byte order utilities"
DESCRIPTION = "Peek and poke functions for network byte order."
LICENSE = "BSD-3-Clause"

PV = "0.1.8"

RPM_NAME = "ghc-network-byte-order-0.1.8-1.2.aarch64.rpm"
RPM_HASH = "0394f38b00503a0132271e5f67d0ccd04e133ea0a9cb234ded54ca3eb479f6c3bba10bc98bf76ab355ab1cbb0b91a9f83ae8803cd7b5a06f21a8b1025a14004a"

RPROVIDES:${PN} += "ghc-network-byte-order \
libHSnetwork-byte-order-0.1.8-2e5INl5ljJtIwuBIoNgv18-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSbytestring-0.12.2.0-65be-ghc9.12.4.so \
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
