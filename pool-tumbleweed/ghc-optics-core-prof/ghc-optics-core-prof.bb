SUMMARY = "Haskell optics-core profiling library"
DESCRIPTION = "This package provides the Haskell optics-core profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.4.2"

RPM_NAME = "ghc-optics-core-prof-0.4.2-1.3.aarch64.rpm"
RPM_HASH = "00abf706d6a8aad0a128a96d91a6c853b78644028cfb92aec19630b65a8fb24c4ed26705b7576c599da7c792e2218244b91bad962c7a9dc28c6cf519cf99d2d1"

RPROVIDES:${PN} += "ghc-optics-core-prof \
ghc-prof-optics-core-0.4.2-7BE8gBXEGOAKzvacYKREXy"

RDEPENDS:${PN} += "ghc-optics-core-devel \
ghc-prof-array-0.5.8.0-2a42 \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-indexed-profunctors-0.1.1.1-HSqEhDrwiQJ27Hm9NjzenO \
ghc-prof-indexed-traversable-0.1.5-JylwuAInS9n4ImeZ4JChDW \
ghc-prof-transformers-0.6.3.0-4709"

inherit rpm
