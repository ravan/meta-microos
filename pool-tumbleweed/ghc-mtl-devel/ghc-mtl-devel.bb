SUMMARY = "Haskell mtl library development files"
DESCRIPTION = "This package provides the Haskell mtl library development files."
LICENSE = "BSD-3-Clause"

PV = "2.3.2"

RPM_NAME = "ghc-mtl-devel-2.3.2-1.3.aarch64.rpm"
RPM_HASH = "317788e135bf90b0972b037c0216116bfb21809db281169b0e401db0c5f9fabe6a604afbe4279e673145bacf02293f09672e802990693e642e6615df337d5019"

RPROVIDES:${PN} += "ghc-devel-mtl-2.3.2-37ef \
ghc-mtl-devel \
ghc-mtl-static"

RDEPENDS:${PN} += "ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-transformers-0.6.3.0-4709 \
ghc-mtl"

inherit rpm
