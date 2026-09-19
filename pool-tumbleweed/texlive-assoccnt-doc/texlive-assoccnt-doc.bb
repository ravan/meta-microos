SUMMARY = "Documentation for texlive-assoccnt"
DESCRIPTION = "This package includes the documentation for texlive-assoccnt"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.8svn38497"

RPM_NAME = "texlive-assoccnt-doc-2026.226.0.0.8svn38497-60.2.noarch.rpm"
RPM_HASH = "ff9a48a1b30d89de19ff6c3e1ce71255c241217d4a08ad7358171093905ca82d6fc5ceee9337c04445b85b272b9e93ba7bfdb9c52631655395868b040157914e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-assoccnt-doc"

RDEPENDS:${PN} += ""

inherit rpm
