SUMMARY = "Documentation for texlive-ptex2pdf"
DESCRIPTION = "This package includes the documentation for texlive-ptex2pdf"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.20200520.0svn65953"

RPM_NAME = "texlive-ptex2pdf-doc-2026.226.20200520.0svn65953-60.4.noarch.rpm"
RPM_HASH = "67728ff519c3c65a7c7283cf8d96bc705b5001e9fb5e5219382d1b8e5878d8fbb20f3ffcbc420c186c70fca3770d760f3aa2b4d7147a3b5029fa9d58695ed4e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ptex2pdf-doc"

RDEPENDS:${PN} += ""

inherit rpm
