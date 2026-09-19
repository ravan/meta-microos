SUMMARY = "Documentation for texlive-doctools"
DESCRIPTION = "This package includes the documentation for texlive-doctools"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn34474"

RPM_NAME = "texlive-doctools-doc-2026.226.0.0.1svn34474-59.2.noarch.rpm"
RPM_HASH = "4f8396ec4f465c48041ac093e7710e12550befda55995257ad849459ef61897bef9405ca3fd7fecabbe3ba746b1e68cf973af2068d5b77b13d0b733bdc95a7e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-doctools-doc"

RDEPENDS:${PN} += ""

inherit rpm
