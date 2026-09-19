SUMMARY = "Haskell base-compat library documentation"
DESCRIPTION = "This package provides the Haskell base-compat library documentation."
LICENSE = "MIT"

PV = "0.14.1"

RPM_NAME = "ghc-base-compat-doc-0.14.1-1.15.noarch.rpm"
RPM_HASH = "d2943404e021fb106fd31127c9c84484e70f2b3f5e70a0c365e034780f861bc70d680c8681d13ab33199262d4e3e78d9e3d3edf43a05cad4548128baa3de59d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-base-compat-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
