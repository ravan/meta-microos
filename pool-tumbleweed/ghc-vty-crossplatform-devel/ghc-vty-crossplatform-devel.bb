SUMMARY = "Haskell vty-crossplatform library development files"
DESCRIPTION = "This package provides the Haskell vty-crossplatform library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.4.0.0"

RPM_NAME = "ghc-vty-crossplatform-devel-0.4.0.0-1.43.aarch64.rpm"
RPM_HASH = "1cabd0ed476fd26cd0eefd9ef485d5745853c69265a7c2e90582228b5f16531e176018b6a195182f2c55c5332b3e91d3e8f8cd45e534771e146b62ca2db3b97f"

RPROVIDES:${PN} += "ghc-devel-vty-crossplatform-0.4.0.0-DfPElrORw2a1ydk7gC4Op8 \
ghc-vty-crossplatform-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-vty-6.6-EPyV4ZsVRx8EnXBLhcE4eO \
ghc-devel-vty-unix-0.3.0.0-BdEZXN0VRxZI5S5J9qgVGK \
ghc-vty-crossplatform"

inherit rpm
