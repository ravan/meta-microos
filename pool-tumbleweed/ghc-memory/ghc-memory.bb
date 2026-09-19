SUMMARY = "Memory and related abstraction stuff"
DESCRIPTION = "Chunk of memory, polymorphic byte array management and manipulation \
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

PV = "0.18.0"

RPM_NAME = "ghc-memory-0.18.0-3.14.aarch64.rpm"
RPM_HASH = "03674c4e35592fc75f90396b4550052d8771a3293bfceca8f4ae740380928073f04e786f000314d738760b2cf784110ea092900fe01871a5e31be3b61b267f1f"

RPROVIDES:${PN} += "ghc-memory \
libHSmemory-0.18.0-4OCVGiXkS6t9StTfiwlZlu-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSbasement-0.0.16-EFfarL5MHPIHNlTrgpSdN2-ghc9.12.4.so \
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
