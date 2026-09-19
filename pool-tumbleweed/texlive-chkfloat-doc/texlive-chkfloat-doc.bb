SUMMARY = "Documentation for texlive-chkfloat"
DESCRIPTION = "This package includes the documentation for texlive-chkfloat"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn77682"

RPM_NAME = "texlive-chkfloat-doc-2026.226.0.0.1svn77682-60.2.noarch.rpm"
RPM_HASH = "071a9b61ca20af11aa6e6a2b1234bcea98763f7b19ee3a5d523b67de3e3072cebac039e55c30dcfe1dde893dff692447096d3a55479d4a59e977bb484804219b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-chkfloat-doc"

RDEPENDS:${PN} += ""

inherit rpm
