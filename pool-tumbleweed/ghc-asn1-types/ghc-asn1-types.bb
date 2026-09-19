SUMMARY = "ASN.1 types"
DESCRIPTION = "ASN.1 standard types."
LICENSE = "BSD-3-Clause"

PV = "0.3.4"

RPM_NAME = "ghc-asn1-types-0.3.4-5.31.aarch64.rpm"
RPM_HASH = "e0227ed2abf5ea874c98509b52ec161debce73c878260ddbeb665dad262dd10b93389ef6bf560161c9f366bff7fee901a3d9d011b2e09f142c552599fff8c465"

RPROVIDES:${PN} += "ghc-asn1-types \
libHSasn1-types-0.3.4-7PM4xMGOCo5HtpL9dIOMTo-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSbase-4.21.2.0-8844-ghc9.12.4.so \
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
