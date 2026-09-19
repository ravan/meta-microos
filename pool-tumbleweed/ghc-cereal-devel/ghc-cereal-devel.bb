SUMMARY = "Haskell cereal library development files"
DESCRIPTION = "This package provides the Haskell cereal library development files."
LICENSE = "BSD-3-Clause"

PV = "0.5.8.3"

RPM_NAME = "ghc-cereal-devel-0.5.8.3-2.35.aarch64.rpm"
RPM_HASH = "02671ef86a5455af557d4d1ecb303c4e870b51e88beac15cc5081d4bb8b6892f30b1eaf6475ce8efb20e0cd2986d30a91303599daf4fd4f964dcc818d5f667af"

RPROVIDES:${PN} += "ghc-cereal-devel \
ghc-devel-cereal-0.5.8.3-9RjPyVhfWFC69r1oCUPmww"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-cereal \
ghc-compiler \
ghc-devel-array-0.5.8.0-2a42 \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-ghc-prim-0.13.0-f55c"

inherit rpm
