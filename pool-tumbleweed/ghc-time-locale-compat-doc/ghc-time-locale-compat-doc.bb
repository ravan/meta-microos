SUMMARY = "Haskell time-locale-compat library documentation"
DESCRIPTION = "This package provides the Haskell time-locale-compat library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.1.5"

RPM_NAME = "ghc-time-locale-compat-doc-0.1.1.5-7.23.noarch.rpm"
RPM_HASH = "bfd53a34b030a9e3ba8a6e32ce39e809ac3877ee26506d68ce31865c32b2e1c84e6e386e7378fec80c447607f3dc445db97d50b837906378f9a43fabcf83cb4b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-time-locale-compat-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
