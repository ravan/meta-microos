SUMMARY = "Haskell streaming-commons library documentation"
DESCRIPTION = "This package provides the Haskell streaming-commons library documentation."
LICENSE = "MIT"

PV = "0.2.3.1"

RPM_NAME = "ghc-streaming-commons-doc-0.2.3.1-1.8.noarch.rpm"
RPM_HASH = "3f3592c7fcf400b4dfc794f5cb86d6f9555c743395451c0d6f0ad35b987dd18ad2913bd8d6a66249da595aa5b5d5bd2bdba485eb8624208946051e253c1fa620"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-streaming-commons-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
