SUMMARY = "Common 'Text.Regex.*' API for Regex matching"
DESCRIPTION = "This package does not provide the ability to do regular expression matching. \
Instead, it provides the type classes that constitute the abstract API that is \
implemented by 'regex-*' backends such as: \
 \
* <https://hackage.haskell.org/package/regex-posix regex-posix> \
 \
* <https://hackage.haskell.org/package/regex-parsec regex-parsec> \
 \
* <https://hackage.haskell.org/package/regex-dfa regex-dfa> \
 \
* <https://hackage.haskell.org/package/regex-tdfa regex-tdfa> \
 \
* <https://hackage.haskell.org/package/regex-pcre regex-pcre> \
 \
See also <https://wiki.haskell.org/Regular_expressions> for more information."
LICENSE = "BSD-3-Clause"

PV = "0.94.0.3"

RPM_NAME = "ghc-regex-base-0.94.0.3-1.12.aarch64.rpm"
RPM_HASH = "4ddaa750458b54d97d3229c095b45b3eddf8a0ac422eba379e723237c9bbe108056a9393847a0c5bd408c4e692a9f76f32ff64e63e2e27ede96217c57d46123d"

RPROVIDES:${PN} += "ghc-regex-base \
libHSregex-base-0.94.0.3-1XPR6520nrRCZPbnaVzsF0-ghc9.12.4.so"

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
