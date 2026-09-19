SUMMARY = "Documentation for texlive-weiqi"
DESCRIPTION = "This package includes the documentation for texlive-weiqi"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn78101"

RPM_NAME = "texlive-weiqi-doc-2026.226.0.0.1svn78101-60.2.noarch.rpm"
RPM_HASH = "34581fd781357ca262502f9f0b70c93b6cf4a39a4b3d03249145060016934ff2f3468c2b9042ddacd0c440377c89fd5bcca45d52c289ace3fb85a03f3ef67769"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-weiqi-doc-zh \
texlive-weiqi-doc"

RDEPENDS:${PN} += ""

inherit rpm
