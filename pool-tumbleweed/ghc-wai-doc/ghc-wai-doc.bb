SUMMARY = "Haskell wai library documentation"
DESCRIPTION = "This package provides the Haskell wai library documentation."
LICENSE = "MIT"

PV = "3.2.4"

RPM_NAME = "ghc-wai-doc-3.2.4-1.26.noarch.rpm"
RPM_HASH = "ddfa57caf6368cbfb5f4371f3b77a5b64c6f9ec72e5c1e2b0ad7ca7d1b0a4ecfb3c1912891b5dde5fed7275f59c61d1b72ce834e1b77c1a4d5746ef11b7b9fd5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-wai-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
