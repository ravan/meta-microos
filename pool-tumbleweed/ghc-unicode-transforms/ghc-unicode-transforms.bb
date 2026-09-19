SUMMARY = "Unicode normalization"
DESCRIPTION = "Fast Unicode 14.0.0 normalization in Haskell (NFC, NFKC, NFD, NFKD)."
LICENSE = "BSD-3-Clause"

PV = "0.4.0.1"

RPM_NAME = "ghc-unicode-transforms-0.4.0.1-10.3.aarch64.rpm"
RPM_HASH = "36141abce4c44fabcfcb413c5fac6f7ae48f6c9eead9a4d33622b363623c9bc1c46a9caa02f30979926cfb4032afe129a865da4a6a8699e739ecf3e2b4862953"

RPROVIDES:${PN} += "ghc-unicode-transforms \
libHSunicode-transforms-0.4.0.1-KtQjAe86DCEJDcpSXQHRSI-ghc9.12.4.so"

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
libHSunicode-data-0.6.0-L8MzYkzbuQvKbpFsnfTHmj-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
