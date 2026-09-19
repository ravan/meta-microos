SUMMARY = "Documentation for texlive-lexend"
DESCRIPTION = "This package includes the documentation for texlive-lexend"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1.0.70svn77682"

RPM_NAME = "texlive-lexend-doc-2026.226.1.1.0.70svn77682-61.2.noarch.rpm"
RPM_HASH = "56359270ba559c3f7652ff3da1f2796232ff607d66455224c659e37ac6d7411b5aeb8802eaf6f09db236d27eee782238dcb4b914a206257bd87bd543944b978c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lexend-doc"

RDEPENDS:${PN} += ""

inherit rpm
