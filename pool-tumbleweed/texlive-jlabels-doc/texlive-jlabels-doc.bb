SUMMARY = "Documentation for texlive-jlabels"
DESCRIPTION = "This package includes the documentation for texlive-jlabels"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn24858"

RPM_NAME = "texlive-jlabels-doc-2026.226.svn24858-63.2.noarch.rpm"
RPM_HASH = "3709470a66914b33a869e61ddaa112deb23ac5c1355f5fd8e85a8f2550586e12733a4ff76b28d5fdde53a0742d78488ede5471202a21854ff9be770c503c6b58"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-jlabels-doc"

RDEPENDS:${PN} += ""

inherit rpm
