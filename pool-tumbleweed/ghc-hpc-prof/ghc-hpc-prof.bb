SUMMARY = "Haskell hpc profiling library"
DESCRIPTION = "This package provides the Haskell hpc profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.7.0.2"

RPM_NAME = "ghc-hpc-prof-0.7.0.2-1.3.aarch64.rpm"
RPM_HASH = "17503f3137d73a431ee5a8a605f6693ae3da3fe36bbde93510f5f4f6df2641adea99c506d31a85745bbcdabe3a5ed23c538b2d898f05d13530700d6caa34db59"

RPROVIDES:${PN} += "ghc-hpc-prof \
ghc-prof-hpc-0.7.0.2-1e89 \
libHShpc-0.7.0.2-1e89-p-ghc9.12.4.so"

RDEPENDS:${PN} += "ghc-hpc-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-deepseq-1.5.1.0-1350 \
ghc-prof-directory-1.3.10.1-b1d7 \
ghc-prof-filepath-1.5.5.0-b25b \
ghc-prof-time-1.14-a7dc \
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
libHSstm-2.5.3.1-6d74-p-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-p-ghc9.12.4.so \
libHStime-1.14-a7dc-p-ghc9.12.4.so \
libHStransformers-0.6.3.0-4709-p-ghc9.12.4.so \
libHSunix-2.8.8.0-178a-p-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
