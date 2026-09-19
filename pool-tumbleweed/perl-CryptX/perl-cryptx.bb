SUMMARY = "Cryptographic toolkit"
DESCRIPTION = "Perl cryptographic modules built on the bundled at \
https://github.com/libtom/libtomcrypt library. The distribution also \
includes Math::BigInt::LTM, a Math::BigInt backend built on the bundled at \
https://www.libtom.net/LibTomMath/ library used internally by LibTomCrypt. \
 \
This module mainly serves as the top-level distribution/documentation page. \
For actual work, use one of the concrete modules listed below."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.91.0"

RPM_NAME = "perl-CryptX-0.91.0-1.1.aarch64.rpm"
RPM_HASH = "eed66cfc0845fe2cf25e6b653f712231f6a626ca8d5451b4c624d19c7bca85007c8af256db1dc489290684c2f3b08d598a116deb48f6529b781bf3c28e0f4a96"

RPROVIDES:${PN} += "perl-Crypt--ASN1 \
perl-Crypt--AuthEnc \
perl-Crypt--AuthEnc--CCM \
perl-Crypt--AuthEnc--ChaCha20Poly1305 \
perl-Crypt--AuthEnc--EAX \
perl-Crypt--AuthEnc--GCM \
perl-Crypt--AuthEnc--GCMSIV \
perl-Crypt--AuthEnc--OCB \
perl-Crypt--AuthEnc--SIV \
perl-Crypt--AuthEnc--XChaCha20Poly1305 \
perl-Crypt--Checksum \
perl-Crypt--Checksum--Adler32 \
perl-Crypt--Checksum--CRC32 \
perl-Crypt--Cipher \
perl-Crypt--Cipher--AES \
perl-Crypt--Cipher--ARIA \
perl-Crypt--Cipher--Anubis \
perl-Crypt--Cipher--Blowfish \
perl-Crypt--Cipher--CAST5 \
perl-Crypt--Cipher--Camellia \
perl-Crypt--Cipher--DES \
perl-Crypt--Cipher--DES-EDE \
perl-Crypt--Cipher--IDEA \
perl-Crypt--Cipher--KASUMI \
perl-Crypt--Cipher--Khazad \
perl-Crypt--Cipher--MULTI2 \
perl-Crypt--Cipher--Noekeon \
perl-Crypt--Cipher--RC2 \
perl-Crypt--Cipher--RC5 \
perl-Crypt--Cipher--RC6 \
perl-Crypt--Cipher--SAFER-K128 \
perl-Crypt--Cipher--SAFER-K64 \
perl-Crypt--Cipher--SAFER-SK128 \
perl-Crypt--Cipher--SAFER-SK64 \
perl-Crypt--Cipher--SAFERP \
perl-Crypt--Cipher--SEED \
perl-Crypt--Cipher--SM4 \
perl-Crypt--Cipher--Serpent \
perl-Crypt--Cipher--Skipjack \
perl-Crypt--Cipher--Twofish \
perl-Crypt--Cipher--XTEA \
perl-Crypt--Digest \
perl-Crypt--Digest--BLAKE2b-160 \
perl-Crypt--Digest--BLAKE2b-256 \
perl-Crypt--Digest--BLAKE2b-384 \
perl-Crypt--Digest--BLAKE2b-512 \
perl-Crypt--Digest--BLAKE2s-128 \
perl-Crypt--Digest--BLAKE2s-160 \
perl-Crypt--Digest--BLAKE2s-224 \
perl-Crypt--Digest--BLAKE2s-256 \
perl-Crypt--Digest--BLAKE3 \
perl-Crypt--Digest--CHAES \
perl-Crypt--Digest--KangarooTwelve \
perl-Crypt--Digest--Keccak224 \
perl-Crypt--Digest--Keccak256 \
perl-Crypt--Digest--Keccak384 \
perl-Crypt--Digest--Keccak512 \
perl-Crypt--Digest--MD2 \
perl-Crypt--Digest--MD4 \
perl-Crypt--Digest--MD5 \
perl-Crypt--Digest--RIPEMD128 \
perl-Crypt--Digest--RIPEMD160 \
perl-Crypt--Digest--RIPEMD256 \
perl-Crypt--Digest--RIPEMD320 \
perl-Crypt--Digest--SHA1 \
perl-Crypt--Digest--SHA224 \
perl-Crypt--Digest--SHA256 \
perl-Crypt--Digest--SHA3-224 \
perl-Crypt--Digest--SHA3-256 \
perl-Crypt--Digest--SHA3-384 \
perl-Crypt--Digest--SHA3-512 \
perl-Crypt--Digest--SHA384 \
perl-Crypt--Digest--SHA512 \
perl-Crypt--Digest--SHA512-224 \
perl-Crypt--Digest--SHA512-256 \
perl-Crypt--Digest--SHAKE \
perl-Crypt--Digest--SM3 \
perl-Crypt--Digest--Tiger192 \
perl-Crypt--Digest--TurboSHAKE \
perl-Crypt--Digest--Whirlpool \
perl-Crypt--KeyDerivation \
perl-Crypt--Mac \
perl-Crypt--Mac--BLAKE2b \
perl-Crypt--Mac--BLAKE2s \
perl-Crypt--Mac--F9 \
perl-Crypt--Mac--HMAC \
perl-Crypt--Mac--KMAC \
perl-Crypt--Mac--OMAC \
perl-Crypt--Mac--PMAC \
perl-Crypt--Mac--Pelican \
perl-Crypt--Mac--Poly1305 \
perl-Crypt--Mac--XCBC \
perl-Crypt--Misc \
perl-Crypt--Mode \
perl-Crypt--Mode--CBC \
perl-Crypt--Mode--CFB \
perl-Crypt--Mode--CTR \
perl-Crypt--Mode--ECB \
perl-Crypt--Mode--OFB \
perl-Crypt--Mode--XTS \
perl-Crypt--PK \
perl-Crypt--PK--DH \
perl-Crypt--PK--DSA \
perl-Crypt--PK--ECC \
perl-Crypt--PK--Ed25519 \
perl-Crypt--PK--Ed448 \
perl-Crypt--PK--RSA \
perl-Crypt--PK--X25519 \
perl-Crypt--PK--X448 \
perl-Crypt--PRNG \
perl-Crypt--PRNG--ChaCha20 \
perl-Crypt--PRNG--Fortuna \
perl-Crypt--PRNG--RC4 \
perl-Crypt--PRNG--Sober128 \
perl-Crypt--PRNG--Yarrow \
perl-Crypt--Stream--ChaCha \
perl-Crypt--Stream--RC4 \
perl-Crypt--Stream--Rabbit \
perl-Crypt--Stream--Salsa20 \
perl-Crypt--Stream--Sober128 \
perl-Crypt--Stream--Sosemanuk \
perl-Crypt--Stream--XChaCha \
perl-Crypt--Stream--XSalsa20 \
perl-CryptX \
perl-Math--BigInt--LTM"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
