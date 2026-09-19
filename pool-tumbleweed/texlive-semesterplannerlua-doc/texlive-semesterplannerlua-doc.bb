SUMMARY = "Documentation for texlive-semesterplannerlua"
DESCRIPTION = "This package includes the documentation for texlive-semesterplannerlua"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1.2svn71322"

RPM_NAME = "texlive-semesterplannerlua-doc-2026.226.1.1.2svn71322-60.2.noarch.rpm"
RPM_HASH = "d63331d2e8c638a7468cfe95e62b279fa42304ada90c6ef615142736bb8307dbd613c9133ab06f09e4aef6d0df51fad34cb11eb70735ca1d079e8f24ebc51091"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-semesterplannerlua-doc"

RDEPENDS:${PN} += ""

inherit rpm
