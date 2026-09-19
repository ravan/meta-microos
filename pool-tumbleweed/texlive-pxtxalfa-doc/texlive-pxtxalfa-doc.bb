SUMMARY = "Documentation for texlive-pxtxalfa"
DESCRIPTION = "This package includes the documentation for texlive-pxtxalfa"
LICENSE = "LPPL-1.0"

PV = "2026.226.2svn77682"

RPM_NAME = "texlive-pxtxalfa-doc-2026.226.2svn77682-60.4.noarch.rpm"
RPM_HASH = "cece90a1dd80d90dc4dad4a1740b3365949e2c15d52bd76a641e9d62dcabe848db3e17356d5df92020ea03922ea71a06c703d80447e67111d2ec134fe166f8c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pxtxalfa-doc"

RDEPENDS:${PN} += ""

inherit rpm
