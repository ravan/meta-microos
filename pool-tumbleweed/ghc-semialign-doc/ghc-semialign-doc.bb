SUMMARY = "Haskell semialign library documentation"
DESCRIPTION = "This package provides the Haskell semialign library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.3.1.1"

RPM_NAME = "ghc-semialign-doc-1.3.1.1-1.3.noarch.rpm"
RPM_HASH = "f0645a9152c1638f7b87ca1a375a8a3ee37fa7a9d4811cd8f2a46e63b826e4d48d41d913f98d9159f69385608bb92e1949b8037e021fedacf8f92e1f76379b86"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-semialign-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
