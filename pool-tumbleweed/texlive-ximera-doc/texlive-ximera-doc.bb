SUMMARY = "Documentation for texlive-ximera"
DESCRIPTION = "This package includes the documentation for texlive-ximera"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5.1svn71243"

RPM_NAME = "texlive-ximera-doc-2026.226.1.5.1svn71243-59.4.noarch.rpm"
RPM_HASH = "1c74e3ae596373a3d5fa4036d02da145ef8eb9416369d0ead2af0634db53c67f0db4c5f7f578b662fb2cf0e7a242c3d9a411015c1e53d12af16ed9254fd47839"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ximera-doc"

RDEPENDS:${PN} += ""

inherit rpm
