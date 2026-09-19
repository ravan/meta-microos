SUMMARY = "Documentation for texlive-counterz"
DESCRIPTION = "This package includes the documentation for texlive-counterz"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1.1svn67335"

RPM_NAME = "texlive-counterz-doc-2026.226.1.1.1svn67335-61.2.noarch.rpm"
RPM_HASH = "3c952a1f3fe3c9a80794778d16eb2a6d6a0dedc47e7c7844220ccfe1e2a2bc18c8102655948e3db4e8648ab8aa9ad2ccdcc00901857ae82a39c190a21a8ee449"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-counterz-doc"

RDEPENDS:${PN} += ""

inherit rpm
