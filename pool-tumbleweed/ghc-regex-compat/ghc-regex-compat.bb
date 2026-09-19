SUMMARY = "Replaces/enhances 'Text.Regex'"
DESCRIPTION = "One module compat layer over <//hackage.haskell.org/package/regex-posix \
regex-posix> to replace 'Text.Regex'. \
 \
See also <https://wiki.haskell.org/Regular_expressions> for more information."
LICENSE = "BSD-3-Clause"

PV = "0.95.2.2"

RPM_NAME = "ghc-regex-compat-0.95.2.2-1.8.aarch64.rpm"
RPM_HASH = "11276fe114d66e1a4064ebc24b5920384c40c1137fa2e26fc51d84c5c796cca4d4039b3e3cbdc2ed32e582988689419f76db5f5a6ca1ae5b039e99301d1339f8"

RPROVIDES:${PN} += "ghc-regex-compat \
libHSregex-compat-0.95.2.2-BPr9re8H6vl1LOIxX40pHj-ghc9.12.4.so"

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
libHSregex-base-0.94.0.3-1XPR6520nrRCZPbnaVzsF0-ghc9.12.4.so \
libHSregex-posix-0.96.0.2-ChZqQGTfEDW3V6S9qgLypS-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libHStext-2.1.4-cf23-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
