SUMMARY = "GHC compiler and utilities"
DESCRIPTION = "This package contains the GHC compiler, tools and utilities. \
 \
The GHC libraries are provided by ghc-devel. \
To install all of GHC install package ghc."
LICENSE = "BSD-3-Clause"

PV = "9.12.4"

RPM_NAME = "ghc-compiler-9.12.4-1.3.aarch64.rpm"
RPM_HASH = "b2e3b03bc8d3c34424bbea6fed1344f61398e195f0a3026ea761c4af64211db8354f225c2ead27319fd947b95c1a886883bd2eb399d295cf0546d7e6abb361f4"

RPROVIDES:${PN} += "ghc-compiler \
hsc2hs"

RDEPENDS:${PN} += "/usr/bin/sh \
gcc \
ghc-base-devel \
ghc-filesystem \
libHSCabal-3.14.2.0-f8f4-ghc9.12.4.so \
libHSCabal-syntax-3.14.2.0-5c2f-ghc9.12.4.so \
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
libHSghc-toolchain-0.1.0.0-0278-ghc9.12.4.so \
libHSghci-9.12.4-0749-ghc9.12.4.so \
libHShaddock-api-2.32.0-a85f-ghc9.12.4.so \
libHShaddock-library-1.11.0-799c-ghc9.12.4.so \
libHShaskeline-0.8.4.1-767e-ghc9.12.4.so \
libHShpc-0.7.0.2-1e89-ghc9.12.4.so \
libHSmtl-2.3.2-37ef-ghc9.12.4.so \
libHSos-string-2.0.10-5320-ghc9.12.4.so \
libHSparsec-3.1.18.0-be05-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libHSprocess-1.6.26.1-905d-ghc9.12.4.so \
libHSrts-1.0.3-ghc9.12.4.so \
libHSrts-1.0.3-thr-ghc9.12.4.so \
libHSsemaphore-compat-1.0.0-cc95-ghc9.12.4.so \
libHSstm-2.5.3.1-6d74-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libHSterminfo-0.4.1.7-3afa-ghc9.12.4.so \
libHStext-2.1.4-cf23-ghc9.12.4.so \
libHStime-1.14-a7dc-ghc9.12.4.so \
libHStransformers-0.6.3.0-4709-ghc9.12.4.so \
libHSunix-2.8.8.0-178a-ghc9.12.4.so \
libHSxhtml-3000.2.2.1-fadd-ghc9.12.4.so \
libc.so.6 \
libffi.so.8 \
libgmp.so.10 \
libm.so.6 \
libnuma.so.1 \
libtinfo.so.6"

inherit rpm
