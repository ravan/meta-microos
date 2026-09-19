SUMMARY = "Documentation for texlive-framed"
DESCRIPTION = "This package includes the documentation for texlive-framed"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.96svn77682"

RPM_NAME = "texlive-framed-doc-2026.226.0.0.96svn77682-60.2.noarch.rpm"
RPM_HASH = "fade55883f0289dd8d51ac2c25e7639e1dea9b69ededca8a25cbb5a09d00bfad55af16eacb44c17b63199a446fc6bd010f0e123a48699fb5ba6993d71c66804e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-framed-doc"

RDEPENDS:${PN} += ""

inherit rpm
