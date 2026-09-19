SUMMARY = "Documentation for texlive-nunito"
DESCRIPTION = "This package includes the documentation for texlive-nunito"
LICENSE = "OFL-1.1"

PV = "2026.226.0.0.0.1svn77682"

RPM_NAME = "texlive-nunito-doc-2026.226.0.0.0.1svn77682-61.2.noarch.rpm"
RPM_HASH = "7fbd4eb15e7b79b9141b42b115ce42f0a30233202dfcd63f1fe9d160bae421ad284308e2c7f461f74a87409d7269f1395057f8608b5d4f77df62a3b0eb2027b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-nunito-doc"

RDEPENDS:${PN} += ""

inherit rpm
