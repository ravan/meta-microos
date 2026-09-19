SUMMARY = "Documentation for texlive-blopentype"
DESCRIPTION = "This package includes the documentation for texlive-blopentype"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.0.4svn69080"

RPM_NAME = "texlive-blopentype-doc-2026.226.0.0.0.4svn69080-59.2.noarch.rpm"
RPM_HASH = "368a52d6805318009439e7ccd55f9749da83c213f7df137042aef5e3bbbdb4d787d2d7b86dff1547fc8c458294b03dc02644b2f8a897ab48b72ffc32366203e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-blopentype-doc"

RDEPENDS:${PN} += ""

inherit rpm
