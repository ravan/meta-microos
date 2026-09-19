SUMMARY = "CSV loader and dumper"
DESCRIPTION = "CSV loader and dumper \
 \
This library parses and dumps documents that are formatted according to RFC \
4180, 'The common Format and MIME Type for Comma-Separated Values (CSV) Files'. \
This format is used, among many other things, as a lingua franca for \
spreadsheets, and for certain web services."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "ghc-csv-0.1.2-4.19.aarch64.rpm"
RPM_HASH = "afb88e50928483682a0e2f44d2838e115feb7a67182f1d882955bd8d48465a6d8f6fd74e8c3efdb476fbd72f5bdb2bca4587ad83d0d188ef8af45d93fbeed3ec"

RPROVIDES:${PN} += "ghc-csv \
libHScsv-0.1.2-3wV9bBF7sWG7h8WLMiwYq8-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSarray-0.5.8.0-2a42-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSbinary-0.8.9.3-9861-ghc9.12.4.so \
libHSbytestring-0.12.2.0-65be-ghc9.12.4.so \
libHScontainers-0.7-d5e1-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSexceptions-0.10.12-f655-ghc9.12.4.so \
libHSfilepath-1.5.5.0-b25b-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-boot-th-9.12.4-0605-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHSmtl-2.3.2-37ef-ghc9.12.4.so \
libHSos-string-2.0.10-5320-ghc9.12.4.so \
libHSparsec-3.1.18.0-be05-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libHSstm-2.5.3.1-6d74-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libHStext-2.1.4-cf23-ghc9.12.4.so \
libHStransformers-0.6.3.0-4709-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
