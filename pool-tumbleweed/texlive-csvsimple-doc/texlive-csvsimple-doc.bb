SUMMARY = "Documentation for texlive-csvsimple"
DESCRIPTION = "This package includes the documentation for texlive-csvsimple"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.7.0svn77682"

RPM_NAME = "texlive-csvsimple-doc-2026.226.2.7.0svn77682-61.2.noarch.rpm"
RPM_HASH = "ce7c3a0a39be0668ee14c52d92702aff480864e67672aa430e5dbe2c17eeac77f30fa1f2c6fd448611816bd97d20831ca55f5998eb922fa78b024d3d22cd7833"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-csvsimple-doc"

RDEPENDS:${PN} += ""

inherit rpm
