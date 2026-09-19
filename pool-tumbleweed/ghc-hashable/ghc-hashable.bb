SUMMARY = "A class for types that can be converted to a hash value"
DESCRIPTION = "This package defines a class, 'Hashable', for types that can be converted to a \
hash value. This class exists for the benefit of hashing-based data structures. \
The package provides instances for basic types and a way to combine hash \
values. \
 \
'Hashable' is intended exclusively for use in in-memory data structures. \
 \
'Hashable' does /not/ have a fixed standard. This allows it to improve over \
time. \
 \
Because it does not have a fixed standard, different computers or computers on \
different versions of the code will observe different hash values. As such, \
'hashable' is not recommended for use other than in-memory datastructures. \
Specifically, 'hashable' is not intended for network use or in applications \
which persist hashed values. For stable hashing use named hashes: sha256, \
crc32, xxhash etc."
LICENSE = "BSD-3-Clause"

PV = "1.5.1.0"

RPM_NAME = "ghc-hashable-1.5.1.0-1.3.aarch64.rpm"
RPM_HASH = "8d0465da904c6583a107d9682fe697f6f3673a6f3b8384d38a587d6852fa40b9c72687860db86f18573827afbfbfd8cd9c3be08c1a6f5c07937c1400e2928d78"

RPROVIDES:${PN} += "ghc-hashable \
libHShashable-1.5.1.0-csiQUH7RkN8TUlZyJbFpr-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSarray-0.5.8.0-2a42-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSbinary-0.8.9.3-9861-ghc9.12.4.so \
libHSbytestring-0.12.2.0-65be-ghc9.12.4.so \
libHScontainers-0.7-d5e1-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSexceptions-0.10.12-f655-ghc9.12.4.so \
libHSfilepath-1.5.5.0-b25b-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-boot-th-9.12.4-0605-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHSmtl-2.3.2-37ef-ghc9.12.4.so \
libHSos-string-2.0.10-5320-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libHSstm-2.5.3.1-6d74-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libHStext-2.1.4-cf23-ghc9.12.4.so \
libHStransformers-0.6.3.0-4709-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
