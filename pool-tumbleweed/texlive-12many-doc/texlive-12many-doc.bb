SUMMARY = "Documentation for texlive-12many"
DESCRIPTION = "This package includes the documentation for texlive-12many"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3svn15878"

RPM_NAME = "texlive-12many-doc-2026.226.0.0.3svn15878-61.2.noarch.rpm"
RPM_HASH = "1fcc85f5a00fe0cb15118c501d47769662721426d27bee524e5e140a2f915857b00f1d64add2568a759da1ee09dd39526d471fb7563addcd8bd5c8f3656da0d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-12many-doc"

RDEPENDS:${PN} += ""

inherit rpm
