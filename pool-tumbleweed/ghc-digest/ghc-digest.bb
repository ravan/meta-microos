SUMMARY = "CRC32 and Adler32 hashes for bytestrings"
DESCRIPTION = "This package provides efficient hash implementations for strict and lazy \
bytestrings. For now, CRC32 and Adler32 are supported; they are implemented as \
FFI bindings to efficient code from zlib."
LICENSE = "BSD-2-Clause"

PV = "0.0.2.1"

RPM_NAME = "ghc-digest-0.0.2.1-1.25.aarch64.rpm"
RPM_HASH = "8592536f93016892c47da5552acab4e3bba5ed407c9d8f64541c4bff9cf07684a241744c25031b5164ac52615a3a88f893def24bab0fd2bbcbab302a5d2bf7c5"

RPROVIDES:${PN} += "ghc-digest \
libHSdigest-0.0.2.1-KdJahDzYM113RUTsWm7UXN-ghc9.12.4.so"

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
