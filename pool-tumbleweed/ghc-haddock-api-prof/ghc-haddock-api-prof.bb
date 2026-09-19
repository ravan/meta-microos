SUMMARY = "Haskell haddock-api profiling library"
DESCRIPTION = "This package provides the Haskell haddock-api profiling library."
LICENSE = "BSD-3-Clause"

PV = "2.32.0"

RPM_NAME = "ghc-haddock-api-prof-2.32.0-1.3.aarch64.rpm"
RPM_HASH = "b865791ede9d97faeffc342601ab582154daf00cb7a618514a58f36b710c14ee0f8471fd2418ed91c5243ae32eaeaa2964e954bb3718d7fc6cfebf581b538ca3"

RPROVIDES:${PN} += "ghc-haddock-api-prof \
ghc-prof-haddock-api-2.32.0-a85f \
libHShaddock-api-2.32.0-a85f-p-ghc9.12.4.so"

RDEPENDS:${PN} += "ghc-haddock-api-devel \
ghc-prof-array-0.5.8.0-2a42 \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-deepseq-1.5.1.0-1350 \
ghc-prof-directory-1.3.10.1-b1d7 \
ghc-prof-exceptions-0.10.12-f655 \
ghc-prof-filepath-1.5.5.0-b25b \
ghc-prof-ghc-9.12.4-ced2 \
ghc-prof-ghc-boot-9.12.4-a5b3 \
ghc-prof-haddock-library-1.11.0-799c \
ghc-prof-mtl-2.3.2-37ef \
ghc-prof-parsec-3.1.18.0-be05 \
ghc-prof-transformers-0.6.3.0-4709 \
ghc-prof-unix-2.8.8.0-178a \
ghc-prof-xhtml-3000.2.2.1-fadd \
libHSarray-0.5.8.0-2a42-p-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-p-ghc9.12.4.so \
libHSbinary-0.8.9.3-9861-p-ghc9.12.4.so \
libHSbytestring-0.12.2.0-65be-p-ghc9.12.4.so \
libHScontainers-0.7-d5e1-p-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-p-ghc9.12.4.so \
libHSdirectory-1.3.10.1-b1d7-p-ghc9.12.4.so \
libHSexceptions-0.10.12-f655-p-ghc9.12.4.so \
libHSfile-io-0.1.6-8374-p-ghc9.12.4.so \
libHSfilepath-1.5.5.0-b25b-p-ghc9.12.4.so \
libHSghc-9.12.4-ced2-p-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-p-ghc9.12.4.so \
libHSghc-boot-9.12.4-a5b3-p-ghc9.12.4.so \
libHSghc-boot-th-9.12.4-0605-p-ghc9.12.4.so \
libHSghc-heap-9.12.4-167c-p-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-p-ghc9.12.4.so \
libHSghc-platform-0.1.0.0-ac24-p-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-p-ghc9.12.4.so \
libHSghci-9.12.4-0749-p-ghc9.12.4.so \
libHShaddock-library-1.11.0-799c-p-ghc9.12.4.so \
libHShpc-0.7.0.2-1e89-p-ghc9.12.4.so \
libHSmtl-2.3.2-37ef-p-ghc9.12.4.so \
libHSos-string-2.0.10-5320-p-ghc9.12.4.so \
libHSparsec-3.1.18.0-be05-p-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-p-ghc9.12.4.so \
libHSprocess-1.6.26.1-905d-p-ghc9.12.4.so \
libHSsemaphore-compat-1.0.0-cc95-p-ghc9.12.4.so \
libHSstm-2.5.3.1-6d74-p-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-p-ghc9.12.4.so \
libHStext-2.1.4-cf23-p-ghc9.12.4.so \
libHStime-1.14-a7dc-p-ghc9.12.4.so \
libHStransformers-0.6.3.0-4709-p-ghc9.12.4.so \
libHSunix-2.8.8.0-178a-p-ghc9.12.4.so \
libHSxhtml-3000.2.2.1-fadd-p-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
