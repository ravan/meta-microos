SUMMARY = "Documentation for texlive-gridpapers"
DESCRIPTION = "This package includes the documentation for texlive-gridpapers"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.2svn58723"

RPM_NAME = "texlive-gridpapers-doc-2026.226.1.0.2svn58723-60.4.noarch.rpm"
RPM_HASH = "9c156f7117baececfd679df14a72b797ce135e31695b2366afe211df6fe612eeff45c30b6e7d2fdbc94c605e58e7a49447d3d3cb15b27092354b1c7d73eb75aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gridpapers-doc"

RDEPENDS:${PN} += ""

inherit rpm
