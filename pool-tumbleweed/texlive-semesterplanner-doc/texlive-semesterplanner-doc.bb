SUMMARY = "Documentation for texlive-semesterplanner"
DESCRIPTION = "This package includes the documentation for texlive-semesterplanner"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn56841"

RPM_NAME = "texlive-semesterplanner-doc-2026.226.1.0svn56841-60.2.noarch.rpm"
RPM_HASH = "0d40a5bd5a45f1bc2f924af4153110c31dafdb2e5bc130e02042f65233fc2014245dd97631747834fc57b946586c724ad17b611c67fbd76ef560d4340ed4081e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-semesterplanner-doc"

RDEPENDS:${PN} += ""

inherit rpm
