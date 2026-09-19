SUMMARY = "Haskell transformers-compat library documentation"
DESCRIPTION = "This package provides the Haskell transformers-compat library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.7.2"

RPM_NAME = "ghc-transformers-compat-doc-0.7.2-2.35.noarch.rpm"
RPM_HASH = "060c7a92ab4543b3d75cff07282b5d1b585f690647cdb9ba29d4219ee00219102e4700b2d99f35b0d9944169b04297f8b5f79270531967676249b32845609135"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-transformers-compat-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
