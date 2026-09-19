SUMMARY = "Haskell ghc-lib-parser library development files"
DESCRIPTION = "This package provides the Haskell ghc-lib-parser library development files."
LICENSE = "BSD-3-Clause"

PV = "9.12.3.20251228"

RPM_NAME = "ghc-ghc-lib-parser-devel-9.12.3.20251228-1.3.aarch64.rpm"
RPM_HASH = "bc25d343c7bc6c258d4a4859d8b11aa020c778c35ae5324b839b1062446adc2bbda2d78ac46082d5bb83e1a3c516d88cb26490977b874037933b2ab22fafe9f8"

RPROVIDES:${PN} += "ghc-devel-ghc-lib-parser-9.12.3.20251228-A26EZnaiNey14MMYQvPU7L \
ghc-ghc-lib-parser-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-array-0.5.8.0-2a42 \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-binary-0.8.9.3-9861 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-deepseq-1.5.1.0-1350 \
ghc-devel-directory-1.3.10.1-b1d7 \
ghc-devel-exceptions-0.10.12-f655 \
ghc-devel-filepath-1.5.5.0-b25b \
ghc-devel-ghc-internal-9.1204.0-f1e1 \
ghc-devel-ghc-prim-0.13.0-f55c \
ghc-devel-hpc-0.7.0.2-1e89 \
ghc-devel-os-string-2.0.10-5320 \
ghc-devel-parsec-3.1.18.0-be05 \
ghc-devel-pretty-1.1.3.6-b7fd \
ghc-devel-process-1.6.26.1-905d \
ghc-devel-time-1.14-a7dc \
ghc-devel-transformers-0.6.3.0-4709 \
ghc-devel-unix-2.8.8.0-178a \
ghc-ghc-lib-parser"

inherit rpm
