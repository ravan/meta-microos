SUMMARY = "Pure Haskell commonmark parser"
DESCRIPTION = "This library provides some useful extensions to core commonmark syntax: smart \
quotes, definition lists, tables, footnotes, math, and more."
LICENSE = "BSD-3-Clause"

PV = "0.2.7"

RPM_NAME = "ghc-commonmark-extensions-0.2.7-1.2.aarch64.rpm"
RPM_HASH = "2950f1a9e6ef19c4c14b56e560abbd479ae16b454d5070881143244993499d1f1f9a19a648fb409dd77a11118b283405a520bd673d7d80d8ce8b117b2b974994"

RPROVIDES:${PN} += "ghc-commonmark-extensions \
libHScommonmark-extensions-0.2.7-1mQ1nSXKMfxCcwI2Hy1vjF-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSarray-0.5.8.0-2a42-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSbinary-0.8.9.3-9861-ghc9.12.4.so \
libHSbytestring-0.12.2.0-65be-ghc9.12.4.so \
libHScommonmark-0.3-Hb0ZVJyoQFw1ynqgbLue51-ghc9.12.4.so \
libHScontainers-0.7-d5e1-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSemojis-0.1.5-AZAxFgnk0gPLtmkqpmmj2s-ghc9.12.4.so \
libHSexceptions-0.10.12-f655-ghc9.12.4.so \
libHSfilepath-1.5.5.0-b25b-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-boot-th-9.12.4-0605-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHSmtl-2.3.2-37ef-ghc9.12.4.so \
libHSnetwork-uri-2.6.4.2-BA29PoG9pX1EAcGKolsVh8-ghc9.12.4.so \
libHSos-string-2.0.10-5320-ghc9.12.4.so \
libHSparsec-3.1.18.0-be05-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libHSstm-2.5.3.1-6d74-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libHStext-2.1.4-cf23-ghc9.12.4.so \
libHSth-compat-0.1.7-A4ZdivYymzPCDISaa5LNtp-ghc9.12.4.so \
libHStransformers-0.6.3.0-4709-ghc9.12.4.so \
libHSunicode-data-0.6.0-L8MzYkzbuQvKbpFsnfTHmj-ghc9.12.4.so \
libHSunicode-transforms-0.4.0.1-KtQjAe86DCEJDcpSXQHRSI-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
