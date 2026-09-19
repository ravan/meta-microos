SUMMARY = "Documentation for texlive-minted-code"
DESCRIPTION = "This package includes the documentation for texlive-minted-code"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.01svn76529"

RPM_NAME = "texlive-minted-code-doc-2026.226.0.0.01svn76529-61.2.noarch.rpm"
RPM_HASH = "1b10da4c921b140375666442bdcf734b07f686d27fdd8b74e2d5543ffd5bdfd12a3f64a5ae535b23b0e86a710b3ad059aaf824473a26962e7612b8cef9a2dd59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-minted-code-doc"

RDEPENDS:${PN} += ""

inherit rpm
