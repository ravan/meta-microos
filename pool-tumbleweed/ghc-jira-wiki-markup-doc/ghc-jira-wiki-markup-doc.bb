SUMMARY = "Haskell jira-wiki-markup library documentation"
DESCRIPTION = "This package provides the Haskell jira-wiki-markup library documentation."
LICENSE = "MIT"

PV = "1.5.1"

RPM_NAME = "ghc-jira-wiki-markup-doc-1.5.1-2.27.noarch.rpm"
RPM_HASH = "485191c1073ef39a05d84644a22953fc4e5f349822e59e631b651e3e17aee55e23d86a1e22dfe646932aad363921444f7485e9ac47a367e6860e712cb2286baf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-jira-wiki-markup-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
