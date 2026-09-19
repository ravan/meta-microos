SUMMARY = "Pure Haskell commonmark parser"
DESCRIPTION = "This library provides the core data types and functions for parsing commonmark \
(<https://spec.commonmark.org>). The parser is fully commonmark-compliant and \
passes the test suite. It is designed to be customizable and easily extensible. \
To customize the output, create an AST, or support a new output format, one \
need only define some new typeclass instances. It is also easy to add new \
syntax elements or modify existing ones. \
 \
Accurate information about source positions is available for all block and \
inline elements. Thus the library can be used to create an accurate syntax \
highlighter or an editor with live preview. \
 \
The parser has been designed for robust performance even in pathological cases \
that tend to cause stack overflows or exponential slowdowns in other parsers, \
with parsing speed that varies linearly with input length. \
 \
Related packages: \
 \
- commonmark-extensions (which defines a number of syntax extensions) - \
commonmark-pandoc (which allows using this parser to create a Pandoc structure) \
- commonmark-cli (a command-line tool for converting and syntax-highlighting \
commonmark documents)."
LICENSE = "BSD-3-Clause"

PV = "0.3"

RPM_NAME = "ghc-commonmark-0.3-1.3.aarch64.rpm"
RPM_HASH = "1077616da21f6870b7884c9d722b1c2a15ea0ed0debc0df3ea4466f2feb01c42f485644e8011d88edc29c0cf512fb7d6eea5b733b623c899874351c7cabfb009"

RPROVIDES:${PN} += "ghc-commonmark \
libHScommonmark-0.3-Hb0ZVJyoQFw1ynqgbLue51-ghc9.12.4.so"

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
libHSmtl-2.3.2-37ef-ghc9.12.4.so \
libHSparsec-3.1.18.0-be05-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libHStext-2.1.4-cf23-ghc9.12.4.so \
libHStransformers-0.6.3.0-4709-ghc9.12.4.so \
libHSunicode-data-0.6.0-L8MzYkzbuQvKbpFsnfTHmj-ghc9.12.4.so \
libHSunicode-transforms-0.4.0.1-KtQjAe86DCEJDcpSXQHRSI-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
