SUMMARY = "Pure Haskell Tagged DFA Backend for 'Text.Regex' (regex-base)"
DESCRIPTION = "This package provides a pure Haskell 'Tagged' DFA regex engine for \
<//hackage.haskell.org/package/regex-base regex-base>. This implementation was \
inspired by the algorithm (and Master's thesis) behind the regular expression \
library known as <https://github.com/laurikari/tre/ TRE or libtre>. \
 \
Please consult the 'Text.Regex.TDFA' module for API documentation including a \
tutorial with usage examples; see also \
<https://wiki.haskell.org/Regular_expressions> for general information about \
regular expression support in Haskell."
LICENSE = "BSD-3-Clause"

PV = "1.3.2.5"

RPM_NAME = "ghc-regex-tdfa-1.3.2.5-1.9.aarch64.rpm"
RPM_HASH = "27ed82040f576d59d517663db732f50a646ca37edc92bbc6827b2df7816044d4e9c56a3db4b40dbe2021179d33985fc6f43f72db6668397419604946792bd3a9"

RPROVIDES:${PN} += "ghc-regex-tdfa \
libHSregex-tdfa-1.3.2.5-DS5gfI36p0L6e0JJtc3gfd-ghc9.12.4.so"

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
libHSregex-base-0.94.0.3-1XPR6520nrRCZPbnaVzsF0-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libHStext-2.1.4-cf23-ghc9.12.4.so \
libHStransformers-0.6.3.0-4709-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
