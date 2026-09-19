SUMMARY = "Fast, pure and practical MD5 implementation"
DESCRIPTION = "A practical incremental and one-pass, pure API to the \
<https://en.wikipedia.org/wiki/MD5 MD5 hash algorithm> (including \
<https://en.wikipedia.org/wiki/HMAC HMAC> support) with performance close to \
the fastest implementations available in other languages. \
 \
The implementation is made in C with a haskell FFI wrapper that hides the C \
implementation. \
 \
NOTE: This package has been forked off 'cryptohash-0.11.7' because the \
'cryptohash' package has been deprecated and so this package continues to \
satisfy the need for a lightweight package providing the MD5 hash algorithm \
without any dependencies on packages other than 'base' and 'bytestring'. \
 \
Consequently, this package can be used as a drop-in replacement for \
'cryptohash''s 'Crypto.Hash.MD5' module, though with a clearly smaller \
footprint."
LICENSE = "BSD-3-Clause"

PV = "0.11.101.0"

RPM_NAME = "ghc-cryptohash-md5-0.11.101.0-8.15.aarch64.rpm"
RPM_HASH = "5ef22bf3857d790925d8b7d56dcb7ead7fc9a936b44990b02c50eb372055818ef327c8fc01dff11c6075038c0721a3d33159978a21fe28b881f58b4c17cbe6df"

RPROVIDES:${PN} += "ghc-cryptohash-md5 \
libHScryptohash-md5-0.11.101.0-BL71FgcwkvtHLdWrK6WsDS-ghc9.12.4.so"

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
