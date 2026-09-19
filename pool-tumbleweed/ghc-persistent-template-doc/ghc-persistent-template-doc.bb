SUMMARY = "Haskell persistent-template library documentation"
DESCRIPTION = "This package provides the Haskell persistent-template library documentation."
LICENSE = "MIT"

PV = "2.12.0.0"

RPM_NAME = "ghc-persistent-template-doc-2.12.0.0-1.18.noarch.rpm"
RPM_HASH = "aa362ce4bf97b62b91e117101fb0ecbe82ac9ae533e63589394b1619d9c020c1aca189a58da1211c6c3586e32ad2ededbf12b1aef44f421a7745b803b4502140"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-persistent-template-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
