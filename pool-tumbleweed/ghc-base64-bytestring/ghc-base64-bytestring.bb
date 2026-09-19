SUMMARY = "Fast base64 encoding and decoding for ByteStrings"
DESCRIPTION = "This package provides support for encoding and decoding binary data according \
to 'base64' (see also <https://tools.ietf.org/html/rfc4648 RFC 4648>) for \
strict and lazy ByteStrings \
 \
For a fuller-featured and better-performing Base64 library, see the \
<https://hackage.haskell.org/package/base64 base64> package."
LICENSE = "BSD-3-Clause"

PV = "1.2.1.0"

RPM_NAME = "ghc-base64-bytestring-1.2.1.0-3.30.aarch64.rpm"
RPM_HASH = "936ae3d36c849a8078a6ffeb72c8b25fe918dd14b3f64f9bdfdee425b6e5de0cbe8eafabc69a64b314d3e15faa1f8827953743dd783daeecaee217a9a30d3e76"

RPROVIDES:${PN} += "ghc-base64-bytestring \
libHSbase64-bytestring-1.2.1.0-9fPiMCS8Y4g8itFjJTGk2y-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSbytestring-0.12.2.0-65be-ghc9.12.4.so \
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
