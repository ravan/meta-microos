SUMMARY = "RFC 4648-compliant Base16 encodings for ByteStrings"
DESCRIPTION = "This package provides support for encoding and decoding binary data according \
to 'base16' (see also <https://tools.ietf.org/html/rfc4648 RFC 4648>) for \
strict (see 'Data.ByteString.Base16') and lazy 'ByteString's (see \
'Data.ByteString.Base16.Lazy'). \
 \
See the <https://hackage.haskell.org/package/base16 base16> package which \
provides superior encoding and decoding performance as well as support for \
lazy, short, and strict variants of 'Text' and 'ByteString' values. \
Additionally, see the <https://hackage.haskell.org/package/base-encoding \
base-encoding> package which provides an uniform API providing conversion paths \
between more binary and textual types."
LICENSE = "BSD-3-Clause"

PV = "1.0.2.0"

RPM_NAME = "ghc-base16-bytestring-1.0.2.0-3.21.aarch64.rpm"
RPM_HASH = "f5535f98b4cf92986bdca7819213ae4d6f06ea5eb7fc31be77278458e41248a267af7d198a4b2deffd79c377b0c5710f08ef74923bc46a1be1f10a15d7a7d802"

RPROVIDES:${PN} += "ghc-base16-bytestring \
libHSbase16-bytestring-1.0.2.0-IiVu4f3aSfMH2rpDgRP1QL-ghc9.12.4.so"

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
