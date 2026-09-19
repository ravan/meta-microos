SUMMARY = "Documentation for texlive-beamertheme-tcolorbox"
DESCRIPTION = "This package includes the documentation for texlive-beamertheme-tcolorbox"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4svn77380"

RPM_NAME = "texlive-beamertheme-tcolorbox-doc-2026.226.1.4svn77380-61.2.noarch.rpm"
RPM_HASH = "3a446d6d574383022862fe3b7987e1796eb293ded20c8c13caacfb7e098ca18874439b48ebd8e87d4fbc2393677cedf50b25752a3928d5d36ad50afa8027e983"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-beamertheme-tcolorbox-doc"

RDEPENDS:${PN} += ""

inherit rpm
