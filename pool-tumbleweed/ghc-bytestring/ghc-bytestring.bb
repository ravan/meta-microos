SUMMARY = "Haskell bytestring library"
DESCRIPTION = "This package provides the Haskell bytestring library."
LICENSE = "BSD-3-Clause"

PV = "0.12.2.0"

RPM_NAME = "ghc-bytestring-0.12.2.0-1.3.aarch64.rpm"
RPM_HASH = "b043c7d2190b1a0a5cc2c9a5cec18a6e43f019917f54a5add2f0202e92ea4e13945369aebe8361db2ec3d14cea955bb4dbd8f8bd52797795776f7d624f42add5"

RPROVIDES:${PN} += "ghc-bytestring \
libHSbytestring-0.12.2.0-65be-ghc9.12.4.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-boot-th-9.12.4-0605-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
