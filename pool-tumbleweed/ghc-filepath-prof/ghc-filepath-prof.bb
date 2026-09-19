SUMMARY = "Haskell filepath profiling library"
DESCRIPTION = "This package provides the Haskell filepath profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.5.5.0"

RPM_NAME = "ghc-filepath-prof-1.5.5.0-1.3.aarch64.rpm"
RPM_HASH = "56f2396af52087d520e1a3c515128798fa236c045d5a246e58bb928ae4fa4592756bbfba5b788fc15ad20b69abc563e5951c79b2dbb3408a8f5148d37a7c5635"

RPROVIDES:${PN} += "ghc-filepath-prof \
ghc-prof-filepath-1.5.5.0-b25b \
libHSfilepath-1.5.5.0-b25b-p-ghc9.12.4.so"

RDEPENDS:${PN} += "ghc-filepath-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-deepseq-1.5.1.0-1350 \
ghc-prof-exceptions-0.10.12-f655 \
ghc-prof-os-string-2.0.10-5320 \
ghc-prof-template-haskell-2.23.0.0-358a \
libHSarray-0.5.8.0-2a42-p-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-p-ghc9.12.4.so \
libHSbytestring-0.12.2.0-65be-p-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-p-ghc9.12.4.so \
libHSexceptions-0.10.12-f655-p-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-p-ghc9.12.4.so \
libHSghc-boot-th-9.12.4-0605-p-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-p-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-p-ghc9.12.4.so \
libHSmtl-2.3.2-37ef-p-ghc9.12.4.so \
libHSos-string-2.0.10-5320-p-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-p-ghc9.12.4.so \
libHSstm-2.5.3.1-6d74-p-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-p-ghc9.12.4.so \
libHStransformers-0.6.3.0-4709-p-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
