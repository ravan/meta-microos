SUMMARY = "Documentation for texlive-babel-thai"
DESCRIPTION = "This package includes the documentation for texlive-babel-thai"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.0svn30564"

RPM_NAME = "texlive-babel-thai-doc-2026.226.1.0.0svn30564-60.2.noarch.rpm"
RPM_HASH = "829af64603eafb294a161930eed032c52d0b93b6d29825e55951fcab8050068de00fa8f8585b3448bfbf4ccb17ea56244a39b75f138bdeeaf13d42062474429d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-thai-doc"

RDEPENDS:${PN} += ""

inherit rpm
