SUMMARY = "Documentation for texlive-fge"
DESCRIPTION = "This package includes the documentation for texlive-fge"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.25svn77682"

RPM_NAME = "texlive-fge-doc-2026.226.1.25svn77682-59.2.noarch.rpm"
RPM_HASH = "d199bac5a398b88321f3dff2daba56d4bcb893f3ce176235402d023c6eac1b1521b20a861d7634e4896adf4628b8a92a7f7abf95d63518433a20fc2845482fcc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fge-doc"

RDEPENDS:${PN} += ""

inherit rpm
