SUMMARY = "Implementation of RSA, using the padding schemes of PKCS#1 v2.1"
DESCRIPTION = "This library implements the RSA encryption and signature algorithms for \
arbitrarily-sized ByteStrings. While the implementations work, they are not \
necessarily the fastest ones on the planet. Particularly key generation. \
The algorithms included are based of RFC 3447, or the Public-Key Cryptography \
Standard for RSA, version 2.1 (a.k.a, PKCS#1 v2.1)."
LICENSE = "BSD-3-Clause"

PV = "2.4.1"

RPM_NAME = "ghc-RSA-2.4.1-1.28.aarch64.rpm"
RPM_HASH = "bce8d1f28ccfde2a51ec23122d3bf5819ce5809b5cdcef4310f853a44dbc81c1be7dde7dffc07a8441cd4568dbd2c26a3b90f0793097936600739a7d82a5506a"

RPROVIDES:${PN} += "ghc-RSA \
libHSRSA-2.4.1-1xID0u6sJ2b79HlbaBWwck-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSSHA-1.6.4.4-F68cMQUf1qw5myCdTNffCM-ghc9.12.4.so \
libHSarray-0.5.8.0-2a42-ghc9.12.4.so \
libHSasn1-encoding-0.9.6-6HoFXCc54fWHW7G1NmR4HI-ghc9.12.4.so \
libHSasn1-types-0.3.4-7PM4xMGOCo5HtpL9dIOMTo-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSbasement-0.0.16-EFfarL5MHPIHNlTrgpSdN2-ghc9.12.4.so \
libHSbinary-0.8.9.3-9861-ghc9.12.4.so \
libHSbytestring-0.12.2.0-65be-ghc9.12.4.so \
libHScereal-0.5.8.3-9RjPyVhfWFC69r1oCUPmww-ghc9.12.4.so \
libHScontainers-0.7-d5e1-ghc9.12.4.so \
libHScrypto-api-0.13.3-BvysNl9crxvRkhKzviyjB-ghc9.12.4.so \
libHScrypto-pubkey-types-0.4.3-DJq67n4kbNj6CHrsNYo02t-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSentropy-0.4.1.11-4UsuhibEvcjLW75DCXDx9X-ghc9.12.4.so \
libHSexceptions-0.10.12-f655-ghc9.12.4.so \
libHSfilepath-1.5.5.0-b25b-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-boot-th-9.12.4-0605-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHShourglass-0.2.12-AVWrQ59TfGxLOqFeNnaO7o-ghc9.12.4.so \
libHSmemory-0.18.0-4OCVGiXkS6t9StTfiwlZlu-ghc9.12.4.so \
libHSmtl-2.3.2-37ef-ghc9.12.4.so \
libHSos-string-2.0.10-5320-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libHSstm-2.5.3.1-6d74-ghc9.12.4.so \
libHStagged-0.8.10-H6Ef5dd4ktu4CIJjtjtwM7-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libHStime-1.14-a7dc-ghc9.12.4.so \
libHStransformers-0.6.3.0-4709-ghc9.12.4.so \
libHSunix-2.8.8.0-178a-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
