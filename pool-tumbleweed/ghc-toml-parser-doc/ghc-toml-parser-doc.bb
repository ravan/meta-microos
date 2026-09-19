SUMMARY = "Haskell toml-parser library documentation"
DESCRIPTION = "This package provides the Haskell toml-parser library documentation."
LICENSE = "ISC"

PV = "2.0.2.0"

RPM_NAME = "ghc-toml-parser-doc-2.0.2.0-2.3.noarch.rpm"
RPM_HASH = "aee1b4e085ba64a1fd61e2c88836dc9358387536ad553b576d6198e0754e6e2f922039fcfcae92779d777d3c87cb37f9e19515c2017896865054bc4df6a49cad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-toml-parser-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
