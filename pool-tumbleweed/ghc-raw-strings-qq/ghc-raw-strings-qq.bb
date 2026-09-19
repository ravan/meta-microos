SUMMARY = "Raw string literals for Haskell"
DESCRIPTION = "A quasiquoter for raw string literals - that is, string literals that don't \
recognise the standard escape sequences (such as ''\\n''). Basically, they make \
your code more readable by freeing you from the responsibility to escape \
backslashes. They are useful when working with regular expressions, DOS/Windows \
paths and markup languages (such as XML). \
 \
See 'examples/RawRegex.hs' for a usage example."
LICENSE = "BSD-3-Clause"

PV = "1.1"

RPM_NAME = "ghc-raw-strings-qq-1.1-1.11.aarch64.rpm"
RPM_HASH = "46a8c5fbcd82557a07909f5a5a50bf9852047aa0dcabe5d2e63ee69a63514ad06e179c34da6cb0c996c039fce123bc8fca8a4aa57f5a5577c8dcdb94c955a695"

RPROVIDES:${PN} += "ghc-raw-strings-qq \
libHSraw-strings-qq-1.1-H6acAqxYi1VJgNUr5QPFMk-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSbase-4.21.2.0-8844-ghc9.12.4.so \
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
