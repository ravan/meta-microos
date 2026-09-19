SUMMARY = "Haskell open-browser library documentation"
DESCRIPTION = "This package provides the Haskell open-browser library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.4.0.0"

RPM_NAME = "ghc-open-browser-doc-0.4.0.0-1.6.noarch.rpm"
RPM_HASH = "fe8fc4f6c5b1ce9dce52e63d1721a37dbb0cb1e2b05ff53c23bcdafc5a9ed42c5cca1a61b304461ed9c1998f90226c794e91edcf1b496dd16ca97d70edf875db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-open-browser-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
