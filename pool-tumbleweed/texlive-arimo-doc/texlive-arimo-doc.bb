SUMMARY = "Documentation for texlive-arimo"
DESCRIPTION = "This package includes the documentation for texlive-arimo"
LICENSE = "Apache-1.0"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-arimo-doc-2026.226.svn77682-61.2.noarch.rpm"
RPM_HASH = "150cb41fa820287952d5819ef27cd12105e1976ee929b0ce548a03618e5694336638ffa86a81b8d37fadb6c3d0c3ba2dc7491c66bf001ed79332c919951fa8a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-arimo-doc"

RDEPENDS:${PN} += ""

inherit rpm
