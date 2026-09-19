SUMMARY = "Haskell array library development files"
DESCRIPTION = "This package provides the Haskell array library development files."
LICENSE = "BSD-3-Clause"

PV = "0.5.8.0"

RPM_NAME = "ghc-array-devel-0.5.8.0-1.3.aarch64.rpm"
RPM_HASH = "310ebbb183e2db5aac8f7406fb2750c42137f9754d62b66494a656f9f0f8cd8adb9de0d49c3d6611d7842dea0c8e328d31f54cec7f6ea348edb497c2d45dcd64"

RPROVIDES:${PN} += "ghc-array-devel \
ghc-array-static \
ghc-devel-array-0.5.8.0-2a42"

RDEPENDS:${PN} += "ghc-array \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844"

inherit rpm
