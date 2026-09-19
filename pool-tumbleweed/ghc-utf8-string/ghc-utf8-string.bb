SUMMARY = "Support for reading and writing UTF8 Strings"
DESCRIPTION = "A UTF8 layer for Strings. The utf8-string package provides operations for \
encoding UTF8 strings to Word8 lists and back, and for reading and writing UTF8 \
without truncation."
LICENSE = "BSD-3-Clause"

PV = "1.0.2"

RPM_NAME = "ghc-utf8-string-1.0.2-2.35.aarch64.rpm"
RPM_HASH = "06af24483f4ad7d6b89ecbdaa96598c0167483c8b690d939a9d15a273e2138aa734f4cba04eab226c01fa89b877a735087ca1d26cfe2611a78e982d8d69c68ac"

RPROVIDES:${PN} += "ghc-utf8-string \
libHSutf8-string-1.0.2-FCJm07Id8m53KWoTjjdHEG-ghc9.12.4.so"

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
