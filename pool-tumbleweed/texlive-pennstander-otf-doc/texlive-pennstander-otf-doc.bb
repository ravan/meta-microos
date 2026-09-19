SUMMARY = "Documentation for texlive-pennstander-otf"
DESCRIPTION = "This package includes the documentation for texlive-pennstander-otf"
LICENSE = "OFL-1.1"

PV = "2026.226.0.0.3asvn77682"

RPM_NAME = "texlive-pennstander-otf-doc-2026.226.0.0.3asvn77682-58.2.noarch.rpm"
RPM_HASH = "93709abad5c6f44dc446113a1b6fdba0240187e72f84bd366e4c85ec648b9a4320b8a538f7d66398e4556e072244bd3f007e18f159703d94ff2833c593055c60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pennstander-otf-doc"

RDEPENDS:${PN} += ""

inherit rpm
