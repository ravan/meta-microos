SUMMARY = "Parser and renderer for djot light markup syntax"
DESCRIPTION = "Djot (<https://djot.net>) is a light markup language. This package provides a \
data structure to represent djot documents, a very fast parser, and functions \
to render a parsed document as HTML and as djot."
LICENSE = "MIT"

PV = "0.1.4"

RPM_NAME = "ghc-djot-0.1.4-1.3.aarch64.rpm"
RPM_HASH = "c0cf57b17b8773c0bcd71ddad113fab0479a434fd53567ad1030423e91f708935f8d502aaad2707e5181f7e502fe56df9af92ff9d77f4df2326efd5d0cf529a1"

RPROVIDES:${PN} += "ghc-djot \
libHSdjot-0.1.4-544S34r37OfBfrOQhQH0gD-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSarray-0.5.8.0-2a42-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSbinary-0.8.9.3-9861-ghc9.12.4.so \
libHSbytestring-0.12.2.0-65be-ghc9.12.4.so \
libHScontainers-0.7-d5e1-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSdoclayout-0.5.0.3-6oU5Og9jiD67xwlm4qJ1ii-ghc9.12.4.so \
libHSemojis-0.1.5-AZAxFgnk0gPLtmkqpmmj2s-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-boot-th-9.12.4-0605-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHSmtl-2.3.2-37ef-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libHSsafe-0.3.21-AzRUUYeJ47sQc55olWnva-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libHStext-2.1.4-cf23-ghc9.12.4.so \
libHStransformers-0.6.3.0-4709-ghc9.12.4.so \
libc.so.6 \
libffi.so.8 \
libgmp.so.10 \
libm.so.6 \
libnuma.so.1"

inherit rpm
