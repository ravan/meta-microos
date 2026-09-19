SUMMARY = "A simple applicative parser"
DESCRIPTION = "A simple applicative parser in Parsec style."
LICENSE = "BSD-3-Clause"

PV = "0.1.8"

RPM_NAME = "ghc-appar-0.1.8-4.23.aarch64.rpm"
RPM_HASH = "bfd2c59e8bc8baf60be98d6e82bbccd7566c8ab871edc05ebd1b7676e9c50362619d2a1e9c0d39a5707d8805f300f95a8a7018be7927596dcc26c1ef6d17775d"

RPROVIDES:${PN} += "ghc-appar \
libHSappar-0.1.8-WSZSnBitxp1mS4dOP2hyq-ghc9.12.4.so"

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
