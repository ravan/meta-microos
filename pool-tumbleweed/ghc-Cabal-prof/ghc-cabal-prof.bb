SUMMARY = "Haskell Cabal profiling library"
DESCRIPTION = "This package provides the Haskell Cabal profiling library."
LICENSE = "BSD-3-Clause"

PV = "3.14.2.0"

RPM_NAME = "ghc-Cabal-prof-3.14.2.0-1.3.aarch64.rpm"
RPM_HASH = "6064491565773a932985fedbcb7a806fb4647c9adb1e794c842348357ba8e5b2d93e567d87e1d4cf6d290790b876b198769d52d3c5895caa2dd2498fef4056e1"

RPROVIDES:${PN} += "ghc-Cabal-prof \
ghc-prof-Cabal-3.14.2.0-f8f4 \
libHSCabal-3.14.2.0-f8f4-p-ghc9.12.4.so"

RDEPENDS:${PN} += "ghc-Cabal-devel \
ghc-prof-Cabal-syntax-3.14.2.0-5c2f \
ghc-prof-array-0.5.8.0-2a42 \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-deepseq-1.5.1.0-1350 \
ghc-prof-directory-1.3.10.1-b1d7 \
ghc-prof-filepath-1.5.5.0-b25b \
ghc-prof-mtl-2.3.2-37ef \
ghc-prof-parsec-3.1.18.0-be05 \
ghc-prof-pretty-1.1.3.6-b7fd \
ghc-prof-process-1.6.26.1-905d \
ghc-prof-time-1.14-a7dc \
ghc-prof-transformers-0.6.3.0-4709 \
ghc-prof-unix-2.8.8.0-178a \
libHSCabal-syntax-3.14.2.0-5c2f-p-ghc9.12.4.so \
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
libHSghc-bignum-1.3-03b0-p-ghc9.12.4.so \
libHSghc-boot-th-9.12.4-0605-p-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-p-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-p-ghc9.12.4.so \
libHSmtl-2.3.2-37ef-p-ghc9.12.4.so \
libHSos-string-2.0.10-5320-p-ghc9.12.4.so \
libHSparsec-3.1.18.0-be05-p-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-p-ghc9.12.4.so \
libHSprocess-1.6.26.1-905d-p-ghc9.12.4.so \
libHSstm-2.5.3.1-6d74-p-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-p-ghc9.12.4.so \
libHStext-2.1.4-cf23-p-ghc9.12.4.so \
libHStime-1.14-a7dc-p-ghc9.12.4.so \
libHStransformers-0.6.3.0-4709-p-ghc9.12.4.so \
libHSunix-2.8.8.0-178a-p-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
