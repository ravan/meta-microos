SUMMARY = "Data encoding library"
DESCRIPTION = "Reasonably fast data encoding library."
LICENSE = "BSD-3-Clause"

PV = "0.5"

RPM_NAME = "ghc-sandi-0.5-5.60.aarch64.rpm"
RPM_HASH = "7c1c63d501971ae4a86f0c51e7d0ccb64ddf09045a569f1814644feea41e73dbcc7a979232e31214ceb19709c493da83fa4f51bef5d0a07e5dfc8c08a08b3dc3"

RPROVIDES:${PN} += "ghc-sandi \
libHSsandi-0.5-CSReKcZE4oMHyrsoFuQsxn-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSarray-0.5.8.0-2a42-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSbinary-0.8.9.3-9861-ghc9.12.4.so \
libHSbitvec-1.1.6.0-AtnZIEu4pqlECh34uLjm5P-ghc9.12.4.so \
libHSbytestring-0.12.2.0-65be-ghc9.12.4.so \
libHSconduit-1.3.6.1-DuJaiNNDon54jV6QjcNayt-ghc9.12.4.so \
libHScontainers-0.7-d5e1-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSdirectory-1.3.10.1-b1d7-ghc9.12.4.so \
libHSexceptions-0.10.12-f655-ghc9.12.4.so \
libHSfile-io-0.1.6-8374-ghc9.12.4.so \
libHSfilepath-1.5.5.0-b25b-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-boot-th-9.12.4-0605-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHShashable-1.5.1.0-csiQUH7RkN8TUlZyJbFpr-ghc9.12.4.so \
libHSmono-traversable-1.0.21.0-7NlL4qRFn1MB3sC5GPCjes-ghc9.12.4.so \
libHSmtl-2.3.2-37ef-ghc9.12.4.so \
libHSos-string-2.0.10-5320-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libHSprimitive-0.9.1.0-Ez30Vu7tivmF28X1123Css-ghc9.12.4.so \
libHSresourcet-1.3.0-F8ZRgExkptBLIQxE9m0AZE-ghc9.12.4.so \
libHSsplit-0.2.5-DF0qBqNymX3Hv5Ta0307xc-ghc9.12.4.so \
libHSstm-2.5.3.1-6d74-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libHStext-2.1.4-cf23-ghc9.12.4.so \
libHStime-1.14-a7dc-ghc9.12.4.so \
libHStransformers-0.6.3.0-4709-ghc9.12.4.so \
libHSunix-2.8.8.0-178a-ghc9.12.4.so \
libHSunliftio-core-0.2.1.0-HFUY5mS3bsg3RW1edumY92-ghc9.12.4.so \
libHSunordered-containers-0.2.21-BkBQHKMtdH7EKz6YnT01Lu-ghc9.12.4.so \
libHSvector-0.13.2.0-F8givqpU8HnLN0O3dVdeWE-ghc9.12.4.so \
libHSvector-algorithms-0.9.1.0-KRcdYzVzgLOFSifxDHEL6p-ghc9.12.4.so \
libHSvector-stream-0.1.0.1-FXRnPnZDT7tJ4JCMEuh1XF-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
