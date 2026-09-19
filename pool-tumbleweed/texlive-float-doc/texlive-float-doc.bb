SUMMARY = "Documentation for texlive-float"
DESCRIPTION = "This package includes the documentation for texlive-float"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3dsvn77682"

RPM_NAME = "texlive-float-doc-2026.226.1.3dsvn77682-60.2.noarch.rpm"
RPM_HASH = "2a914cdb8670363b8e655504263fb7db0ab16bd45775213b66a1bfed99b00c9a82bad4b84c083455a1b0faa488e59b465394568101a88aef2248defdcc523579"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-float-doc"

RDEPENDS:${PN} += ""

inherit rpm
