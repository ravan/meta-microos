SUMMARY = "Haskell unix profiling library"
DESCRIPTION = "This package provides the Haskell unix profiling library."
LICENSE = "BSD-3-Clause"

PV = "2.8.8.0"

RPM_NAME = "ghc-unix-prof-2.8.8.0-1.3.aarch64.rpm"
RPM_HASH = "ff44e4b856d0aa9d614a92788e92040ade84d2c96b376ed3cccbe1e0f8456062bbbd6316cad6e9a0556f3a63f895bc594e0a3e96bb3d63605c942add7868fdb4"

RPROVIDES:${PN} += "ghc-prof-unix-2.8.8.0-178a \
ghc-unix-prof \
libHSunix-2.8.8.0-178a-p-ghc9.12.4.so"

RDEPENDS:${PN} += "ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-filepath-1.5.5.0-b25b \
ghc-prof-os-string-2.0.10-5320 \
ghc-prof-time-1.14-a7dc \
ghc-unix-devel \
libHSarray-0.5.8.0-2a42-p-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-p-ghc9.12.4.so \
libHSbytestring-0.12.2.0-65be-p-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-p-ghc9.12.4.so \
libHSexceptions-0.10.12-f655-p-ghc9.12.4.so \
libHSfilepath-1.5.5.0-b25b-p-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-p-ghc9.12.4.so \
libHSghc-boot-th-9.12.4-0605-p-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-p-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-p-ghc9.12.4.so \
libHSmtl-2.3.2-37ef-p-ghc9.12.4.so \
libHSos-string-2.0.10-5320-p-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-p-ghc9.12.4.so \
libHSstm-2.5.3.1-6d74-p-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-p-ghc9.12.4.so \
libHStime-1.14-a7dc-p-ghc9.12.4.so \
libHStransformers-0.6.3.0-4709-p-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
