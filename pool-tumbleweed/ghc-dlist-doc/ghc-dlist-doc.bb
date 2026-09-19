SUMMARY = "Haskell dlist library documentation"
DESCRIPTION = "This package provides the Haskell dlist library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.0"

RPM_NAME = "ghc-dlist-doc-1.0-5.16.noarch.rpm"
RPM_HASH = "2263a9f3685345b68c29315316548b7f8cc3328862bae95fa1862e6c3a7f6b8a2a3c91ae76257c253d6e21fedaf61c69f9fb88a77b7ff17c194a43388cf29f25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-dlist-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
