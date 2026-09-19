SUMMARY = "Haskell shakespeare library documentation"
DESCRIPTION = "This package provides the Haskell shakespeare library documentation."
LICENSE = "MIT"

PV = "2.1.7.1"

RPM_NAME = "ghc-shakespeare-doc-2.1.7.1-1.12.noarch.rpm"
RPM_HASH = "102db8da2217f6e1d0a323179e51d7245b2c9fc842a5859a4942f9f08498f26b846b843be18bc31b8bae55bac642a736affd6ea436070d1746b1394dbc7b9fa7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-shakespeare-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
