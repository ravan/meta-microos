SUMMARY = "Memory and related abstraction stuff"
DESCRIPTION = "This is a fork of memory. It's open to accept changes from anyone, and aims to \
use existing well maintained libraries as much as possible. \
 \
Chunk of memory, polymorphic byte array management and manipulation \
 \
* A polymorphic byte array abstraction and function similar to strict \
ByteString. \
 \
* Different type of byte array abstraction. \
 \
* Raw memory IO operations (memory set, memory copy, ..) \
 \
* Aliasing with endianness support. \
 \
* Encoding : Base16, Base32, Base64. \
 \
* Hashing : FNV, SipHash."
LICENSE = "BSD-3-Clause"

PV = "0.22.0"

RPM_NAME = "ghc-ram-0.22.0-1.3.aarch64.rpm"
RPM_HASH = "d71ec2d35098ff2199f7f20f73ff651ceb9075de7e96a6a68cec237bffe00f19b824d844577c7f201dcc3670bfccdf261da0aa1b3337935780d9fe8de295c5ce"

RPROVIDES:${PN} += "ghc-ram \
libHSram-0.22.0-4Io46KcWliV5ncwh4lemlr-ghc9.12.4.so"

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
