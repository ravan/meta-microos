SUMMARY = "Haskell http-client-restricted library documentation"
DESCRIPTION = "This package provides the Haskell http-client-restricted library documentation."
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "ghc-http-client-restricted-doc-0.1.1-1.4.noarch.rpm"
RPM_HASH = "bdaf1293171984f5b3105316aa7a5ac947bf4a3ec2f50c35ecf5a4f4cce130dd22b51ffaa70b08d43a1f6916ea57459f3b521bc8540a291c95acb4ee975adadc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-http-client-restricted-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
