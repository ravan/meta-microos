SUMMARY = "Haskell timeit library documentation"
DESCRIPTION = "This package provides the Haskell timeit library documentation."
LICENSE = "BSD-3-Clause"

PV = "2.0"

RPM_NAME = "ghc-timeit-doc-2.0-6.19.noarch.rpm"
RPM_HASH = "63da7da1e7616b663fa9f3ac776ce5d64649d93424bc110dd04a1dec0e9251778fe869dc0ae0591c13eea9ea5478f6e4f0c02b286c3e8b63f544b295561ae8cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-timeit-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
