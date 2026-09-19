SUMMARY = "Haskell language-c library development files"
DESCRIPTION = "This package provides the Haskell language-c library development files."
LICENSE = "BSD-3-Clause"

PV = "0.10.2"

RPM_NAME = "ghc-language-c-devel-0.10.2-1.3.aarch64.rpm"
RPM_HASH = "cd73be7827ae5cd3ba64152b4030647a5d7309b6633e5521d1ef78809d35b9f7a811a59be72643e533884d41818e3ba7403a132385eb1f73f21c9c83cb741bc3"

RPROVIDES:${PN} += "ghc-devel-language-c-0.10.2-AEpVayAmt2043LoOEuxA1J \
ghc-language-c-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-array-0.5.8.0-2a42 \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-deepseq-1.5.1.0-1350 \
ghc-devel-directory-1.3.10.1-b1d7 \
ghc-devel-filepath-1.5.5.0-b25b \
ghc-devel-mtl-2.3.2-37ef \
ghc-devel-pretty-1.1.3.6-b7fd \
ghc-devel-process-1.6.26.1-905d \
ghc-language-c"

inherit rpm
