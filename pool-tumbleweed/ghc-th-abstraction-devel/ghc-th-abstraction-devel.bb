SUMMARY = "Haskell th-abstraction library development files"
DESCRIPTION = "This package provides the Haskell th-abstraction library development files."
LICENSE = "ISC"

PV = "0.7.2.0"

RPM_NAME = "ghc-th-abstraction-devel-0.7.2.0-1.3.aarch64.rpm"
RPM_HASH = "efe20d5d51d97482736f31c4095b3a25f4c9eecdf396ddd9a9b30c2ab9c2a7ebb0ff8ab2ca20d5a41a868fe2694d47126c3829b44e0f09eb46a370f8d3f96b9d"

RPROVIDES:${PN} += "ghc-devel-th-abstraction-0.7.2.0-LVMuWnluhDI5se4FHUInw7 \
ghc-th-abstraction-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-template-haskell-2.23.0.0-358a \
ghc-th-abstraction"

inherit rpm
