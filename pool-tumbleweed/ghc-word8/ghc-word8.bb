SUMMARY = "Word8 library"
DESCRIPTION = "Word8 library to be used with Data.ByteString."
LICENSE = "BSD-3-Clause"

PV = "0.1.3"

RPM_NAME = "ghc-word8-0.1.3-5.35.aarch64.rpm"
RPM_HASH = "872e7c45f3c95617bdcfe6e48a424818e24486e15b417f4e4615fe876cca34e684ed206e3e7c1a019c5b439a3afb6754c2604deae0f3cbbb99affab563923d9e"

RPROVIDES:${PN} += "ghc-word8 \
libHSword8-0.1.3-DJye6up9iU5LN32ihJcMva-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
