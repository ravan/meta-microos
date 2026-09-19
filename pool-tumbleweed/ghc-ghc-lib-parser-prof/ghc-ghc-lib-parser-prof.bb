SUMMARY = "Haskell ghc-lib-parser profiling library"
DESCRIPTION = "This package provides the Haskell ghc-lib-parser profiling library."
LICENSE = "BSD-3-Clause"

PV = "9.12.3.20251228"

RPM_NAME = "ghc-ghc-lib-parser-prof-9.12.3.20251228-1.3.aarch64.rpm"
RPM_HASH = "759fa407514cbb804dc6f4a5ea7276183238350f5542a750229ecea9f573007e8e56bec110f7652829c8d77ed2339df7e0ba1e8ae4dfd43ebe87d7a3608857c9"

RPROVIDES:${PN} += "ghc-ghc-lib-parser-prof \
ghc-prof-ghc-lib-parser-9.12.3.20251228-A26EZnaiNey14MMYQvPU7L"

RDEPENDS:${PN} += "ghc-ghc-lib-parser-devel \
ghc-prof-array-0.5.8.0-2a42 \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-binary-0.8.9.3-9861 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-deepseq-1.5.1.0-1350 \
ghc-prof-directory-1.3.10.1-b1d7 \
ghc-prof-exceptions-0.10.12-f655 \
ghc-prof-filepath-1.5.5.0-b25b \
ghc-prof-ghc-internal-9.1204.0-f1e1 \
ghc-prof-ghc-prim-0.13.0-f55c \
ghc-prof-hpc-0.7.0.2-1e89 \
ghc-prof-os-string-2.0.10-5320 \
ghc-prof-parsec-3.1.18.0-be05 \
ghc-prof-pretty-1.1.3.6-b7fd \
ghc-prof-process-1.6.26.1-905d \
ghc-prof-time-1.14-a7dc \
ghc-prof-transformers-0.6.3.0-4709 \
ghc-prof-unix-2.8.8.0-178a"

inherit rpm
