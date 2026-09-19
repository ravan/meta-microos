SUMMARY = "Haskell bsb-http-chunked library documentation"
DESCRIPTION = "This package provides the Haskell bsb-http-chunked library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.0.0.4"

RPM_NAME = "ghc-bsb-http-chunked-doc-0.0.0.4-7.17.noarch.rpm"
RPM_HASH = "36f2617a8b1c105907e8e39fec2bc5aa214eea9ed4bf4f40736904e07a44ad34bf6057b861a21f0b498823a805d84d8eef397da021e308bda6d3f120adf1e484"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-bsb-http-chunked-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
