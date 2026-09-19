SUMMARY = "Documentation for texlive-packdoc"
DESCRIPTION = "This package includes the documentation for texlive-packdoc"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn73661"

RPM_NAME = "texlive-packdoc-doc-2026.226.0.0.1svn73661-58.2.noarch.rpm"
RPM_HASH = "0a275ea41f01bf963035bb8d72e7c68117dd4128ca0440ea6dd8ec5e5eb9c899491fb7e1b8fb4ddb751dfe59dee461c885e8bf77e45aaaae170f156380e5195e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-packdoc-doc"

RDEPENDS:${PN} += ""

inherit rpm
