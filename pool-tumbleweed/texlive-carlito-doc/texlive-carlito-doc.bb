SUMMARY = "Documentation for texlive-carlito"
DESCRIPTION = "This package includes the documentation for texlive-carlito"
LICENSE = "OFL-1.1"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-carlito-doc-2026.226.svn77682-59.2.noarch.rpm"
RPM_HASH = "11f6badf01b94795ccaf50f69e310c41aecb578bf2710fca506577ec02dd339e72fe12eaf3d65b52e950efa0b73f24a3f2f76d70f9fbf9894bbe2321cdefdc7a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-carlito-doc"

RDEPENDS:${PN} += ""

inherit rpm
