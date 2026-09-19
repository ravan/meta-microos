SUMMARY = "Haskell ghc-experimental library development files"
DESCRIPTION = "This package provides the Haskell ghc-experimental library development files."
LICENSE = "BSD-3-Clause"

PV = "9.1204.0"

RPM_NAME = "ghc-ghc-experimental-devel-9.1204.0-1.3.aarch64.rpm"
RPM_HASH = "b23c299d945c7323bea9ab1a0d18b1bce3c8a6e9218275c8c73af485e8a9abc00ddfdb4d2cea849a00ee6a9d7d0084d5b5099d18a0c9c03817344ff64e9caa56"

RPROVIDES:${PN} += "ghc-devel-ghc-experimental-9.1204.0-a6a5 \
ghc-ghc-experimental-devel \
ghc-ghc-experimental-static"

RDEPENDS:${PN} += "ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-ghc-internal-9.1204.0-f1e1 \
ghc-devel-ghc-prim-0.13.0-f55c \
ghc-ghc-experimental"

inherit rpm
