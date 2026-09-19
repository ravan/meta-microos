SUMMARY = "A CSV parsing and encoding library"
DESCRIPTION = "'cassava' is a library for parsing and encoding [RFC \
4180](https://tools.ietf.org/html/rfc4180) compliant [comma-separated values \
(CSV)](https://en.wikipedia.org/wiki/Comma-separated_values) data, which is a \
textual line-oriented format commonly used for exchanging tabular data. \
 \
'cassava''s API includes support for \
 \
- Index-based record-conversion - Name-based record-conversion - Typeclass \
directed conversion of fields and records - Built-in field-conversion instances \
for standard types - Customizable record-conversion instance derivation via GHC \
generics - Low-level \
[bytestring](https://hackage.haskell.org/package/bytestring) builders (see \
'Data.Csv.Builder') - Incremental decoding and encoding API (see \
'Data.Csv.Incremental') - Streaming API for constant-space decoding (see \
'Data.Csv.Streaming') \
 \
Moreover, this library is designed to be easy to use; for instance, here's a \
very simple example of encoding CSV data: \
 \
>>> Data.Csv.encode [('John',27),('Jane',28)] 'John,27rnJane,28rn' \
 \
Please refer to the documentation in 'Data.Csv' and the included \
[README](#readme) for more usage examples."
LICENSE = "BSD-3-Clause"

PV = "0.5.4.1"

RPM_NAME = "ghc-cassava-0.5.4.1-1.11.aarch64.rpm"
RPM_HASH = "3bf567732bea7460ba1ce6a820ecce9c408bd36c26ae6b3c7929cc8efe9c29a885cec7a36011355fab5526d9f3ef228684fa8b59dd263010ca2664a767a5ce61"

RPROVIDES:${PN} += "ghc-cassava \
libHScassava-0.5.4.1-8IyxQgBHHLo5YfhT4Ar4sR-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSOnly-0.1-JTlBo1y3Iulx07n0z4y7-ghc9.12.4.so \
libHSarray-0.5.8.0-2a42-ghc9.12.4.so \
libHSattoparsec-0.14.4-DCHy075kASN7LSOqkXsGoX-attoparsec-internal-ghc9.12.4.so \
libHSattoparsec-0.14.4-IG7JFX7g1aObGVedAHYv7-ghc9.12.4.so \
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
libHSinteger-logarithms-1.0.5-7oN15VqsexT8F3DIJBcPo2-ghc9.12.4.so \
libHSmtl-2.3.2-37ef-ghc9.12.4.so \
libHSos-string-2.0.10-5320-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libHSprimitive-0.9.1.0-Ez30Vu7tivmF28X1123Css-ghc9.12.4.so \
libHSscientific-0.3.8.1-EfN6leGWc5k1t5YPK2dkVk-ghc9.12.4.so \
libHSstm-2.5.3.1-6d74-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libHStext-2.1.4-cf23-ghc9.12.4.so \
libHStext-short-0.1.6.1-K3gVAGEPLemvxyg6g1yq-ghc9.12.4.so \
libHStransformers-0.6.3.0-4709-ghc9.12.4.so \
libHSunordered-containers-0.2.21-BkBQHKMtdH7EKz6YnT01Lu-ghc9.12.4.so \
libHSvector-0.13.2.0-F8givqpU8HnLN0O3dVdeWE-ghc9.12.4.so \
libHSvector-stream-0.1.0.1-FXRnPnZDT7tJ4JCMEuh1XF-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
