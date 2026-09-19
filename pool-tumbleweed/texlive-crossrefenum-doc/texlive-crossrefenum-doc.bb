SUMMARY = "Documentation for texlive-crossrefenum"
DESCRIPTION = "This package includes the documentation for texlive-crossrefenum"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.2svn76004"

RPM_NAME = "texlive-crossrefenum-doc-2026.226.1.2svn76004-61.2.noarch.rpm"
RPM_HASH = "1fc89711cff21cbc70190cde22528e37c8c3213eea6523d0a92b49c11fb006ee51c1b082b3a55a09d057a4c16267671cfdeed378aa46efd3dc4307031d1c41bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-crossrefenum-doc"

RDEPENDS:${PN} += ""

inherit rpm
