SUMMARY = "Haskell ghc-heap library development files"
DESCRIPTION = "This package provides the Haskell ghc-heap library development files."
LICENSE = "BSD-3-Clause"

PV = "9.12.4"

RPM_NAME = "ghc-ghc-heap-devel-9.12.4-1.3.aarch64.rpm"
RPM_HASH = "b3f995ddb9c1a3d2f896914aa227ebaee5163f51f8a58875a6c3f6e5f073fb5c4ee6727650e04172c2d7e90d530dfe287d34e4d7946bda00b15ae057c7a4712b"

RPROVIDES:${PN} += "ghc-devel-ghc-heap-9.12.4-167c \
ghc-ghc-heap-devel \
ghc-ghc-heap-static"

RDEPENDS:${PN} += "ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-ghc-internal-9.1204.0-f1e1 \
ghc-devel-ghc-prim-0.13.0-f55c \
ghc-devel-rts-1.0.3 \
ghc-ghc-heap"

inherit rpm
