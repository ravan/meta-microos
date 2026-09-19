SUMMARY = "Haskell basement library development files"
DESCRIPTION = "This package provides the Haskell basement library development files."
LICENSE = "BSD-3-Clause"

PV = "0.0.16"

RPM_NAME = "ghc-basement-devel-0.0.16-1.32.aarch64.rpm"
RPM_HASH = "313a86cff7a3a32d73f3993fa1d66972427630d7d02e0602163b86e0311a173f73678dd43629f90a4bb4bc08765a1fc5f9f1b7b01d05926372744e271933ccac"

RPROVIDES:${PN} += "ghc-basement-devel \
ghc-devel-basement-0.0.16-EFfarL5MHPIHNlTrgpSdN2"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-basement \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-ghc-prim-0.13.0-f55c"

inherit rpm
