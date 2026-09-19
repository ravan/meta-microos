SUMMARY = "Documentation for texlive-beamertheme-arguelles"
DESCRIPTION = "This package includes the documentation for texlive-beamertheme-arguelles"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.5.0svn76524"

RPM_NAME = "texlive-beamertheme-arguelles-doc-2026.226.2.5.0svn76524-61.2.noarch.rpm"
RPM_HASH = "0a8d9474ad48dde3e158ae7a5bdd2b94db9a7b8275564c9289f56b8d9666dea8269b2fdd59ead886b5cc7ade0f6816682ad5a5229927e2144de745c08d1b14f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-beamertheme-arguelles-doc"

RDEPENDS:${PN} += ""

inherit rpm
