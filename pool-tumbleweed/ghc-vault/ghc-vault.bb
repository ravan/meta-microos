SUMMARY = "A persistent store for values of arbitrary types"
DESCRIPTION = "A /vault/ is a persistent store for values of arbitrary types. It's like having \
first-class access to the storage space behind IORefs. . The data structure is \
analogous to a bank vault, where you can access different bank boxes with \
different keys; hence the name. . Also provided is a /locker/ type, \
representing a store for a single element."
LICENSE = "BSD-3-Clause"

PV = "0.3.2.0"

RPM_NAME = "ghc-vault-0.3.2.0-1.2.aarch64.rpm"
RPM_HASH = "180add67593c41f1e5875c607fbc8ddd3b5af765ca9d788eff6cfe5b96f61040f055c84df565e2daf932c7c227e5aa6f5763088c2e333f802a67f163a04fe101"

RPROVIDES:${PN} += "ghc-vault \
libHSvault-0.3.2.0-GYOqPpJA2DW5Qz2IFtkvei-ghc9.12.4.so"

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
libHSstm-2.5.3.1-6d74-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libHStext-2.1.4-cf23-ghc9.12.4.so \
libHStransformers-0.6.3.0-4709-ghc9.12.4.so \
libHSunordered-containers-0.2.21-BkBQHKMtdH7EKz6YnT01Lu-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
