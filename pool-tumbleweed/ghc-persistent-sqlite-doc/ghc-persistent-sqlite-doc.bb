SUMMARY = "Haskell persistent-sqlite library documentation"
DESCRIPTION = "This package provides the Haskell persistent-sqlite library documentation."
LICENSE = "MIT"

PV = "2.13.3.1"

RPM_NAME = "ghc-persistent-sqlite-doc-2.13.3.1-1.26.noarch.rpm"
RPM_HASH = "b3608212a82682dd330daf688381229468f67989fa0f3d39e6a66cd895c55ae9725f70c7745f62dc4b8bfad4ce6237085b436fea714f24f8f75c9d3346b3ac8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-persistent-sqlite-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
