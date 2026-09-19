SUMMARY = "Documentation for texlive-swfigure"
DESCRIPTION = "This package includes the documentation for texlive-swfigure"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.9.20svn63255"

RPM_NAME = "texlive-swfigure-doc-2026.226.0.0.9.20svn63255-64.2.noarch.rpm"
RPM_HASH = "1d472a5f154e70633422ff9b37ce2a657ea9af4150364ac024b3a34f457ac03729454ba635e7ce3e4307e1183ba95b2543ffd2d7c34f8833c70e235534391093"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-swfigure-doc"

RDEPENDS:${PN} += ""

inherit rpm
