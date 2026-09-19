SUMMARY = "Fast, pure and practical SHA-256 implementation"
DESCRIPTION = "A practical incremental and one-pass, pure API to the [SHA-256 cryptographic \
hash algorithm](https://en.wikipedia.org/wiki/SHA-2) according to [FIPS \
180-4](http://dx.doi.org/10.6028/NIST.FIPS.180-4) with performance close to the \
fastest implementations available in other languages. \
 \
The core SHA-256 algorithm is implemented in C and is thus expected to be as \
fast as the standard [sha256sum(1) \
tool](https://linux.die.net/man/1/sha256sum); for instance, on an /Intel Core \
i7-3770/ at 3.40GHz this implementation can compute a SHA-256 hash over 230 MiB \
of data in under one second. (If, instead, you require a pure Haskell \
implementation and performance is secondary, please refer to the [SHA \
package](https://hackage.haskell.org/package/SHA).) \
 \
Additionally, this package provides support for \
 \
- HMAC-SHA-256: SHA-256-based [Hashed Message Authentication \
Codes](https://en.wikipedia.org/wiki/HMAC) (HMAC) - HKDF-SHA-256: \
[HMAC-SHA-256-based Key Derivation \
Function](https://en.wikipedia.org/wiki/HKDF) (HKDF) \
 \
conforming to [RFC6234](https://tools.ietf.org/html/rfc6234), \
[RFC4231](https://tools.ietf.org/html/rfc4231), \
[RFC5869](https://tools.ietf.org/html/rfc5869), et al.. \
 \
=== Relationship to the 'cryptohash' package and its API \
 \
This package has been originally a fork of 'cryptohash-0.11.7' because the \
'cryptohash' package had been deprecated and so this package continues to \
satisfy the need for a lightweight package providing the SHA-256 hash algorithm \
without any dependencies on packages other than 'base' and 'bytestring'. \
The API exposed by 'cryptohash-sha256-0.11.*''s 'Crypto.Hash.SHA256' module is \
guaranteed to remain a compatible superset of the API provided by the \
'cryptohash-0.11.7''s module of the same name. \
 \
Consequently, this package is designed to be used as a drop-in replacement for \
'cryptohash-0.11.7''s 'Crypto.Hash.SHA256' module, though with a [clearly \
smaller footprint by almost 3 orders of \
magnitude](https://www.reddit.com/r/haskell/comments/5lxv75/psa_please_use_unique_module_names_when_uploading/dbzegx3/)."
LICENSE = "BSD-3-Clause"

PV = "0.11.102.1"

RPM_NAME = "ghc-cryptohash-sha256-0.11.102.1-7.15.aarch64.rpm"
RPM_HASH = "80eda56f72c94c08c6ad9b75a3b237ff52c5e63e26b1dd34c08858ca70cf063fe22a8009fd08e40bebfd3acd2ff838826de0c099011b3c2c886259301fc4cca7"

RPROVIDES:${PN} += "ghc-cryptohash-sha256 \
libHScryptohash-sha256-0.11.102.1-23ttH0Xv2YGR2bm1AVxTX-ghc9.12.4.so"

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
