SUMMARY = "Parser for reStructuredText-style grid tables"
DESCRIPTION = "Provides a parser for plain-text representations of tables. This package \
supports table headers, cells spanning multiple columns or rows, as well as a \
way to specfiy column alignments."
LICENSE = "MIT"

PV = "0.1.1.0"

RPM_NAME = "ghc-gridtables-0.1.1.0-1.5.aarch64.rpm"
RPM_HASH = "c8874a55ccde6bd2578d73f59fba4a047f73c6483fe26141fe9a9cfb46f7d751cebfdaffc8ca55cf1e54d865200f18e7519b47a9b052492c3977608e8c3bad02"

RPROVIDES:${PN} += "ghc-gridtables \
libHSgridtables-0.1.1.0-KsHUhKw0ygq7hJHkhQZNzX-ghc9.12.4.so"

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
libHSparsec-3.1.18.0-be05-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libHSsafe-0.3.21-AzRUUYeJ47sQc55olWnva-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libHStext-2.1.4-cf23-ghc9.12.4.so \
libHStransformers-0.6.3.0-4709-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
