SUMMARY = "Haskell vector-stream library development files"
DESCRIPTION = "This package provides the Haskell vector-stream library development files."
LICENSE = "BSD-3-Clause"

PV = "0.1.0.1"

RPM_NAME = "ghc-vector-stream-devel-0.1.0.1-5.9.aarch64.rpm"
RPM_HASH = "64ed1a04d3eec9eb8286c88d1fc99af8cf3f58074e53ae4fef6a66981999f00ab4aa2e832befa6678de6e7c0fc7be933c3f83789bbd774624f6b9518fb77f294"

RPROVIDES:${PN} += "ghc-devel-vector-stream-0.1.0.1-FXRnPnZDT7tJ4JCMEuh1XF \
ghc-vector-stream-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-ghc-prim-0.13.0-f55c \
ghc-vector-stream"

inherit rpm
