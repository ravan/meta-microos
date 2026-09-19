SUMMARY = "Documentation for texlive-pst-vehicle"
DESCRIPTION = "This package includes the documentation for texlive-pst-vehicle"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn61438"

RPM_NAME = "texlive-pst-vehicle-doc-2026.226.1.3svn61438-60.4.noarch.rpm"
RPM_HASH = "b1c8cf0f23f61f58076871dc7df224d1643883ba7f797877425ae4e044c7b6e248e411027e850b7e3c23ef86b55b6843001007690a29e49cd4b6b252bda9f685"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-pst-vehicle-doc-fr \
texlive-pst-vehicle-doc"

RDEPENDS:${PN} += ""

inherit rpm
