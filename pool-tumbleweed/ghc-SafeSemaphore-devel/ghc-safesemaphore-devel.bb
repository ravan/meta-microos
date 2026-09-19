SUMMARY = "Haskell SafeSemaphore library development files"
DESCRIPTION = "This package provides the Haskell SafeSemaphore library development files."
LICENSE = "BSD-3-Clause"

PV = "0.10.1"

RPM_NAME = "ghc-SafeSemaphore-devel-0.10.1-5.35.aarch64.rpm"
RPM_HASH = "619d4ced09792d2d1a5a3ac69fb55fd24854df32df3d0627d8e0a968aa67318464f7ca284c802f58f8c3d3023dab53ef1c10643f3a5c71daecdd8763bd441e87"

RPROVIDES:${PN} += "ghc-SafeSemaphore-devel \
ghc-devel-SafeSemaphore-0.10.1-KAvbZbWmNg73dAA9KjvouK"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-SafeSemaphore \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-stm-2.5.3.1-6d74"

inherit rpm
