SUMMARY = "Documentation for texlive-scratch"
DESCRIPTION = "This package includes the documentation for texlive-scratch"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.41svn66655"

RPM_NAME = "texlive-scratch-doc-2026.226.0.0.41svn66655-60.2.noarch.rpm"
RPM_HASH = "58be3f20917878a38b9b918dc71798a3b76dd24fe0b18b6e5e7bf33f7d413524fd59cc4731dbc29344c7b922f4812c0253adc6564461626f4e4037f15eb11a8d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-scratch-doc-fr \
texlive-scratch-doc"

RDEPENDS:${PN} += ""

inherit rpm
