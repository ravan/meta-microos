SUMMARY = "Haskell language-c profiling library"
DESCRIPTION = "This package provides the Haskell language-c profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.10.2"

RPM_NAME = "ghc-language-c-prof-0.10.2-1.3.aarch64.rpm"
RPM_HASH = "9e8ac69429af9f88d7e86c0007187e2ccd729a583e3b42273323d385bd9699e11f706c57f389ebf8449a502ff0ff968908acfd708b260c255e82fd93ad1022b9"

RPROVIDES:${PN} += "ghc-language-c-prof \
ghc-prof-language-c-0.10.2-AEpVayAmt2043LoOEuxA1J"

RDEPENDS:${PN} += "ghc-language-c-devel \
ghc-prof-array-0.5.8.0-2a42 \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-deepseq-1.5.1.0-1350 \
ghc-prof-directory-1.3.10.1-b1d7 \
ghc-prof-filepath-1.5.5.0-b25b \
ghc-prof-mtl-2.3.2-37ef \
ghc-prof-pretty-1.1.3.6-b7fd \
ghc-prof-process-1.6.26.1-905d"

inherit rpm
