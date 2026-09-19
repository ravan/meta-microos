SUMMARY = "Documentation for texlive-antanilipsum"
DESCRIPTION = "This package includes the documentation for texlive-antanilipsum"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.8.1svn77161"

RPM_NAME = "texlive-antanilipsum-doc-2026.226.0.0.8.1svn77161-61.2.noarch.rpm"
RPM_HASH = "cc54a52301c8342af3606ad67720bbe16b8890c8368acdd2cbad9c78bab333270f3d0bddec8067fe0e7d0e603e9bd0af2eec0395fabdf6a509af0f8b06b4176c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-antanilipsum-doc"

RDEPENDS:${PN} += ""

inherit rpm
