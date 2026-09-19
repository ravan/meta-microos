SUMMARY = "Documentation for texlive-profsio"
DESCRIPTION = "This package includes the documentation for texlive-profsio"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3.5svn76398"

RPM_NAME = "texlive-profsio-doc-2026.226.0.0.3.5svn76398-59.2.noarch.rpm"
RPM_HASH = "f86bd343f45ffc473f504a53bc4add05206ccf12674973b632fefec709ae8a3f151816bf29d0d767e4a7edb0550624ff4a3e3a3630842d0c74eaec4e4442aae9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-profsio-doc-fr \
texlive-profsio-doc"

RDEPENDS:${PN} += ""

inherit rpm
