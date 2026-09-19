SUMMARY = "Type definitions for Universally Unique Identifiers"
DESCRIPTION = "This library contains type definitions for <https://en.wikipedia.org/wiki/UUID \
Universally Unique Identifiers (UUID)> (as specified in \
<http://tools.ietf.org/html/rfc4122 RFC 4122>) and basic conversion functions. \
 \
See also the <https://hackage.haskell.org/package/uuid 'uuid' package> \
providing a high-level API for managing the different UUID versions."
LICENSE = "BSD-3-Clause"

PV = "1.0.6.1"

RPM_NAME = "ghc-uuid-types-1.0.6.1-1.3.aarch64.rpm"
RPM_HASH = "a0e7397baf4f45b58e58fc6a2e57023b671f0a88306ce97fc77f60196e128c1c93b65de3fcc06e5e39226aa300d2b2f60fd37c4804cf114e57f6a8db529b6d59"

RPROVIDES:${PN} += "ghc-uuid-types \
libHSuuid-types-1.0.6.1-Hjv8dqZq3Ya2vXZL2YjpUd-ghc9.12.4.so"

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
libHShashable-1.5.1.0-csiQUH7RkN8TUlZyJbFpr-ghc9.12.4.so \
libHSmtl-2.3.2-37ef-ghc9.12.4.so \
libHSos-string-2.0.10-5320-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libHSrandom-1.3.1-JfaDd4Q5FuLKGb9yRr3GDh-ghc9.12.4.so \
libHSsplitmix-0.1.3.2-4FIxgclJzmILwETMtGxhg4-ghc9.12.4.so \
libHSstm-2.5.3.1-6d74-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libHStext-2.1.4-cf23-ghc9.12.4.so \
libHStransformers-0.6.3.0-4709-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
