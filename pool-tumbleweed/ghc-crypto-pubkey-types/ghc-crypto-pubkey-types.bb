SUMMARY = "Generic cryptography Public keys algorithm types"
DESCRIPTION = "Generic cryptography public keys algorithm types."
LICENSE = "BSD-3-Clause"

PV = "0.4.3"

RPM_NAME = "ghc-crypto-pubkey-types-0.4.3-1.25.aarch64.rpm"
RPM_HASH = "49ae4ccd97701289d7e2ef44ad4a67b1fcca765885d1b9c7241a462da953eefc0473c694a76af7f7dc7a4a9650ca9229c1876db8a9ccdef240f920c22ff9d715"

RPROVIDES:${PN} += "ghc-crypto-pubkey-types \
libHScrypto-pubkey-types-0.4.3-DJq67n4kbNj6CHrsNYo02t-ghc9.12.4.so"

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
