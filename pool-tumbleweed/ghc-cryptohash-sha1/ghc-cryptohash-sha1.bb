SUMMARY = "Fast, pure and practical SHA-1 implementation"
DESCRIPTION = "A practical incremental and one-pass, pure API to the \
<https://en.wikipedia.org/wiki/SHA-1 SHA-1 hash algorithm> (including \
<https://en.wikipedia.org/wiki/HMAC HMAC> support) with performance close to \
the fastest implementations available in other languages. \
 \
The implementation is made in C with a haskell FFI wrapper that hides the C \
implementation. \
 \
NOTE: This package has been forked off 'cryptohash-0.11.7' because the \
'cryptohash' package has been deprecated and so this package continues to \
satisfy the need for a lightweight package providing the SHA1 hash algorithm \
without any dependencies on packages other than 'base' and 'bytestring'. \
 \
Consequently, this package can be used as a drop-in replacement for \
'cryptohash''s 'Crypto.Hash.SHA1' module, though with a clearly smaller \
footprint."
LICENSE = "BSD-3-Clause"

PV = "0.11.101.0"

RPM_NAME = "ghc-cryptohash-sha1-0.11.101.0-8.15.aarch64.rpm"
RPM_HASH = "61ab0009af3f8ef6d95e68de31bc21585ca73e9b77f8bc51c6ad1b230deabc60ef82bc95af5a955f456be374381db34366c41c5cd3ed198a19542ace1fab1054"

RPROVIDES:${PN} += "ghc-cryptohash-sha1 \
libHScryptohash-sha1-0.11.101.0-8eRxmtRH1AP4nYxJeWtthM-ghc9.12.4.so"

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
