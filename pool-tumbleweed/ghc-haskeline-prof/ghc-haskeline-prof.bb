SUMMARY = "Haskell haskeline profiling library"
DESCRIPTION = "This package provides the Haskell haskeline profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.8.4.1"

RPM_NAME = "ghc-haskeline-prof-0.8.4.1-1.3.aarch64.rpm"
RPM_HASH = "f186b66839e54e9cf8de22dbdfe1930315a3ed6f2bf8125e3bbbf40d8d6820395f5b96c27a68582441341b4bbfab96e79f7d35aaf548d7cd879b9159269933e3"

RPROVIDES:${PN} += "ghc-haskeline-prof \
ghc-prof-haskeline-0.8.4.1-767e \
libHShaskeline-0.8.4.1-767e-p-ghc9.12.4.so"

RDEPENDS:${PN} += "ghc-haskeline-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-directory-1.3.10.1-b1d7 \
ghc-prof-exceptions-0.10.12-f655 \
ghc-prof-filepath-1.5.5.0-b25b \
ghc-prof-process-1.6.26.1-905d \
ghc-prof-stm-2.5.3.1-6d74 \
ghc-prof-terminfo-0.4.1.7-3afa \
ghc-prof-transformers-0.6.3.0-4709 \
ghc-prof-unix-2.8.8.0-178a \
libHSarray-0.5.8.0-2a42-p-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-p-ghc9.12.4.so \
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
libHSpretty-1.1.3.6-b7fd-p-ghc9.12.4.so \
libHSprocess-1.6.26.1-905d-p-ghc9.12.4.so \
libHSstm-2.5.3.1-6d74-p-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-p-ghc9.12.4.so \
libHSterminfo-0.4.1.7-3afa-p-ghc9.12.4.so \
libHStime-1.14-a7dc-p-ghc9.12.4.so \
libHStransformers-0.6.3.0-4709-p-ghc9.12.4.so \
libHSunix-2.8.8.0-178a-p-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libtinfo.so.6"

inherit rpm
