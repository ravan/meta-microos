SUMMARY = "Haskell ghc-platform library development files"
DESCRIPTION = "This package provides the Haskell ghc-platform library development files."
LICENSE = "BSD-3-Clause"

PV = "0.1.0.0"

RPM_NAME = "ghc-ghc-platform-devel-0.1.0.0-1.3.aarch64.rpm"
RPM_HASH = "b97e9d8835f044ccb5154eb99cac88146cadce35ce65e93cd6187467b739895b6485db7ef4a7561d4599ba261972c662886cdc9135cac12ca6daeace8ff3507c"

RPROVIDES:${PN} += "ghc-devel-ghc-platform-0.1.0.0-ac24 \
ghc-ghc-platform-devel \
ghc-ghc-platform-static"

RDEPENDS:${PN} += "ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-ghc-platform"

inherit rpm
