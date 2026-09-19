SUMMARY = "Documentation for texlive-dashrule"
DESCRIPTION = "This package includes the documentation for texlive-dashrule"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn77682"

RPM_NAME = "texlive-dashrule-doc-2026.226.1.3svn77682-61.2.noarch.rpm"
RPM_HASH = "339cdd2ee807934cb0bce807be732aae7ec61d319d791f4903d96bb123022106c629dc94c71882d49aef6a583d8404b8d54dc36d409c744d638c6cf7101a02e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dashrule-doc"

RDEPENDS:${PN} += ""

inherit rpm
