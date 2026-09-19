SUMMARY = "Haskell lift-type library development files"
DESCRIPTION = "This package provides the Haskell lift-type library development files."
LICENSE = "BSD-3-Clause"

PV = "0.1.2.0"

RPM_NAME = "ghc-lift-type-devel-0.1.2.0-1.12.aarch64.rpm"
RPM_HASH = "befc8000cb62cbc333245d2ede458df50182219936562fb54e658d72bf216ab6504a3dbeaef207155cb347cdb3dc39943a42dae71e6a482bee29a4da39e13e87"

RPROVIDES:${PN} += "ghc-devel-lift-type-0.1.2.0-5Wrf181y1CRJpVkgxBFKkO \
ghc-lift-type-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-template-haskell-2.23.0.0-358a \
ghc-lift-type"

inherit rpm
