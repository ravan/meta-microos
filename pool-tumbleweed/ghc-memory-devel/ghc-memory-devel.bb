SUMMARY = "Haskell memory library development files"
DESCRIPTION = "This package provides the Haskell memory library development files."
LICENSE = "BSD-3-Clause"

PV = "0.18.0"

RPM_NAME = "ghc-memory-devel-0.18.0-3.14.aarch64.rpm"
RPM_HASH = "f3372555ad5f39625035f30b9b81dcb1a693616316919992cc6bf02e726b46c4c78609bac89993175346f677729eb44ccac83080f8557e1b06f956a72278a29f"

RPROVIDES:${PN} += "ghc-devel-memory-0.18.0-4OCVGiXkS6t9StTfiwlZlu \
ghc-memory-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-basement-0.0.16-EFfarL5MHPIHNlTrgpSdN2 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-deepseq-1.5.1.0-1350 \
ghc-devel-ghc-prim-0.13.0-f55c \
ghc-memory"

inherit rpm
