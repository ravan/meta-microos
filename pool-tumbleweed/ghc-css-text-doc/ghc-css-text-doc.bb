SUMMARY = "Haskell css-text library documentation"
DESCRIPTION = "This package provides the Haskell css-text library documentation."
LICENSE = "MIT"

PV = "0.1.3.0"

RPM_NAME = "ghc-css-text-doc-0.1.3.0-4.43.noarch.rpm"
RPM_HASH = "b484dab01f9b543d13f2943e30d385a7999b9d1bd44d9f951f6fb938437d7d08edaea1fb43eceb39df2e3eb2afb387299b073e6549f72bb3f7abae463ba9a926"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-css-text-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
