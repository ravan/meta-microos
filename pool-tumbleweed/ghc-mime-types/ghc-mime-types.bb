SUMMARY = "Basic mime-type handling types and functions"
DESCRIPTION = "API docs and the README are available at \
<http://www.stackage.org/package/mime-types>."
LICENSE = "MIT"

PV = "0.1.2.2"

RPM_NAME = "ghc-mime-types-0.1.2.2-1.2.aarch64.rpm"
RPM_HASH = "0dded2ddbc8d71fd1489c523075b1f2cb803ec5398bf12c7f8f9737dd8399ae7d4f91253575d28562d5030d2d6593e140299283832ca64f187785a2878f8a781"

RPROVIDES:${PN} += "ghc-mime-types \
libHSmime-types-0.1.2.2-6XnqAsimqz1GLkPrdggNkp-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSarray-0.5.8.0-2a42-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSbinary-0.8.9.3-9861-ghc9.12.4.so \
libHSbytestring-0.12.2.0-65be-ghc9.12.4.so \
libHScontainers-0.7-d5e1-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-boot-th-9.12.4-0605-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libHStext-2.1.4-cf23-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
