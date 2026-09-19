SUMMARY = "Config for TLS Encrypted Client Hello"
DESCRIPTION = "Config types for TLS Encrypted Client Hello to glue DNS and TLS."
LICENSE = "BSD-3-Clause"

PV = "0.0.1"

RPM_NAME = "ghc-ech-config-0.0.1-2.2.aarch64.rpm"
RPM_HASH = "1ff1752207a52aa372ad9dfd92e562a106544fa2142addd997df8ce66675d9cb64fa3248a1703415bf056f7c3087f3505f9b2d3cbd57bd0e9f791f25177ca301"

RPROVIDES:${PN} += "ghc-ech-config \
libHSech-config-0.0.1-Dq8pFxp7oP5KsTo31dxOND-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSarray-0.5.8.0-2a42-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSbase16-bytestring-1.0.2.0-IiVu4f3aSfMH2rpDgRP1QL-ghc9.12.4.so \
libHSbytestring-0.12.2.0-65be-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSexceptions-0.10.12-f655-ghc9.12.4.so \
libHSfilepath-1.5.5.0-b25b-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-boot-th-9.12.4-0605-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHSmtl-2.3.2-37ef-ghc9.12.4.so \
libHSnetwork-byte-order-0.1.8-2e5INl5ljJtIwuBIoNgv18-ghc9.12.4.so \
libHSos-string-2.0.10-5320-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libHSstm-2.5.3.1-6d74-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libHStransformers-0.6.3.0-4709-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
