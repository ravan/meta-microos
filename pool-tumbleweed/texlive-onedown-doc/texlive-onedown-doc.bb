SUMMARY = "Documentation for texlive-onedown"
DESCRIPTION = "This package includes the documentation for texlive-onedown"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.7svn69067"

RPM_NAME = "texlive-onedown-doc-2026.226.1.7svn69067-61.2.noarch.rpm"
RPM_HASH = "cf719ac41bd6aa50d6c9bdef0f75de982c8ac48ea18db7b90e79e5e1136c6d2c6925902444e6053e806f68427291da1049ad0c9062b9dca55ba771567701e739"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-onedown-doc"

RDEPENDS:${PN} += ""

inherit rpm
