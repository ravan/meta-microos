SUMMARY = "Documentation for texlive-beamertheme-rainbow"
DESCRIPTION = "This package includes the documentation for texlive-beamertheme-rainbow"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn72864"

RPM_NAME = "texlive-beamertheme-rainbow-doc-2026.226.1.0svn72864-61.2.noarch.rpm"
RPM_HASH = "d1385c058c78a3fc8f5da7a8ade5adba2230a4f24d5e7001945cdd30effc4674d0df65f727523046b10188171f680b29f9a56d6da57389d4561483da23d36e69"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-beamertheme-rainbow-doc"

RDEPENDS:${PN} += ""

inherit rpm
