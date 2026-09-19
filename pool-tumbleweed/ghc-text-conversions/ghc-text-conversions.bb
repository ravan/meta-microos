SUMMARY = "Safe conversions between textual types"
DESCRIPTION = "Safe conversions between textual types."
LICENSE = "ISC"

PV = "0.3.1.1"

RPM_NAME = "ghc-text-conversions-0.3.1.1-2.23.aarch64.rpm"
RPM_HASH = "4ba5716542856cba3eb79fcec3fbf9b9a81ead29c21377d016dc41f52f6baedc36d81665f462d9c9214d65ce5ea89b03526f53c309f6adec7f93208993bfef56"

RPROVIDES:${PN} += "ghc-text-conversions \
libHStext-conversions-0.3.1.1-20nmORR03VHGl8svDWla5t-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSarray-0.5.8.0-2a42-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSbase16-bytestring-1.0.2.0-IiVu4f3aSfMH2rpDgRP1QL-ghc9.12.4.so \
libHSbase64-bytestring-1.2.1.0-9fPiMCS8Y4g8itFjJTGk2y-ghc9.12.4.so \
libHSbinary-0.8.9.3-9861-ghc9.12.4.so \
libHSbytestring-0.12.2.0-65be-ghc9.12.4.so \
libHScontainers-0.7-d5e1-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-boot-th-9.12.4-0605-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libHStext-2.1.4-cf23-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
