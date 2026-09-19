SUMMARY = "Documentation for texlive-b1encoding"
DESCRIPTION = "This package includes the documentation for texlive-b1encoding"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn21271"

RPM_NAME = "texlive-b1encoding-doc-2026.226.1.0svn21271-60.2.noarch.rpm"
RPM_HASH = "cb013770760c9fab0358965993501958a501fe16193f4141e4d40dfcfd47f1df2dd23a3f4df6bfa0d0acbe5e0836325e7767f7ef2c42f5acd089827e93c86d26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-b1encoding-doc"

RDEPENDS:${PN} += ""

inherit rpm
