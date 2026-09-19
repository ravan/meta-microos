SUMMARY = "Compression and decompression in the gzip and zlib formats"
DESCRIPTION = "This package provides a pure interface for compressing and decompressing \
streams of data represented as lazy 'ByteString's. It uses the \
<https://en.wikipedia.org/wiki/Zlib zlib C library> so it has high performance. \
It supports the 'zlib', 'gzip' and 'raw' compression formats. \
 \
It provides a convenient high level API suitable for most tasks and for the few \
cases where more control is needed it provides access to the full zlib feature \
set."
LICENSE = "BSD-2-Clause"

PV = "0.7.1.1"

RPM_NAME = "ghc-zlib-0.7.1.1-1.9.aarch64.rpm"
RPM_HASH = "65897ca92bed7c5f3d8190919a143f078de58a4488705bb7bbf516753dbe67d9eac0f9416a77e42f364dadfe14b4de913f7893db3338d907096cae5556eec510"

RPROVIDES:${PN} += "ghc-zlib \
libHSzlib-0.7.1.1-9wvDfX7JlnE99sTdZLYOpU-ghc9.12.4.so"

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
libm.so.6 \
libz.so.1"

inherit rpm
