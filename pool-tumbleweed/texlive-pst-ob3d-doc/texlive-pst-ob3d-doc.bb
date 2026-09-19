SUMMARY = "Documentation for texlive-pst-ob3d"
DESCRIPTION = "This package includes the documentation for texlive-pst-ob3d"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.22svn54514"

RPM_NAME = "texlive-pst-ob3d-doc-2026.226.0.0.22svn54514-59.2.noarch.rpm"
RPM_HASH = "552916a8f2146c1bf63b16ed16306944031c45dfa5135b0366ffea72350880af8fc28b5da1e10629f9ebdcf57df46f4288383d13a7f23c4a982c80d7d170ef7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-ob3d-doc"

RDEPENDS:${PN} += ""

inherit rpm
