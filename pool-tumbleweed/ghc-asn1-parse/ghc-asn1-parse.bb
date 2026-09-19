SUMMARY = "Simple monadic parser for ASN1 stream types"
DESCRIPTION = "Simple monadic parser for ASN1 stream types, when ASN1 pattern matching is not \
convenient."
LICENSE = "BSD-3-Clause"

PV = "0.9.5"

RPM_NAME = "ghc-asn1-parse-0.9.5-6.24.aarch64.rpm"
RPM_HASH = "9d0403444aff34b9bf05b7d764165563dcbd5785f26130ed48fe3b1286a70721ceb7af5e9d5b876dbdc375a8b88ab2b8003905757342b387acf72ee57b2bb1d2"

RPROVIDES:${PN} += "ghc-asn1-parse \
libHSasn1-parse-0.9.5-C3ZcAfeR9k34dM4BWjZOjb-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSasn1-encoding-0.9.6-6HoFXCc54fWHW7G1NmR4HI-ghc9.12.4.so \
libHSasn1-types-0.3.4-7PM4xMGOCo5HtpL9dIOMTo-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSbasement-0.0.16-EFfarL5MHPIHNlTrgpSdN2-ghc9.12.4.so \
libHSbytestring-0.12.2.0-65be-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-boot-th-9.12.4-0605-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHShourglass-0.2.12-AVWrQ59TfGxLOqFeNnaO7o-ghc9.12.4.so \
libHSmemory-0.18.0-4OCVGiXkS6t9StTfiwlZlu-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
