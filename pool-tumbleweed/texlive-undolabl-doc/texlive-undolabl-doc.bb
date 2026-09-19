SUMMARY = "Documentation for texlive-undolabl"
DESCRIPTION = "This package includes the documentation for texlive-undolabl"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0osvn77682"

RPM_NAME = "texlive-undolabl-doc-2026.226.1.0osvn77682-60.2.noarch.rpm"
RPM_HASH = "f37c3907c3e4af351879d21fc9425265610f7f52794f93908649c4962133f4100956e6f8a839391b56aaf7b1968984cd3c65bb176a6d798f3991d08f22349ee2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-undolabl-doc"

RDEPENDS:${PN} += ""

inherit rpm
