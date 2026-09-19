SUMMARY = "Haskell containers library development files"
DESCRIPTION = "This package provides the Haskell containers library development files."
LICENSE = "BSD-3-Clause"

PV = "0.7"

RPM_NAME = "ghc-containers-devel-0.7-1.3.aarch64.rpm"
RPM_HASH = "526dd0c6b6a3cbefe5e522ab697a65ed6a8533041b3ce7eed128f717a4b9957bda33e26a03d6e7b90db9b43d6c62b72d71103efcdb59ed21b82267e71b74468b"

RPROVIDES:${PN} += "ghc-containers-devel \
ghc-containers-static \
ghc-devel-containers-0.7-d5e1"

RDEPENDS:${PN} += "ghc-compiler \
ghc-containers \
ghc-devel-array-0.5.8.0-2a42 \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-deepseq-1.5.1.0-1350 \
ghc-devel-template-haskell-2.23.0.0-358a"

inherit rpm
