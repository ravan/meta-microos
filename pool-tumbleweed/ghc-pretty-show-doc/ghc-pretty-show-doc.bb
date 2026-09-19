SUMMARY = "Haskell pretty-show library documentation"
DESCRIPTION = "This package provides the Haskell pretty-show library documentation."
LICENSE = "MIT"

PV = "1.10"

RPM_NAME = "ghc-pretty-show-doc-1.10-4.37.noarch.rpm"
RPM_HASH = "9ce77e288ff6af6e5214a4918ace6f3310a8ffe31eea217cdec4cbd126c517a5302e7bc30701fe0c61438a631a322029285ee5bd86dbf249387b9faf75067879"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-pretty-show-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
