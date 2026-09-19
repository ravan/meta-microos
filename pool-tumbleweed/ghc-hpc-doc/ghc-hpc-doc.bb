SUMMARY = "Haskell hpc library documentation"
DESCRIPTION = "This package provides the Haskell hpc library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.7.0.2"

RPM_NAME = "ghc-hpc-doc-0.7.0.2-1.3.noarch.rpm"
RPM_HASH = "4c402e8c1559a7c46bd3db4dfc3ed400505e33cdf1b0ae83f28aa29a4129d3e3085c210ff8d920acb091b5a896af7624ad24148a5a44acc51555595202a02860"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-hpc-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
