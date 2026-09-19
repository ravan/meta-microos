SUMMARY = "Documentation for texlive-ppt-slides"
DESCRIPTION = "This package includes the documentation for texlive-ppt-slides"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.6.0svn76559"

RPM_NAME = "texlive-ppt-slides-doc-2026.226.0.0.6.0svn76559-59.2.noarch.rpm"
RPM_HASH = "09c3720712d2efb2b93a63745d792ae0c54f8f8dfa35ce905bb5220a168da77c56f3651fd4ab04f7b8719430157dc8abfce1769df43be0a0d1d281b6f8d8e2d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ppt-slides-doc"

RDEPENDS:${PN} += ""

inherit rpm
