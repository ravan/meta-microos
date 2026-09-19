SUMMARY = "Haskell haddock-api library"
DESCRIPTION = "This package provides the Haskell haddock-api library."
LICENSE = "BSD-3-Clause"

PV = "2.32.0"

RPM_NAME = "ghc-haddock-api-2.32.0-1.3.aarch64.rpm"
RPM_HASH = "dbad945804341c6588c73ae5755c654f9f3b0ee8cc7f71ff15cea584f3e61408777c99d7e1c4c1e26ee967675bbd926266834d97068f582c0991c8d284dc50aa"

RPROVIDES:${PN} += "ghc-haddock-api \
libHShaddock-api-2.32.0-a85f-ghc9.12.4.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
libHSarray-0.5.8.0-2a42-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSbinary-0.8.9.3-9861-ghc9.12.4.so \
libHSbytestring-0.12.2.0-65be-ghc9.12.4.so \
libHScontainers-0.7-d5e1-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSdirectory-1.3.10.1-b1d7-ghc9.12.4.so \
libHSexceptions-0.10.12-f655-ghc9.12.4.so \
libHSfile-io-0.1.6-8374-ghc9.12.4.so \
libHSfilepath-1.5.5.0-b25b-ghc9.12.4.so \
libHSghc-9.12.4-ced2-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-boot-9.12.4-a5b3-ghc9.12.4.so \
libHSghc-boot-th-9.12.4-0605-ghc9.12.4.so \
libHSghc-heap-9.12.4-167c-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-platform-0.1.0.0-ac24-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHSghci-9.12.4-0749-ghc9.12.4.so \
libHShaddock-library-1.11.0-799c-ghc9.12.4.so \
libHShpc-0.7.0.2-1e89-ghc9.12.4.so \
libHSmtl-2.3.2-37ef-ghc9.12.4.so \
libHSos-string-2.0.10-5320-ghc9.12.4.so \
libHSparsec-3.1.18.0-be05-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libHSprocess-1.6.26.1-905d-ghc9.12.4.so \
libHSsemaphore-compat-1.0.0-cc95-ghc9.12.4.so \
libHSstm-2.5.3.1-6d74-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libHStext-2.1.4-cf23-ghc9.12.4.so \
libHStime-1.14-a7dc-ghc9.12.4.so \
libHStransformers-0.6.3.0-4709-ghc9.12.4.so \
libHSunix-2.8.8.0-178a-ghc9.12.4.so \
libHSxhtml-3000.2.2.1-fadd-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
