SUMMARY = "Haskell haddock-library library documentation"
DESCRIPTION = "This package provides the Haskell haddock-library library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.11.0"

RPM_NAME = "ghc-haddock-library-doc-1.11.0-1.3.noarch.rpm"
RPM_HASH = "7cf92479b5f4fa9d1aa3f947ef22911ee9fb79ea59c699ef3538ac74fa8d393733d82ea1d83e337209485ca47efbc2091722caa52ffdf1e3f17028f2fc9b15d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-haddock-library-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
