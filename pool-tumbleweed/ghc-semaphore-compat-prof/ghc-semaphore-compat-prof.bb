SUMMARY = "Haskell semaphore-compat profiling library"
DESCRIPTION = "This package provides the Haskell semaphore-compat profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.0.0"

RPM_NAME = "ghc-semaphore-compat-prof-1.0.0-1.3.aarch64.rpm"
RPM_HASH = "49b644c51056fcd8152b4ff0f58409a2617e006181886f5031e816cf7b5291460b1eeb0d849b24a147764ece2621d1230dfb5e37ccae42b9924127d0bff0a099"

RPROVIDES:${PN} += "ghc-prof-semaphore-compat-1.0.0-cc95 \
ghc-semaphore-compat-prof \
libHSsemaphore-compat-1.0.0-cc95-p-ghc9.12.4.so"

RDEPENDS:${PN} += "ghc-prof-base-4.21.2.0-8844 \
ghc-prof-exceptions-0.10.12-f655 \
ghc-prof-unix-2.8.8.0-178a \
ghc-semaphore-compat-devel \
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
libHSunix-2.8.8.0-178a-p-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
