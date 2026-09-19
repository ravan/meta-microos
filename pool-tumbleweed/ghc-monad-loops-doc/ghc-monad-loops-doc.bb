SUMMARY = "Haskell monad-loops library documentation"
DESCRIPTION = "This package provides the Haskell monad-loops library documentation."
LICENSE = "SUSE-Public-Domain"

PV = "0.4.3"

RPM_NAME = "ghc-monad-loops-doc-0.4.3-11.23.noarch.rpm"
RPM_HASH = "1fa1050682e16c6143b9beb00eaa17af1aa916589cb2fa733bcaffe090802b03c804ebc5a3690959945b6689cdea9528ab5a754a99f3eb7f258d9afc169752bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-monad-loops-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
