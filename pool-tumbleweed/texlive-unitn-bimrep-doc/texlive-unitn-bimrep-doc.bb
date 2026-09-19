SUMMARY = "Documentation for texlive-unitn-bimrep"
DESCRIPTION = "This package includes the documentation for texlive-unitn-bimrep"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn45581"

RPM_NAME = "texlive-unitn-bimrep-doc-2026.226.svn45581-60.2.noarch.rpm"
RPM_HASH = "0fafcb1907068eb8a6b267bbe7fbaf63be43f452dd2e51df94db05c01b7d85705aae7187c2be51a27b5cedd4e3851092cc68d4c4e8de6d4c6698472ec3be3630"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-unitn-bimrep-doc"

RDEPENDS:${PN} += ""

inherit rpm
