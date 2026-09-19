SUMMARY = "Haskell git-lfs library documentation"
DESCRIPTION = "This package provides the Haskell git-lfs library documentation."
LICENSE = "AGPL-3.0-or-later"

PV = "1.2.5"

RPM_NAME = "ghc-git-lfs-doc-1.2.5-1.21.noarch.rpm"
RPM_HASH = "effd2355ffe0c76010aa618086b8585113424415a2a61038a4f903ae6a2f105d3e953ea19397f0a300356c055a8c86b85e4ca135271accef1e2326b4dba06057"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-git-lfs-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
