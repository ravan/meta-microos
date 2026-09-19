SUMMARY = "Chunked HTTP transfer encoding for bytestring builders"
DESCRIPTION = "This library contains functions for encoding [bytestring \
builders](http://hackage.haskell.org/package/bytestring/docs/Data-ByteString-Builder.html#t:Builder) \
for [chunked HTTP/1.1 \
transfer](https://en.wikipedia.org/wiki/Chunked_transfer_encoding). \
 \
This functionality was extracted from the \
[blaze-builder](http://hackage.haskell.org/package/blaze-builder) package."
LICENSE = "BSD-3-Clause"

PV = "0.0.0.4"

RPM_NAME = "ghc-bsb-http-chunked-0.0.0.4-7.17.aarch64.rpm"
RPM_HASH = "c9f589e2131677ed676589e1b0552c9df3024134f5bbaa46da88369843ddacc1833403516e3ce0e06920e831c53f005922e0db91eb93d591d7cb5988a3101bba"

RPROVIDES:${PN} += "ghc-bsb-http-chunked \
libHSbsb-http-chunked-0.0.0.4-5cZHaHeIaQxIWhD1tKvYpE-ghc9.12.4.so"

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
