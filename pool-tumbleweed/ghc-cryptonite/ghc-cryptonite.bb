SUMMARY = "Cryptography Primitives sink"
DESCRIPTION = "A repository of cryptographic primitives. \
 \
* Symmetric ciphers: AES, DES, 3DES, CAST5, Blowfish, Twofish, Camellia, RC4, \
Salsa, XSalsa, ChaCha. \
 \
* Hash: SHA1, SHA2, SHA3, SHAKE, MD2, MD4, MD5, Keccak, Skein, Ripemd, Tiger, \
Whirlpool, Blake2 \
 \
* MAC: HMAC, KMAC, Poly1305 \
 \
* Asymmetric crypto: DSA, RSA, DH, ECDH, ECDSA, ECC, Curve25519, Curve448, \
Ed25519, Ed448 \
 \
* Key Derivation Function: PBKDF2, Scrypt, HKDF, Argon2, BCrypt, BCryptPBKDF \
 \
* Cryptographic Random generation: System Entropy, Deterministic Random \
Generator \
 \
* Data related: Anti-Forensic Information Splitter (AFIS) \
 \
If anything cryptographic related is missing from here, submit a pull request \
to have it added. This package strives to be a cryptographic kitchen sink that \
provides cryptography for everyone. \
 \
Evaluate the security related to your requirements before using. \
 \
Read 'Crypto.Tutorial' for a quick start guide."
LICENSE = "BSD-3-Clause"

PV = "0.30"

RPM_NAME = "ghc-cryptonite-0.30-2.36.aarch64.rpm"
RPM_HASH = "2793da20229520f7c2f574532b8ed90a83d282dc034261a693c9175f452d3f14a7efafc5ec3c0a6497a2bc0a8ded7e0f1c90f20ee31d102457929418190c7254"

RPROVIDES:${PN} += "ghc-cryptonite \
libHScryptonite-0.30-LDHPOjDfFNPE9tRl2y8VSO-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSbasement-0.0.16-EFfarL5MHPIHNlTrgpSdN2-ghc9.12.4.so \
libHSbytestring-0.12.2.0-65be-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-boot-th-9.12.4-0605-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHSinteger-gmp-1.1-09fd-ghc9.12.4.so \
libHSmemory-0.18.0-4OCVGiXkS6t9StTfiwlZlu-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
