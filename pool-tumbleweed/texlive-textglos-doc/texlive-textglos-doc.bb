SUMMARY = "Documentation for texlive-textglos"
DESCRIPTION = "This package includes the documentation for texlive-textglos"
LICENSE = "LPPL-1.0"

PV = "2026.227.1.0svn30788"

RPM_NAME = "texlive-textglos-doc-2026.227.1.0svn30788-62.2.noarch.rpm"
RPM_HASH = "0136f2156f16194fbaeb0ea91d7804d85bbcb8976f5b6293d6f950b72844e83796415084eff9fb7220dbda18cb5818e6bc5e04656d14f9b3b6cc3d803b124139"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-textglos-doc"

RDEPENDS:${PN} += ""

inherit rpm
