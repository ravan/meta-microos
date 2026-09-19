SUMMARY = "Documentation for texlive-cinzel"
DESCRIPTION = "This package includes the documentation for texlive-cinzel"
LICENSE = "OFL-1.1"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-cinzel-doc-2026.226.svn77682-60.2.noarch.rpm"
RPM_HASH = "3fc798b76681ef6d181f4567325c24b8cf8e70be7c4996c03ef4f8194eefd992a859548120fd931e8e79485d6fcb088b03ae61601477b24a173da74c8682603c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cinzel-doc"

RDEPENDS:${PN} += ""

inherit rpm
