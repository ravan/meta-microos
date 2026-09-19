SUMMARY = "Memory-efficient representation of Unicode text strings"
DESCRIPTION = "This package provides the 'ShortText' type which is suitable for keeping many \
short strings in memory. This is similiar to how 'ShortByteString' relates to \
'ByteString'. \
 \
The main difference between 'Text' and 'ShortText' is that 'ShortText' doesn't \
support zero-copy slicing (thereby saving 2 words), and, compared to text-1.*, \
that it uses UTF-8 instead of UTF-16 internally. Consequently, the memory \
footprint of a (boxed) 'ShortText' value is 4 words (2 words when unboxed) plus \
the length of the UTF-8 encoded payload."
LICENSE = "BSD-3-Clause"

PV = "0.1.6.1"

RPM_NAME = "ghc-text-short-0.1.6.1-1.3.aarch64.rpm"
RPM_HASH = "8088799a6e4aebf73efba998b435b8d2d11cd76b183c8b31cd573c9625b3a76a90b71d838a01c4132e01e9bf5352d6bf85196f8955286247168c470128fc789a"

RPROVIDES:${PN} += "ghc-text-short \
libHStext-short-0.1.6.1-K3gVAGEPLemvxyg6g1yq-ghc9.12.4.so"

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
libHShashable-1.5.1.0-csiQUH7RkN8TUlZyJbFpr-ghc9.12.4.so \
libHSmtl-2.3.2-37ef-ghc9.12.4.so \
libHSos-string-2.0.10-5320-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libHSstm-2.5.3.1-6d74-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libHStext-2.1.4-cf23-ghc9.12.4.so \
libHStransformers-0.6.3.0-4709-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
