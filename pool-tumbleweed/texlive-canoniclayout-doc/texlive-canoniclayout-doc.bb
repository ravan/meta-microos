SUMMARY = "Documentation for texlive-canoniclayout"
DESCRIPTION = "This package includes the documentation for texlive-canoniclayout"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn64889"

RPM_NAME = "texlive-canoniclayout-doc-2026.226.1.0svn64889-59.2.noarch.rpm"
RPM_HASH = "8bb80c920a8002fcedc1a26588f2e37275da1c72069d9386276385d8d2a3a1978381820130df0bb1d852de1b790040a6617539e3e084b54439f26f21401bd56f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-canoniclayout-doc"

RDEPENDS:${PN} += ""

inherit rpm
